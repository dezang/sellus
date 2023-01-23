package doubled.sellus.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.OffsetDateTime

@Entity
@Table(name = "mentor")
class MentorDataModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    val userId: Long,
    val registeredAt: OffsetDateTime,
    var bankAccount: String?,
    var updatedAt: OffsetDateTime,
) {

}
