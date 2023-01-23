package doubled.sellus.user

import org.springframework.stereotype.Service
import java.time.OffsetDateTime

@Service
class UserSignUpServiceImpl(
    val userRepository: UserRepository
) : UserSignUpService {
    override fun signUp(email: String) {
        val newUser = UserDataModel(
            email = email,
            id = null,
            nickName = null,
            careers = emptyList(),
            experiences = null,
            intro = null,
            createdAt = OffsetDateTime.now(),
            updatedAt = OffsetDateTime.now(),
        )
        userRepository.save(newUser)
    }
}
