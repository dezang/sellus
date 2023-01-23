package doubled.sellus.product.application.service;

import doubled.sellus.product.application.port.in.GetProductUseCase;
import doubled.sellus.product.application.port.out.LoadProductPort;
import doubled.sellus.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class GetProductService implements GetProductUseCase {

    private final LoadProductPort loadProductPort;

    @Override
    public Product getProductById(long productId) {
        return loadProductPort.loadProductById(productId);
    }

    @Override
    public Product getProductByMentorId(long mentorId) {
        return loadProductPort.loadProductByMentorId(mentorId);
    }

}
