package doubled.sellus.product.adapter.out;

import doubled.sellus.product.application.port.out.CreateProductPort;
import doubled.sellus.product.application.port.out.LoadProductPort;
import doubled.sellus.product.domain.CreateProductDomain;
import doubled.sellus.product.domain.Product;
import doubled.sellus.product.domain.Schedule;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
class ProductPersistenceAdapter implements LoadProductPort, CreateProductPort {

    private final ProductRepository productRepository;
    private final ScheduleRepository scheduleRepository;
    private final ProductMapper productMapper;
    private final ScheduleMapper scheduleMapper;

    @Override
    public Product loadProductById(Long productId) {
        ProductJpaEntity productJpaEntity = productRepository.findById(productId).orElseThrow(EntityNotFoundException::new);
        List<ScheduleJpaEntity> scheduleJpaEntities = scheduleRepository.findByProductId(productId).orElseGet(ArrayList::new);
        List<Schedule> schedules = scheduleMapper.mapToDomainEntity(scheduleJpaEntities);
        return productMapper.mapToDomainEntity(productJpaEntity, schedules);
    }

    @Override
    public Product loadProductByMentorId(long mentorId) {
        ProductJpaEntity productJpaEntity = productRepository.findByMentorId(mentorId).orElseThrow(EntityNotFoundException::new);
        Long productId = productJpaEntity.getId();
        List<ScheduleJpaEntity> scheduleJpaEntities = scheduleRepository.findByProductId(productId).orElseGet(ArrayList::new);
        List<Schedule> schedules = scheduleMapper.mapToDomainEntity(scheduleJpaEntities);
        return productMapper.mapToDomainEntity(productJpaEntity, schedules);
    }

    @Override
    public Product createProduct(CreateProductDomain product) {
        ProductJpaEntity productJpaEntity = productMapper.toProductEntity(product);
        ProductJpaEntity savedProduct = productRepository.save(productJpaEntity);

        List<ScheduleJpaEntity> scheduleJpaEntities = scheduleMapper.toScheduleEntity(product, savedProduct.getId());
        scheduleRepository.saveAll(scheduleJpaEntities);
        List<Schedule> schedules = scheduleMapper.mapToDomainEntity(scheduleJpaEntities);

        return productMapper.mapToDomainEntity(savedProduct, schedules);
    }

}
