package doubled.sellus.api

import doubled.sellus.user.UserReader
import doubled.sellus.user.UserSignUpService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController(
    val userSignUpService: UserSignUpService,
    val userReader: UserReader,
) {
    @PostMapping
    fun add(@RequestBody request: UserRequest): ResponseEntity<Void> {
        userSignUpService.signUp(request.email)
        return ResponseEntity.ok().build()
    }

    @GetMapping("{userId}")
    fun get(@PathVariable userId: Long): ResponseEntity<UserView> {
        val foundUser = userReader.getById(userId)
        return ResponseEntity.ok().body(UserView.of(foundUser))
    }
}