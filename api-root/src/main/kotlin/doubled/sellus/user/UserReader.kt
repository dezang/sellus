package doubled.sellus.user

interface UserReader {
    fun getById(userId: Long): User
}
