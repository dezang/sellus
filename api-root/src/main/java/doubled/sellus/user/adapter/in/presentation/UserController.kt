package doubled.sellus.user.adapter.`in`.presentation

import doubled.sellus.user.UserProfileService
import doubled.sellus.user.UserProfileUpdate
import doubled.sellus.user.UserReader
import doubled.sellus.user.UserSignUpService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController(
    val userReader: UserReader,
    val userSignUpService: UserSignUpService,
    val userProfileService: UserProfileService,
) {
    @PostMapping
    fun add(@RequestBody request: UserSignupRequest): ResponseEntity<Void> {
        userSignUpService.signUp(request.email)
        return ResponseEntity.ok().build()
    }

    @GetMapping("{userId}")
    fun get(@PathVariable userId: Long): ResponseEntity<UserView> {
        val foundUser = userReader.getById(userId)
        return ResponseEntity.ok().body(UserView.of(foundUser))
    }

    @PutMapping("{userId}")
    fun update(@PathVariable userId: Long, @RequestBody request: UserProfileUpdate): ResponseEntity<Void> {
        userProfileService.update(userId, request)
        return ResponseEntity.ok().build()
    }
}
