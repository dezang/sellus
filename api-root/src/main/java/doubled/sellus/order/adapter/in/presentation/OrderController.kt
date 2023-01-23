package doubled.sellus.order.adapter.`in`.presentation

import doubled.sellus.order.application.PlaceOrderCommand
import doubled.sellus.order.application.PlaceOrderUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("orders")
class OrderController(
    private val placeOrderUseCase: PlaceOrderUseCase
) {
    @PostMapping
    fun add(@RequestBody request: PlaceOrderRequest): ResponseEntity<Void> {
        placeOrderUseCase.place(PlaceOrderCommand(
            menteeId = request.menteeId,
            productId = request.productId,
            meetAt = request.meetAt,
            topics = request.topics
        ))
        return ResponseEntity.ok().build()
    }
}
