package doubled.sellus.product.adapter.out;

import doubled.sellus.product.domain.ProductDomain;
import doubled.sellus.product.domain.Schedule;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class ProductMapper {

    ProductDomain mapToDomainEntity(ProductJpaEntity product, List<Schedule> schedules) {
        return new ProductDomain(product.getId(), product.getMentorId(), schedules, product.getPrice());
    }

}
