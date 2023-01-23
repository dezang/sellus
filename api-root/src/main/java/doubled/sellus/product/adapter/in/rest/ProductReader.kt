package doubled.sellus.product.adapter.`in`.rest

import doubled.sellus.product.domain.Product

interface ProductReader {

    fun getById(id: Long): Product?
    fun getByMentorId(mentorId: Long): Product?

}
