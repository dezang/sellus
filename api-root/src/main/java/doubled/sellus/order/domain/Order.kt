package doubled.sellus.order.domain

import java.math.BigDecimal

class Order(
    val id: Long,
    val mentorId: Long,
    val menteeId: Long,
    val productId: Long,
    var price: BigDecimal,
    var schedule: Schedule,
    var status: OrderStatus,
    var topics: List<String>
)
