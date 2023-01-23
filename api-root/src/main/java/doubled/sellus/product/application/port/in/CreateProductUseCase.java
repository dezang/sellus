package doubled.sellus.product.application.port.in;

import doubled.sellus.product.domain.Product;

public interface CreateProductUseCase {

    Product createProduct(Product product);

}
