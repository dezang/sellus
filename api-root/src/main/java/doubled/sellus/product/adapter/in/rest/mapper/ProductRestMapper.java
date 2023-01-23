 package doubled.sellus.product.adapter.in.rest.mapper;

import doubled.sellus.product.adapter.in.rest.request.ProductCreateRequest;
import doubled.sellus.product.domain.Product;
import doubled.sellus.product.domain.ProductDomain;

public class ProductRestMapper {

    public Product toProduct(ProductCreateRequest productCreateRequest) {
        ProductDomain productDomain = new ProductDomain(null, productCreateRequest.getMentorId(), null, null);
        return productDomain;
    }

}
