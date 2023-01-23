package doubled.sellus.user

interface UserProfileService {
    fun update(userId: Long, command: UserProfileUpdate)
}
