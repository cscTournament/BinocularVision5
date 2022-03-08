package com.gourianova.binocularvision.repo;


import com.gourianova.binocularvision.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order,Integer> {

    void deleteOrderById(Integer id);

    Optional<Order> findOrderById(Integer id);
}

