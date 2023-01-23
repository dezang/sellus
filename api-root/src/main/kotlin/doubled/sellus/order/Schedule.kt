package doubled.sellus.order

import java.time.OffsetDateTime

data class Schedule(
    val location: String,
    val meetAt: OffsetDateTime,
) {
}
