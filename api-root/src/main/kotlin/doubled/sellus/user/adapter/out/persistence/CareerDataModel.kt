package doubled.sellus.user.adapter.out.persistence

import doubled.sellus.user.domain.UserCareer
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.LocalDate
import java.time.OffsetDateTime

@Entity
@Table(name = "user_career")
class CareerDataModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var startAt: LocalDate,
    @Column(nullable = true)
    var endAt: LocalDate?,
    var companyName: String,
    @ManyToOne
    @JoinColumn(name = "userId")
    val user: UserDataModel,
    val createdAt: OffsetDateTime,
    var updatedAt: OffsetDateTime,
) {
    fun toDomain(): UserCareer {
        return UserCareer(
            id = id,
            startAt = startAt,
            endAt = endAt,
            companyName = companyName,
        )
    }
}
