package doubled.sellus.review

interface Review {
    fun getId(): Long
    fun getProductId(): Long
    fun getOrderId(): Long
    fun getAuthorId(): Long
    fun getContent(): String
}
