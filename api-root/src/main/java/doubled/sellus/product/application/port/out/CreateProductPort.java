package doubled.sellus.product.application.port.out;

import doubled.sellus.product.domain.CreateProductDomain;
import doubled.sellus.product.domain.Product;

public interface CreateProductPort {

    Product createProduct(CreateProductDomain product);

}
