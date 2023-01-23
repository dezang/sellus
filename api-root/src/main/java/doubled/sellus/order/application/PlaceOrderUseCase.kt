package doubled.sellus.order.application

interface PlaceOrderUseCase {
    fun place(command: PlaceOrderCommand)
}
