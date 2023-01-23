package doubled.sellus.user

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDate
import java.time.OffsetDateTime

@Entity
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
)
