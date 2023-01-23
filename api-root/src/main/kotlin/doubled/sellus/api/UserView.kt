package doubled.sellus.api

import doubled.sellus.user.User

data class UserView(
    val id: Long,
    val email: String,
) {
    companion object {
        fun of(domain: User): UserView {
            return UserView(
                id = domain.getId(),
                email = domain.getEmail()
            )
        }
    }
}
