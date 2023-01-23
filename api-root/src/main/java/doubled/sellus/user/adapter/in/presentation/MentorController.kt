package doubled.sellus.user.adapter.`in`.presentation

import doubled.sellus.user.RegisterMentorUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("mentors")
class MentorController(
    private val registerMentorUseCase: RegisterMentorUseCase,
) {
    @PostMapping("register")
    fun register(@RequestBody request: MentorRegisterRequest): ResponseEntity<Void> {
        registerMentorUseCase.register(request.userId, request.bankAccount)
        return ResponseEntity.ok().build()
    }
}

data class MentorRegisterRequest(
    val userId: Long,
    val bankAccount: String,
)
