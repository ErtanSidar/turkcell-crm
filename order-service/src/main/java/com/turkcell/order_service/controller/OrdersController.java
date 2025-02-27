package com.turkcell.order_service.controller;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {

    //    private final ProductClient productClient;
    private final StreamBridge streamBridge;

    public OrdersController(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @GetMapping
    public String get() {
//        String response = productClient.get();
//        OrderCreatedEvent orderCreatedEvent = new OrderCreatedEvent();
//        orderCreatedEvent.setId("fgdfhdfhdfh");
        streamBridge.send("orderCreatedFunction-out-0", "orderCreatedEvent");
        return "Order Service";
    }
}
