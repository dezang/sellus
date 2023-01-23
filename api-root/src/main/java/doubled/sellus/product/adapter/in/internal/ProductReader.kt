package doubled.sellus.product.adapter.`in`.internal

import doubled.sellus.product.domain.Product

interface ProductReader {

    fun getById(id: Long): Product?
    fun getByMentorId(mentorId: Long): Product?

}
