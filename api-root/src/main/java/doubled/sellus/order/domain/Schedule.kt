package doubled.sellus.order.domain

import java.time.OffsetDateTime

data class Schedule(
    val location: String,
    val meetAt: OffsetDateTime,
)
