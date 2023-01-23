package doubled.sellus.order.adapter.out.persistence

import doubled.sellus.order.domain.Schedule
import jakarta.persistence.Embeddable
import java.time.OffsetDateTime

@Embeddable
data class ScheduleDataModel(
    var location: String,
    var meetAt: OffsetDateTime,
) {
    fun toDomain(): Schedule {
        return Schedule(
            location = location,
            meetAt = meetAt
        )
    }
}
