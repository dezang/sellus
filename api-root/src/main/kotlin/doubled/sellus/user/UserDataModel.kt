package doubled.sellus.user

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
) : User {
    override fun getId(): Long {
        return id ?: throw IllegalStateException()
    }

    override fun getEmail(): String {
        return email
    }

    override fun getNickName(): String? {
        return nickName
    }

    override fun getExperiences(): List<String> {
        if (experiences.isNullOrEmpty()) return emptyList()
        return experiences!!.split(",").map { it.trim() }.toList()
    }

    override fun getCareers(): List<CareerDataModel> {
        return careers
    }

    override fun getIntro(): String? {
        return intro
    }

    fun update(command: UserProfileUpdate) {
        this.nickName = command.nickName
        this.intro = command.intro
        this.experiences = command.experiences?.joinToString()
        this.updatedAt = OffsetDateTime.now()
    }
}
