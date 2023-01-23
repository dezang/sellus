package doubled.sellus.product.adapter.in.rest;

import doubled.sellus.product.adapter.in.rest.mapper.ProductRestMapper;
import doubled.sellus.product.adapter.in.rest.request.ProductCreateRequest;
import doubled.sellus.product.application.port.in.CreateProductUseCase;
import doubled.sellus.product.application.port.in.GetProductUseCase;
import doubled.sellus.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController implements ProductReader, ProductCreator {

    private final GetProductUseCase getProductUseCase;
    private final CreateProductUseCase createProductUseCase;
    private final ProductRestMapper productRestMapper;

    @GetMapping("/{productId}")
    @Nullable
    @Override
    public Product getById(@PathVariable("productId") long id) {
        return getProductUseCase.getProductById(id);
    }

    @GetMapping("/mentor/{mentorId}")
    @Nullable
    @Override
    public Product getByMentorId(@PathVariable("mentorId") long mentorId) {
        return getProductUseCase.getProductByMentorId(mentorId);
    }

    @PostMapping
    @Nullable
    @Override
    public Product createProduct(@RequestBody @NotNull ProductCreateRequest product) {
        return createProductUseCase.createProduct(productRestMapper.toProduct(product));
    }

}
