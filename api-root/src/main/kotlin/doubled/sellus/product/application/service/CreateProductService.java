package doubled.sellus.product.application.service;

import doubled.sellus.product.application.port.in.CreateProductUseCase;
import doubled.sellus.product.application.port.out.CreateProductPort;
import doubled.sellus.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateProductService implements CreateProductUseCase {

    private final CreateProductPort createProductPort;

    @Override
    public Product createProduct(Product product) {
        return createProductPort.createProduct(product);
    }

}
