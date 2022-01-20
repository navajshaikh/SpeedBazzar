package com.speedBazaar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.speedBazaar.model.History;

@Service
public interface OrderHistoryRepo extends JpaRepository<History, Integer> {

}
