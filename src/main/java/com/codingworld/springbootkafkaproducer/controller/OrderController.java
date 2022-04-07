package com.codingworld.springbootkafkaproducer.controller;

import com.codingworld.springbootkafkaproducer.bean.Order;
import com.codingworld.springbootkafkaproducer.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {


  @Autowired
  private OrderService orderService;

  @PostMapping(value = "/create")
  public Order createOrder(@RequestBody Order order) {

    order=orderService.createOrder(order);
    return order;
  }

  @GetMapping("/all")
  public List<Order> getOrders() {

    return orderService.getAllOrders();
  }
}
