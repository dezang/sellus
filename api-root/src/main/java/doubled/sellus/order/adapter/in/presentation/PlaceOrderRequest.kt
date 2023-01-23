package doubled.sellus.order.adapter.`in`.presentation

import java.time.OffsetDateTime

data class PlaceOrderRequest(
    val menteeId: Long,
    val productId: Long,
    val meetAt: OffsetDateTime,
    val topics: List<String>
) {
}
