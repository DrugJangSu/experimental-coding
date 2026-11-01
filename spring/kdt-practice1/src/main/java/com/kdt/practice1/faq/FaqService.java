package com.kdt.practice1.faq;

import com.kdt.practice1.common.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqService {

    private final FaqRepository faqRepository;

    public FaqService(FaqRepository faqRepository) {
        this.faqRepository = faqRepository;
    }

    public List<Faq> findAll() {
        return faqRepository.findAll();
    }

    public Faq findById(Long id) {
        return faqRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("faq missing"));
    }

    public Faq create(FaqCreateRequest request) {
        Faq faq = new Faq(request.question(), request.answer());
        return faqRepository.save(faq);
    }
}
