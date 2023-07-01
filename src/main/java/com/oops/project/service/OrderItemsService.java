package com.oops.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oops.project.model.OrderItem;
import com.oops.project.repository.OrderItemsRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderItemsService {

    @Autowired
    private OrderItemsRepository orderItemsRepository;

    public void addOrderedProducts(OrderItem orderItem) {
        orderItemsRepository.save(orderItem);
    }


}
