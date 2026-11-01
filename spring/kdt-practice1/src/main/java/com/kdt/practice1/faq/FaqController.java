package com.kdt.practice1.faq;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class FaqController {

    private final FaqService faqService;

    public FaqController(FaqService faqService) {
        this.faqService = faqService;
    }

    @GetMapping("/api/v1/faqs")
    public List<Faq> list() {
        return faqService.findAll();
    }

    @GetMapping("/api/v1/faqs/{id}")
    public Faq one(@PathVariable("id") Long id) {
        return faqService.findById(id);
    }

    @PostMapping("/api/v1/faqs")
    @ResponseStatus(HttpStatus.CREATED)
    public Faq create(@Valid @RequestBody FaqCreateRequest request) {
        return faqService.create(request);
    }


}
