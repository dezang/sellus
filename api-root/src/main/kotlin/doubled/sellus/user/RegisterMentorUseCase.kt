package doubled.sellus.user

interface RegisterMentorUseCase {
    fun register(userId: Long, bankAccount: String)
}
