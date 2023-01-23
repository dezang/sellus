package doubled.sellus.order.application

import doubled.sellus.order.adapter.out.persistence.OrderDataModel
import doubled.sellus.order.adapter.out.persistence.OrderJpaRepository
import doubled.sellus.order.adapter.out.persistence.ScheduleDataModel
import doubled.sellus.order.domain.OrderStatus
import doubled.sellus.product.adapter.`in`.internal.ProductReader
import org.springframework.stereotype.Service

@Service
class OrderCommandService(
    private val orderJpaRepository: OrderJpaRepository,
    private val productReader: ProductReader,
) : PlaceOrderUseCase {

    override fun place(command: PlaceOrderCommand) {
        val product = productReader.getById(command.productId)
            ?: throw NoSuchElementException()
        val matchedSchedule = product.getSchedules().find { schedule ->
            schedule.meetAt.equals(command.meetAt)
        } ?: throw IllegalStateException()

        orderJpaRepository.save(
            OrderDataModel(
                id = null,
                mentorId = product.getMentorId(),
                menteeId = command.menteeId,
                productId = product.getId(),
                price = product.getPrice(),
                schedule = ScheduleDataModel(matchedSchedule.location, command.meetAt),
                status = OrderStatus.REQUESTED,
                topics = command.topics.joinToString()
            )
        )
    }
}
