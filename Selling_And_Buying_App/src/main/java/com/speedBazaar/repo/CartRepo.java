package com.speedBazaar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.speedBazaar.model.Cart;

@Service
public interface CartRepo extends JpaRepository<Cart, Integer>{

}
