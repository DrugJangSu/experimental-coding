package com.kdt.practice2.statistics;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class StatisticsService {

    private final OrderStatisticsRepository repository;

    public StatisticsService(OrderStatisticsRepository repository) {
        this.repository = repository;
    }

    public OrderStatistics orderStatistics(LocalDate date) {
        LocalDateTime start = date.atStartOfDay();
        LocalDateTime end = date.plusDays(1).atStartOfDay();

        return new OrderStatistics(
                repository.countOrders(start, end),
                repository.countOrdersByStatus("PLACED", start, end),
                repository.countOrdersByStatus("CANCELLED", start, end),
                repository.sumPlacedQuantity(start, end),
                repository.sumPlacedAmount(start, end)
        );
    }

    public List<MenuStatistics> menuStatistics(LocalDate date) {
        LocalDateTime start = date.atStartOfDay();
        LocalDateTime end = date.plusDays(1).atStartOfDay();
        return repository.menuStatistics(start, end);
    }

    public List<CustomerStatistics> customerStatistics(LocalDate date) {
        LocalDateTime start = date.atStartOfDay();
        LocalDateTime end = date.plusDays(1).atStartOfDay();
        return repository.customerStatistics(start, end);
    }
}
