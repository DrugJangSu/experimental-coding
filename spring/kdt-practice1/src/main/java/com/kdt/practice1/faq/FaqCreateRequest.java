package com.kdt.practice1.faq;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record FaqCreateRequest(@NotBlank @Size(max = 200) String question,
                               @NotBlank String answer) {
}
