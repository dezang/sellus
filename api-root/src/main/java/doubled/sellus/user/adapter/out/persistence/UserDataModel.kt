package doubled.sellus.user.adapter.out.persistence

import doubled.sellus.user.domain.User
import doubled.sellus.user.UserProfileUpdate
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import java.time.OffsetDateTime

@Entity
@Table(name = "users")
data class UserDataModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long?,
    private val email: String,
    private var nickName: String?,
    private var intro: String?,
    private var experiences: String?,
    @OneToMany(mappedBy = "user")
    private var careers: List<CareerDataModel>,
    val createdAt: OffsetDateTime,
    var updatedAt: OffsetDateTime,
) {
    fun toDomain(): User = User(
        id = id!!,
        email = email,
        nickName = nickName,
        intro = intro,
        experiences = getExperiences(),
        careers = careers.map { it.toDomain() },
    )

    private fun getExperiences(): List<String> {
        if (experiences.isNullOrEmpty()) return emptyList()
        return experiences!!.split(",").map { it.trim() }.toList()
    }

    fun update(command: UserProfileUpdate) {
        this.nickName = command.nickName
        this.intro = command.intro
        this.experiences = command.experiences?.joinToString()
        this.updatedAt = OffsetDateTime.now()
    }
}
