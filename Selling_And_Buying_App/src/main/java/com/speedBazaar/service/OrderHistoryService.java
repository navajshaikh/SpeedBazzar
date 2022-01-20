package com.speedBazaar.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.speedBazaar.controller.dto.ProductDto;
import com.speedBazaar.controller.dto.UserDto;
import com.speedBazaar.model.History;
import com.speedBazaar.model.Product;
import com.speedBazaar.model.User;
import com.speedBazaar.repo.OrderHistoryRepo;
import com.speedBazaar.repo.ProductRepo;
import com.speedBazaar.repo.UserRepo;

@Service
@Transactional
public class OrderHistoryService {
	
	@Autowired
	private OrderHistoryRepo orderHistoryRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	public String getOrderHistory(OrderDto orderDto) {
		
		User user = new ObjectMapper().convertValue(orderDto, User.class);
		Product product = new ObjectMapper().convertValue(orderDto, Product.class);
		Integer personId = userRepo.save(user).getUserId();
	
		
//		UserService obj=new UserService();
//		UserDto ob=new UserDto();
//		ProductDto p=new ProductDto();
//		
//		obj.addUser(ob);
//		obj.addProducts(p);
		
		History order=new History();
		order.setUserId(personId);
		order.setProductName(product.getProductName());
						
		return "History"+orderHistoryRepo.save(order);
	}

}
