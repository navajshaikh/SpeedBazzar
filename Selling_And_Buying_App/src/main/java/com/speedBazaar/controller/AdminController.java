package com.speedBazaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.speedBazaar.controller.dto.AdminDto;
import com.speedBazaar.controller.dto.CartDto;
import com.speedBazaar.controller.dto.ProductDto;
import com.speedBazaar.controller.dto.UserDto;
import com.speedBazaar.model.Admin;
import com.speedBazaar.model.Product;
import com.speedBazaar.model.User;
import com.speedBazaar.service.AdminService;
import com.speedBazaar.service.UserService;



@RestController
public class AdminController {

	
	@Autowired
	private AdminService adminService;


	@PostMapping("/add/admin")
	public String addAdminOrder(@RequestBody AdminDto adminDto) {
		return adminService.addAdmin(adminDto);
	} 


	@GetMapping("/get/admin")
	public List<Admin> getUserList(){
		return adminService.getAdminDetails();
	}
	

	@PutMapping("/update/admin")
	public String updateUserOrder(@RequestBody AdminDto adminDto) {
		return adminService.updateAdminList(adminDto);
	}
	

	@GetMapping("/get/product/admin")
	public List<Product> getProductList(@RequestBody UserDto userDto){
		return adminService.getProductDetails();
	}
	
	
	//add product by admin
	@PostMapping("/product/admin")
	public String addProductInList(@RequestBody ProductDto productDto){
		return adminService.addProducts(productDto);
	}

	
	@PostMapping("/add/cart/admin")
	public String addToCart(@RequestBody CartDto cartDto) {
		return"product added to cart"+ adminService.addProductInCart(cartDto);
	}
	
	
	
	

}
