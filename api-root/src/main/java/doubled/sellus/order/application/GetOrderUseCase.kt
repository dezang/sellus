package doubled.sellus.order.application

import doubled.sellus.order.domain.Order

interface GetOrderUseCase {
    fun getById(orderId: Long): Order?
    fun listByMentorId(mentorId: Long): List<Order>
}
