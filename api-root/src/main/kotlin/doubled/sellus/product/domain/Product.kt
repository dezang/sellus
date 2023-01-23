package doubled.sellus.product.domain

import java.math.BigDecimal

interface Product {

    fun getId(): Long
    fun getMentorId(): Long
    fun getSchedules(): List<Schedule>
    fun getPrice(): BigDecimal

}
