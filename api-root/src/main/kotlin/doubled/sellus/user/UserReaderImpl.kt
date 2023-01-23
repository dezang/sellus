package doubled.sellus.user

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserReaderImpl(
    private val userRepository: UserRepository
) : UserReader {
    override fun getById(userId: Long): User {
        return userRepository.findByIdOrNull(userId)?: throw NoSuchElementException()
    }
}
