package doubled.sellus.user

import doubled.sellus.user.adapter.out.persistence.UserJpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserProfileServiceImpl(
    private val userJpaRepository: UserJpaRepository
) : UserProfileService {

    @Transactional
    override fun update(userId: Long, command: UserProfileUpdate) {
        val foundUser = userJpaRepository.findByIdOrNull(userId) ?: throw NoSuchElementException()
        foundUser.update(command)
    }
}
