package az.company.javidan.msproduct.service.concrete;

import az.company.javidan.msproduct.dao.repository.ProductRepository;
import az.company.javidan.msproduct.exception.NotFoundException;
import az.company.javidan.msproduct.model.response.ProductResponse;
import az.company.javidan.msproduct.model.reuquest.CreateProductRequest;
import az.company.javidan.msproduct.service.abstraction.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static az.company.javidan.msproduct.mapper.ProductMapper.PRODUCT_MAPPER;
import static az.company.javidan.msproduct.model.enums.ErrorMessage.PRODUCT_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class ProductServiceHandler implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public void createProduct(CreateProductRequest createProductRequest) {
        productRepository.save(PRODUCT_MAPPER.buildProductEntity(createProductRequest));
    }

    @Override
    public ProductResponse getProductById(Long id) {
        return productRepository.findById(id)
                .map(PRODUCT_MAPPER::buildProductResponse)
                .orElseThrow(() -> new NotFoundException(
                        String.format(
                                PRODUCT_NOT_FOUND.getMessage(),
                                id)));
    }


}
