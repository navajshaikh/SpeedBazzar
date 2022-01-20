package com.speedBazaar.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.speedBazaar.controller.dto.CartDto;
import com.speedBazaar.controller.dto.ProductDto;
import com.speedBazaar.controller.dto.UserDto;
import com.speedBazaar.model.Product;
import com.speedBazaar.model.User;
import com.speedBazaar.service.OrderHistoryService;
import com.speedBazaar.service.UserService;

@RestController
public class UserController {
  

	@Autowired
	private UserService userService;


	@PostMapping("/")
	public String addUserOrder(@RequestBody UserDto userDto) {
		
		return userService.addUser(userDto);
	} 


	@GetMapping("/")
	public List<User> getUserList(@RequestBody UserDto userDto){
		return userService.getUserDetails(userDto);
	}
	

	@PutMapping("/")
	public String updateUserOrder(@RequestBody UserDto userDto) {
		return userService.updateUserList(userDto);
	}
	

	@GetMapping("/get/product")
	public List<Product> getProductList(@RequestBody UserDto userDto){
		return userService.getProductDetails(userDto);
	}
	
	
	//add product by user
	@PostMapping("/product")
	public String addProductInList(@RequestBody ProductDto productDto){
		return userService.addProducts(productDto);
	}

	
	@PostMapping("/add/cart")
	public String addToCart(@RequestBody CartDto cartDto) {
		return"product added to cart"+ userService.addProductInCart(cartDto);
	}
	
	
	
}
