package doubled.sellus.order.adapter.out.persistence

import doubled.sellus.order.domain.Order
import doubled.sellus.order.domain.OrderStatus
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Lob
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "orders")
class OrderDataModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val mentorId: Long,
    val menteeId: Long,
    val productId: Long,
    @Column(scale = 2, precision = 12)
    var price: BigDecimal,
    var schedule: ScheduleDataModel,
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    var status: OrderStatus,
    @Lob
    var topics: String,
) {
    fun toDomain(): Order {
        return Order(
            id = id!!,
            mentorId = mentorId,
            menteeId = menteeId,
            productId = productId,
            price = price,
            schedule = schedule.toDomain(),
            status = status,
            topics = topics.split(",").map { it.trim() }
        )
    }
}
