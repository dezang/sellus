package doubled.sellus.product.adapter.`in`.rest

import doubled.sellus.product.adapter.`in`.rest.request.ProductCreateRequest
import doubled.sellus.product.domain.Product
import org.springframework.http.ResponseEntity

interface ProductCreator {

    fun createProduct(product: ProductCreateRequest): ResponseEntity<Product>?

}