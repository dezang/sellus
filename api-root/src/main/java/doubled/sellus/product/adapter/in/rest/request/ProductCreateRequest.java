package doubled.sellus.product.adapter.in.rest.request;

import doubled.sellus.product.domain.Schedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateRequest {

    private Long mentorId;
    private List<Schedule> schedules;
    private BigDecimal price;

}
