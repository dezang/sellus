package doubled.sellus.user.domain

class User(
    var id: Long,
    val email: String,
    var nickName: String?,
    var intro: String?,
    var experiences: List<String>,
    var careers: List<UserCareer>,
) {
}
