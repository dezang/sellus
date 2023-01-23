package doubled.sellus.user.adapter.`in`.presentation

import doubled.sellus.user.domain.User

data class UserView(
    val id: Long,
    val email: String,
    val nickName: String?,
    val intro: String?,
    val experiences: List<String>

) {
    companion object {
        fun of(domain: User): UserView {
            return UserView(
                id = domain.id,
                email = domain.email,
                nickName = domain.nickName,
                intro = domain.intro,
                experiences = domain.experiences,
            )
        }
    }
}
