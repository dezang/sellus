package doubled.sellus.product.adapter.`in`.internal

import doubled.sellus.product.domain.CreateProductDomain
import doubled.sellus.product.domain.Product

interface ProductCreator {

    fun createProduct(product: CreateProductDomain): Product?

}