package az.company.javidan.msproduct.service.abstraction;

import az.company.javidan.msproduct.model.response.ProductResponse;
import az.company.javidan.msproduct.model.reuquest.CreateProductRequest;
import az.company.javidan.msproduct.model.reuquest.ReduceQuantityRequest;

public interface ProductService {

    void createProduct(CreateProductRequest createProductRequest);

    ProductResponse getProductById(Long id);

    void reduceQuantity(ReduceQuantityRequest reduceQuantityRequest);
}
