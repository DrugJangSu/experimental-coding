package com.kdt.practice2.statistics;

import com.kdt.practice2.order.Order;
import com.kdt.practice2.order.OrderItem;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class DeliveryService {
    private final OrderStatisticsRepository repository;

    public DeliveryService(OrderStatisticsRepository repository) {
        this.repository = repository;
    }

    public List<DeliveryBatch> batches(LocalDate shippingDate) {
        List<Order> orders = repository
                .findByShippingDateAndStatusOrderByEmailAscIdAsc(shippingDate, "PLACED");

        Map<String, List<Order>> groups = new LinkedHashMap<>();
        for (Order order : orders) {
            String key = order.getEmail() + "|" + order.getAddress() + "|" + order.getPostcode();
            List<Order> group = groups.get(key);
            if (group == null) {
                group = new ArrayList<>();
                groups.put(key, group);
            }
            group.add(order);
        }
        List<DeliveryBatch> result = new ArrayList<>();
        for (List<Order> group : groups.values()) {
            Order first = group.get(0);
            List<Long> orderIds = new ArrayList<>();
            long totalQuantity = 0;
            long totalAmount = 0;

            for (Order order : group) {
                orderIds.add(order.getId());
                for (OrderItem item : order.getItems()) {
                    totalQuantity += item.getQuantity();
                    totalAmount += item.getLineAmount();
                }
            }
            result.add(new DeliveryBatch(first.getEmail(), first.getAddress(), first.getPostcode(),
                    shippingDate, orderIds, totalQuantity, totalAmount));
        }
        return result;
    }
}
