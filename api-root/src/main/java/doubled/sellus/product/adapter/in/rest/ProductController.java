package doubled.sellus.product.adapter.in.rest;

import doubled.sellus.product.adapter.in.rest.mapper.ProductRestMapper;
import doubled.sellus.product.adapter.in.rest.request.ProductCreateRequest;
import doubled.sellus.product.application.port.in.CreateProductUseCase;
import doubled.sellus.product.application.port.in.GetProductUseCase;
import doubled.sellus.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final GetProductUseCase getProductUseCase;
    private final CreateProductUseCase createProductUseCase;
    private final ProductRestMapper productRestMapper;

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getById(@PathVariable("productId") long id) {
        return new ResponseEntity<>(getProductUseCase.getProductById(id), HttpStatus.OK);
    }

    @GetMapping("/mentor/{mentorId}")
    public ResponseEntity<Product> getByMentorId(@PathVariable("mentorId") long mentorId) {
        return new ResponseEntity<>(getProductUseCase.getProductByMentorId(mentorId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody @NotNull ProductCreateRequest product) {
        return new ResponseEntity<>(createProductUseCase.createProduct(productRestMapper.toCreateProductDomain(product)), HttpStatus.OK);
    }

}
