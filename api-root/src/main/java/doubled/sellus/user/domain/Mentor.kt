package doubled.sellus.user.domain

import java.time.OffsetDateTime

class Mentor(
    val id: Long,
    val user: User,
    val registeredAt: OffsetDateTime,
    var bankAccount: String,
) {
}
