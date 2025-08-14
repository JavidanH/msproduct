package az.company.javidan.msproduct.model.reuquest;


import az.company.javidan.msproduct.model.constants.ApplicationConstants;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReduceQuantityRequest {
    @NotNull(message = ApplicationConstants.PRODUCT_ID_IS_REQUIRED)
    private Long productId;

    @NotNull(message = ApplicationConstants.QUANTITY_IS_REQUIRED)
    private Integer quantity;
}
