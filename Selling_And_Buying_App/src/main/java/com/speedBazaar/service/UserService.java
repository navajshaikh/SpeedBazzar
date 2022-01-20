package com.speedBazaar.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.speedBazaar.controller.dto.AdminDto;
import com.speedBazaar.controller.dto.CartDto;
import com.speedBazaar.controller.dto.ProductDto;
import com.speedBazaar.controller.dto.UserDto;
import com.speedBazaar.model.Admin;
import com.speedBazaar.model.Cart;
import com.speedBazaar.model.Product;
import com.speedBazaar.model.User;
import com.speedBazaar.repo.CartRepo;
import com.speedBazaar.repo.ProductRepo;
import com.speedBazaar.repo.UserRepo;



@Service
@Transactional
public class UserService {
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CartRepo cartRepo;
	
	

	//add user
	public String addUser(UserDto userDto){
	
		User user = new ObjectMapper().convertValue(userDto, User.class);
		Integer userId= userRepo.save(user).getUserId();
		System.out.println("user added");
		
		Product product = new Product( "mobile",20000.1F,"electronics",1,new Date(System.currentTimeMillis()),userId);

		Integer productId = productRepo.save(product).getProductId();

	return "product added "+productId;
	}
	
	//get user
	public List<User> getUserDetails(UserDto userDto){
		return userRepo.findAll();	
	}
	
	
	//update person order
	public String updateUserList(UserDto userDto) {
		User user = new ObjectMapper().convertValue(userDto, User.class);
		Integer personId = userRepo.save(user).getUserId();
		Product product = new Product( "mobile",20000.1F,"electronics",1,new Date(System.currentTimeMillis()),personId);
		Integer productId = productRepo.save(product).getProductId();
			return "product updated "+productId;
		}
	
	
	//get products
		public List<Product> getProductDetails(UserDto userDto){
			return productRepo.findAll();	
		}
		
	
	//add product by user		
		
		public String addProducts(@RequestBody ProductDto productDto) {
			Product product = new ObjectMapper().convertValue(productDto, Product.class);
			return"product added "+ productRepo.save(product);
				
		}
		

		public String addProductInCart(CartDto cartDto) {
			Cart cart = new ObjectMapper().convertValue(cartDto, Cart.class);
			return"product added to cart"+ cartRepo.save(cart);
				
		}
		
	
}
