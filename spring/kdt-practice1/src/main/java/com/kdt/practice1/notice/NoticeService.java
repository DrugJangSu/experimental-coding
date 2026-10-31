package com.kdt.practice1.notice;

import com.kdt.practice1.common.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public NoticeService(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    public List<Notice> findAll() {
        return noticeRepository.findAll();
    }

    public Notice findById(Long id) {
        return noticeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("notice missing"));
    }

    public Notice create(NoticeCreateRequest request) {
        Notice notice = new Notice(request.title(), request.content());
        return noticeRepository.save(notice);
    }

    @Transactional
    public Notice update(Long id, NoticeUpdateRequest request) {
        Notice notice = findById(id);
        notice.update(request.title(), request.content());
        return notice;
    }

    public void delete(Long id) {
        Notice notice = findById(id);
        noticeRepository.delete(notice);
    }

}
