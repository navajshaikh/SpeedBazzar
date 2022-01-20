package com.speedBazaar.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.speedBazaar.controller.dto.AdminDto;
import com.speedBazaar.controller.dto.CartDto;
import com.speedBazaar.controller.dto.ProductDto;
import com.speedBazaar.controller.dto.UserDto;
import com.speedBazaar.model.Admin;
import com.speedBazaar.model.Cart;
import com.speedBazaar.model.Product;
import com.speedBazaar.model.User;
import com.speedBazaar.repo.AdminRepo;
import com.speedBazaar.repo.CartRepo;
import com.speedBazaar.repo.ProductRepo;
import com.speedBazaar.repo.UserRepo;

@Service
@Transactional
public class AdminService {
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private CartRepo cartRepo;
	
	

	//add user
	public String addAdmin(AdminDto adminDto){
		
		Admin admin = new ObjectMapper().convertValue(adminDto, Admin.class);

		Long adminId= adminRepo.save(admin).getAdminId();
		System.out.println("user added");
		
		Product product = new Product( "mobile",20000.1F,"electronics",1,new Date(System.currentTimeMillis()),adminId);

		Integer productId = productRepo.save(product).getProductId();

	return "product added "+productId;
	}
	
	//get admin
	public List<Admin> getAdminDetails(){
		return adminRepo.findAll();	
	}
	
	
	//update admin order
	public String updateAdminList(AdminDto adminDto) {
		Admin admin = new ObjectMapper().convertValue(adminDto, Admin.class);
		Long adminId = adminRepo.save(admin).getAdminId();
		Product product = new Product( "Chair",500.1F,"Furniture",1,new Date(System.currentTimeMillis()),adminId);
		Integer productId = productRepo.save(product).getProductId();
			return "product updated "+productId;
		}
	
	
	//get products
		public List<Product> getProductDetails(){
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
