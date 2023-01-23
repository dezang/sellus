package doubled.sellus.user

import doubled.sellus.user.adapter.out.persistence.UserJpaRepository
import doubled.sellus.user.domain.User
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserReaderImpl(
    private val userJpaRepository: UserJpaRepository
) : UserReader {

    @Transactional(readOnly = true)
    override fun getById(userId: Long): User {
        val foundUser = userJpaRepository.findByIdOrNull(userId)
            ?: throw NoSuchElementException()
        return foundUser.toDomain()
    }
}
