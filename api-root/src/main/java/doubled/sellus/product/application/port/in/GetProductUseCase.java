package doubled.sellus.product.application.port.in;

import doubled.sellus.product.domain.Product;

public interface GetProductUseCase {

    Product getProductById(long productId);

    Product getProductByMentorId(long mentorId);

}
