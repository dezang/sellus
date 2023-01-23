package doubled.sellus.user.domain

import java.time.LocalDate

class UserCareer(
    var id: Long?,
    var startAt: LocalDate,
    var endAt: LocalDate?,
    var companyName: String,
)
