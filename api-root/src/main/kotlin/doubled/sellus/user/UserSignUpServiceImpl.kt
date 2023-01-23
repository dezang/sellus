package doubled.sellus.user

import org.springframework.stereotype.Service

@Service
class UserSignUpServiceImpl(
    val userRepository: UserRepository
) : UserSignUpService {
    override fun signUp(email: String) {
        val newUser = UserDataModel(
            id = null,
            email = email
        )
        userRepository.save(newUser)
    }
}
