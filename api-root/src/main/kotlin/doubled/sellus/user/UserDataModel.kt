package doubled.sellus.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class UserDataModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long?,
    private val email: String,
) : User {
    override fun getId(): Long {
        return id ?: throw IllegalStateException()
    }

    override fun getEmail(): String {
        return email
    }

    override fun getNickName(): String {
        TODO("Not yet implemented")
    }

    override fun getExperiences(): ArrayList<String> {
        TODO("Not yet implemented")
    }

    override fun getCareer(): ArrayList<Career> {
        TODO("Not yet implemented")
    }

    override fun getIntro(): String {
        TODO("Not yet implemented")
    }
}
