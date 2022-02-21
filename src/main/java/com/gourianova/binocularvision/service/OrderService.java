package com.gourianova.binocularvision.service;

import com.gourianova.binocularvision.exception.OrderNotFoundException;
import com.gourianova.binocularvision.model.Order;
import com.gourianova.binocularvision.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepo orderRepo;

    @Autowired
    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order addOrder(Order order) {
        return orderRepo.save(order);
    }

    public List<Order> findAllOrders() {
        return orderRepo.findAll();
    }

    public Order updateOrder(Order order) {
        return orderRepo.save(order);
    }

    public Order findOrderById(Integer id) {
        return orderRepo.findOrderById(id).
                orElseThrow(() -> new OrderNotFoundException("Order by id" + id + "not found"));

    }

    public void deleteOrder(Integer id) {
        orderRepo.deleteOrderById(id);
    }
}
