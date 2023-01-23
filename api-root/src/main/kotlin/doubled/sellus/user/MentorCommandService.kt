package doubled.sellus.user

import doubled.sellus.user.adapter.out.persistence.MentorDataModel
import doubled.sellus.user.adapter.out.persistence.MentorJpaRepository
import org.springframework.stereotype.Service
import java.time.OffsetDateTime

@Service
internal class MentorCommandService(
    private val mentorJpaRepository: MentorJpaRepository
) : RegisterMentorUseCase {

    override fun register(userId: Long, bankAccount: String) {
        mentorJpaRepository.save(
            MentorDataModel(
                id = null,
                userId = userId,
                bankAccount = bankAccount,
                registeredAt = OffsetDateTime.now(),
                updatedAt = OffsetDateTime.now(),
            )
        )
    }
}
