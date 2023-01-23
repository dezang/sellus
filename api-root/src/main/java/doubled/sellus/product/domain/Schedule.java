package doubled.sellus.product.domain;

import java.time.LocalDateTime;

public class Schedule {

    private final String location;
    private final LocalDateTime meetAt;

    public Schedule(String location, LocalDateTime meetAt) {
        this.location = location;
        this.meetAt = meetAt;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getMeetAt() {
        return meetAt;
    }

}
