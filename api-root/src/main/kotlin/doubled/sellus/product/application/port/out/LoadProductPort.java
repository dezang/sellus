package doubled.sellus.product.application.port.out;

import doubled.sellus.product.domain.Product;

public interface LoadProductPort {

    Product loadProductById(Long id);

}
