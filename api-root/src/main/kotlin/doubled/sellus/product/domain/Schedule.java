package doubled.sellus.product.domain;

public class Schedule {

    private final String location;
    private final String meetAt;

    public Schedule(String location, String meetAt) {
        this.location = location;
        this.meetAt = meetAt;
    }

    public String getLocation() {
        return location;
    }

    public String getMeetAt() {
        return meetAt;
    }

}
