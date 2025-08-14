package az.company.javidan.msproduct.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessage {
    PRODUCT_NOT_FOUND ("Product not found with id: %s");
   // INSUFFICIENT_QUANTITY ("Insufficient quntity for product with id %s");

    private final String message;
}
