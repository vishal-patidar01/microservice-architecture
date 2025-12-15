package com.vishal.ecommerce.order_service.controller;

import com.vishal.ecommerce.order_service.clients.InventoryOpenFeignClient;
import com.vishal.ecommerce.order_service.dto.OrderRequestDto;
import com.vishal.ecommerce.order_service.service.OrdersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/core")
public class OrdersController {

    private final OrdersService ordersService;



    @GetMapping("/helloOrders")
    public String helloOrders() {
        return "Hello from Orders Service";
    }


    @PostMapping("/create-order")
    public ResponseEntity<OrderRequestDto> createOrder(@RequestBody OrderRequestDto orderRequestDto) {
        OrderRequestDto orderRequestDto1 = ordersService.createOrder(orderRequestDto);
        return ResponseEntity.ok(orderRequestDto1);
    }

    @GetMapping
    public ResponseEntity<List<OrderRequestDto>> getAllOrders() {
        log.info("Fetching all orders via controller");
        List<OrderRequestDto> order = ordersService.getAllOrders();
        return ResponseEntity.ok(order);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderRequestDto> getOrderById(@PathVariable Long id) {
        log.info("Fetching  orders with id: {}  via controller", id);
        OrderRequestDto orders = ordersService.getOrderById(id);
        return ResponseEntity.ok(orders);
    }
}
