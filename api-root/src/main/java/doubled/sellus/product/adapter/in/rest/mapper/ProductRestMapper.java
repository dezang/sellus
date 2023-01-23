package doubled.sellus.product.adapter.in.rest.mapper;

import doubled.sellus.product.adapter.in.rest.request.ProductCreateRequest;
import doubled.sellus.product.domain.CreateProductDomain;
import org.springframework.stereotype.Component;

@Component
public class ProductRestMapper {

    public CreateProductDomain toCreateProductDomain(ProductCreateRequest productCreateRequest) {
        return new CreateProductDomain(productCreateRequest.getMentorId(), productCreateRequest.getSchedules(), productCreateRequest.getPrice());
    }

}
