package doubled.sellus.api

import doubled.sellus.user.User

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
                id = domain.getId(),
                email = domain.getEmail(),
                nickName = domain.getNickName(),
                intro = domain.getIntro(),
                experiences = domain.getExperiences(),
            )
        }
    }
}
