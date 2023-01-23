package doubled.sellus.product.adapter.out;

import doubled.sellus.product.domain.Schedule;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
class ScheduleMapper {

    public List<Schedule> mapToDomainEntity(List<ScheduleJpaEntity> scheduleJpaEntities) {
        return scheduleJpaEntities.stream()
            .map(scheduleJpaEntity -> new Schedule(scheduleJpaEntity.getLocation(), scheduleJpaEntity.getMeetAt()))
            .collect(Collectors.toList());
    }

}
