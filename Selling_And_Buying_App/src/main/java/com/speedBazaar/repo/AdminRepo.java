package com.speedBazaar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.speedBazaar.model.Admin;

@Service
public interface AdminRepo extends JpaRepository<Admin, Long>{

}
