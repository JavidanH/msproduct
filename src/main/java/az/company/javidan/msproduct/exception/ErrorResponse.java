package az.company.javidan.msproduct.exception;

import lombok.Builder;

@Builder
public record ErrorResponse(String message) {
}
