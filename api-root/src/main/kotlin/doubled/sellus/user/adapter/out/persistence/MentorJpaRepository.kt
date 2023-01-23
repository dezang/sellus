package doubled.sellus.user.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface MentorJpaRepository: JpaRepository<MentorDataModel, Long> {
}
