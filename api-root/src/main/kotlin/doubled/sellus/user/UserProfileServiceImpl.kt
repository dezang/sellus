package doubled.sellus.user

import doubled.sellus.user.adapter.out.persistence.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserProfileServiceImpl(
    private val userRepository: UserRepository
) : UserProfileService {

    @Transactional
    override fun update(userId: Long, command: UserProfileUpdate) {
        val foundUser = userRepository.findByIdOrNull(userId) ?: throw NoSuchElementException()
        foundUser.update(command)
    }
}
