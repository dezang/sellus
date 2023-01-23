package doubled.sellus.product.adapter.out;

import doubled.sellus.product.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ScheduleRepository extends JpaRepository<ScheduleJpaEntity, Long> {

    Optional<List<Schedule>> findByProductId(Long productId);

}
