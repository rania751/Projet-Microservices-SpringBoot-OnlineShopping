package com.projectsoc1.orderservice.repository;

import com.projectsoc1.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}