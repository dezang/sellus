package doubled.sellus.order

interface OrderReader<Order> {
    fun getById(id: Long): Order?
}
