package com.speedBazaar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.speedBazaar.model.User;

@Service
public interface UserRepo extends JpaRepository<User, Integer>{

}
