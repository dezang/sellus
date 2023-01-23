package doubled.sellus.product.adapter.out;

import doubled.sellus.product.domain.CreateProductDomain;
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

    public List<ScheduleJpaEntity> toScheduleEntity(CreateProductDomain product, Long productId) {
        List<Schedule> schedules = product.getSchedules();
        return schedules.stream()
            .map(schedule -> ScheduleJpaEntity.builder()
                .productId(productId)
                .meetAt(schedule.getMeetAt())
                .location(schedule.getLocation())
                .build())
            .collect(Collectors.toList());
    }

}
