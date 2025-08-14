package az.company.javidan.msproduct.model.reuquest;

import az.company.javidan.msproduct.model.constants.ApplicationConstants;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateProductRequest {
    @NotBlank(message = ApplicationConstants.NAME_IS_REQUIRED)
    private String name;

    @NotBlank(message = ApplicationConstants.DESCRIPTION_IS_REQUIRED)
    private String description;

    @NotNull(message = ApplicationConstants.PRICE_IS_REQUIRED)
    private BigDecimal price;

    @NotNull(message = ApplicationConstants.QUANTITY_IS_REQUIRED)
    private Integer quantity;
}
