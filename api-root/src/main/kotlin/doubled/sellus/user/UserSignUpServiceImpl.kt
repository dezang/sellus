package doubled.sellus.user

import org.springframework.stereotype.Service

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
        )
        userRepository.save(newUser)
    }
}
