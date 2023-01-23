package doubled.sellus.product.domain;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.List;

public class ProductDomain implements Product {

    private final Long id;
    private final Long mentorId;
    private final List<Schedule> schedules;
    private final BigDecimal price;

    public ProductDomain(Long id, Long mentorId, List<Schedule> schedules, BigDecimal price) {
        this.id = id;
        this.mentorId = mentorId;
        this.schedules = schedules;
        this.price = price;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public long getMentorId() {
        return this.mentorId;
    }

    @NotNull
    @Override
    public List<Schedule> getSchedules() {
        return this.schedules;
    }

    @NotNull
    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

}
