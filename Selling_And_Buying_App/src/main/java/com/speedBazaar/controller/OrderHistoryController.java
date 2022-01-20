package com.speedBazaar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;

import com.speedBazaar.service.OrderHistoryService;

public class OrderHistoryController {
	
	
	@Autowired
	private OrderHistoryService orderHistoryService;
	
	
	@GetMapping("/history")
	public String getHistory(OrderDto orderDto) {
		return orderHistoryService.getOrderHistory(orderDto);
	}

}
