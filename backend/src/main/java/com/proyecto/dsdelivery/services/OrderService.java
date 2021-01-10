package com.proyecto.dsdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.dsdelivery.dto.OrderDTO;
import com.proyecto.dsdelivery.entites.Order;
import com.proyecto.dsdelivery.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrdersWithProducts();	
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}
