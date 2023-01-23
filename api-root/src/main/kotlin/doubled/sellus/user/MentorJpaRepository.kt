package doubled.sellus.user

import org.springframework.data.jpa.repository.JpaRepository

interface MentorJpaRepository: JpaRepository<MentorDataModel, Long> {
}
