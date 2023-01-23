package doubled.sellus.product.adapter.in.internal;

import doubled.sellus.product.adapter.in.rest.mapper.ProductRestMapper;
import doubled.sellus.product.adapter.in.rest.request.ProductCreateRequest;
import doubled.sellus.product.application.port.in.CreateProductUseCase;
import doubled.sellus.product.application.port.in.GetProductUseCase;
import doubled.sellus.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiredArgsConstructor
public class InternalProductAdapter implements ProductReader, ProductCreator {

    private final GetProductUseCase getProductUseCase;
    private final CreateProductUseCase createProductUseCase;
    private final ProductRestMapper productRestMapper;

    @Nullable
    @Override
    public Product getById(long id) {
        return getProductUseCase.getProductById(id);
    }

    @Nullable
    @Override
    public Product getByMentorId(long mentorId) {
        return getProductUseCase.getProductByMentorId(mentorId);
    }

    @Nullable
    @Override
    public Product createProduct(@NotNull ProductCreateRequest product) {
        return createProductUseCase.createProduct(productRestMapper.toCreateProductDomain(product));
    }

}
