package doubled.sellus.product.adapter.out;

import doubled.sellus.product.application.port.out.LoadProductPort;
import doubled.sellus.product.domain.Product;
import doubled.sellus.product.domain.Schedule;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
class ProductPersistenceAdapter implements LoadProductPort {

    private final ProductRepository productRepository;
    private final ScheduleRepository scheduleRepository;
    private final ProductMapper productMapper;

    @Override
    public Product loadProductById(Long productId) {
        ProductJpaEntity productJpaEntity = productRepository.findById(productId).orElseThrow(EntityNotFoundException::new);
        List<Schedule> schedules = scheduleRepository.findByProductId(productId).orElseGet(ArrayList::new);
        return productMapper.mapToDomainEntity(productJpaEntity, schedules);
    }

    @Override
    public Product loadProductByMentorId(long mentorId) {
        ProductJpaEntity productJpaEntity = productRepository.findByMentorId(mentorId).orElseThrow(EntityNotFoundException::new);
        Long productId = productJpaEntity.getId();
        List<Schedule> schedules = scheduleRepository.findByProductId(productId).orElseGet(ArrayList::new);
        return productMapper.mapToDomainEntity(productJpaEntity, schedules);
    }

}
