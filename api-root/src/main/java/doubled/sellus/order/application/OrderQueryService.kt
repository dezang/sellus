package doubled.sellus.order.application

import doubled.sellus.order.adapter.out.persistence.OrderDataModel
import doubled.sellus.order.adapter.out.persistence.OrderJpaRepository
import doubled.sellus.order.domain.Order
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class OrderQueryService(
    private val orderJpaRepository: OrderJpaRepository,
): GetOrderUseCase {
    override fun getById(orderId: Long): Order {
        val orderDataModel: OrderDataModel = orderJpaRepository.findByIdOrNull(orderId) ?: throw NoSuchElementException()
        return orderDataModel.toDomain()
    }

    override fun listByMentorId(mentorId: Long): List<Order> {
        return orderJpaRepository.findByMentorId(mentorId).map { it.toDomain() }
    }
}
