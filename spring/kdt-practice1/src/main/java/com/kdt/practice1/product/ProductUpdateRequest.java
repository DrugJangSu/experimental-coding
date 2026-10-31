package com.kdt.practice1.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record ProductUpdateRequest(@NotBlank @Size(max = 50) String name,
                                   @PositiveOrZero int price,
                                   @PositiveOrZero int stock) {
}
