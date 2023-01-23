package doubled.sellus.user

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDate

@Entity
class CareerDataModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val startAt: LocalDate,
    @Column(nullable = true)
    var endAt: LocalDate?,
    val companyName: String,
    @ManyToOne
    @JoinColumn(name = "userId")
    val user: UserDataModel,
)
