package doubled.sellus.user

import doubled.sellus.user.domain.User

interface UserReader {
    fun getById(userId: Long): User
}
