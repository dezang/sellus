package doubled.sellus.product.adapter.out;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_schedule")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class ScheduleJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private String location;
    private LocalDateTime meetAt;

}
