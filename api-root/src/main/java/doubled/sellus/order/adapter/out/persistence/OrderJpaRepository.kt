package doubled.sellus.order.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface OrderJpaRepository: JpaRepository<OrderDataModel, Long> {
    fun findByMentorId(mentorId: Long): List<OrderDataModel>
}
