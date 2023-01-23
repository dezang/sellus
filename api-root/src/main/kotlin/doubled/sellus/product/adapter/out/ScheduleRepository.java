package doubled.sellus.product.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

interface ScheduleRepository extends JpaRepository<ScheduleJpaEntity, Long> {

    Optional<List<ScheduleJpaEntity>> findByProductId(Long productId);

}
