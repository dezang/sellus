package doubled.sellus.product

import doubled.sellus.order.Schedule
import java.math.BigDecimal
import java.time.OffsetDateTime

interface Product {
    fun getId(): Long
    fun getMentorId(): Long
    fun getSchedules(after: OffsetDateTime,  size: Int): ArrayList<Schedule>
    fun getPrice(): BigDecimal
}
