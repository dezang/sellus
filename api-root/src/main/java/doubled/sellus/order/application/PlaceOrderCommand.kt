package doubled.sellus.order.application

import java.time.OffsetDateTime

data class PlaceOrderCommand(
    val menteeId: Long,
    val productId: Long,
    val meetAt: OffsetDateTime,
    val topics: List<String>
)
