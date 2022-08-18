package com.spring.onecle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onecle.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
}
