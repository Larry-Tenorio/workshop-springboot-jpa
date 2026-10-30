package com.larryestudos.course.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.larryestudos.course.entities.Order;
import com.larryestudos.course.entities.User;
import com.larryestudos.course.repositories.OrderRepository;
import com.larryestudos.course.repositories.UserRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
