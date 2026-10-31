package com.kdt.practice1.notice;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoticeController {
    private final NoticeService noticeService;

    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @GetMapping("/api/v1/notices")
    public List<Notice> list() {
        return noticeService.findAll();
    }

    @GetMapping("/api/v1/notices/{id}")
    public Notice one(@PathVariable("id") Long id) {
        return noticeService.findById(id);
    }

    @PostMapping("/api/v1/notices")
    @ResponseStatus(HttpStatus.CREATED)
    public Notice create(@Valid @RequestBody NoticeCreateRequest request) {
        return noticeService.create(request);
    }

    @PutMapping("/api/v1/notices/{id}")
    public Notice update(@PathVariable("id") Long id, @Valid @RequestBody NoticeUpdateRequest request) {
        return noticeService.update(id, request);
    }


    @DeleteMapping("/api/v1/notices/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        noticeService.delete(id);
    }

}
