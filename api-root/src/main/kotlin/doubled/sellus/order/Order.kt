package doubled.sellus.order

import java.math.BigDecimal

interface Order {
    fun getId(): Long
    fun getMentorId(): Long
    fun getMenteeId(): Long
    fun getProductId(): Long
    fun getPrice(): BigDecimal
    fun getSchedule(): Schedule
    fun getStatus(): String
    fun getTopics(): ArrayList<String>
}
