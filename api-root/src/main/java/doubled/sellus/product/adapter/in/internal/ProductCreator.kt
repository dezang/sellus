package doubled.sellus.product.adapter.`in`.internal

import doubled.sellus.product.adapter.`in`.rest.request.ProductCreateRequest
import doubled.sellus.product.domain.Product

interface ProductCreator {

    fun createProduct(product: ProductCreateRequest): Product?

}