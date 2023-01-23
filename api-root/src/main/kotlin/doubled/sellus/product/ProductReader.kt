package doubled.sellus.product

interface ProductReader {
    fun getById(id: Long): Product?
    fun getByMentorId(mentorId: Long): Product?
}
