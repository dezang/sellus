package doubled.sellus.product.domain;

import java.math.BigDecimal;
import java.util.List;

public class CreateProductDomain {

    private final Long mentorId;
    private final List<Schedule> schedules;
    private final BigDecimal price;

    public CreateProductDomain(Long mentorId, List<Schedule> schedules, BigDecimal price) {
        this.mentorId = mentorId;
        this.schedules = schedules;
        this.price = price;
    }

    public Long getMentorId() {
        return mentorId;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
