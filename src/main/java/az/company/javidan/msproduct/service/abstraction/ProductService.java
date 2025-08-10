package az.company.javidan.msproduct.service.abstraction;

import az.company.javidan.msproduct.model.response.ProductResponse;
import az.company.javidan.msproduct.model.reuquest.CreateProductRequest;

public interface ProductService {

    void createProduct(CreateProductRequest createProductRequest);

    ProductResponse getProductById(Long id);
}
