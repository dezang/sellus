package doubled.sellus.product.adapter.in.rest;

import doubled.sellus.product.application.port.in.GetProductUseCase;
import doubled.sellus.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Nullable;

@RequiredArgsConstructor
public class ProductController implements ProductReader {

    private final GetProductUseCase getProductUseCase;

    @Nullable
    @Override
    public Product getById(long id) {
        return getProductUseCase.getProductById(id);
    }

    @Nullable
    @Override
    public Product getByMentorId(long mentorId) {
        return null;
    }

}
