package com.oops.project.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oops.project.model.Order;
import com.oops.project.model.OrderItem;

public interface OrderItemsRepository extends JpaRepository<OrderItem, Integer> {


}
