package doubled.sellus.product.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface ProductRepository extends JpaRepository<ProductJpaEntity, Long> {

    Optional<ProductJpaEntity> findByMentorId(Long mentorId);

}
