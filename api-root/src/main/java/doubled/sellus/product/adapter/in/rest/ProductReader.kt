package doubled.sellus.product.adapter.`in`.rest

import doubled.sellus.product.domain.Product
import org.springframework.http.ResponseEntity

interface ProductReader {

    fun getById(id: Long): ResponseEntity<Product>?
    fun getByMentorId(mentorId: Long): ResponseEntity<Product>?

}
