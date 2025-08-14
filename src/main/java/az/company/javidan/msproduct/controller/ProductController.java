package az.company.javidan.msproduct.controller;


import az.company.javidan.msproduct.model.response.ProductResponse;
import az.company.javidan.msproduct.model.reuquest.CreateProductRequest;
import az.company.javidan.msproduct.model.reuquest.ReduceQuantityRequest;
import az.company.javidan.msproduct.service.abstraction.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct (@RequestBody @Valid CreateProductRequest  createProductRequest){
        productService.createProduct(createProductRequest);
    }

    @GetMapping("/{id}")
    public ProductResponse getProductById(@PathVariable Long id){

        return productService.getProductById(id);
    }

    @PostMapping("/reduce-quantity")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void reduceQuantity(@RequestBody @Valid ReduceQuantityRequest reduceQuantityRequest){
        productService.reduceQuantity(reduceQuantityRequest);
    }
}
