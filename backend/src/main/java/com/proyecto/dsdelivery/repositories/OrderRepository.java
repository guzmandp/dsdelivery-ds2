package com.proyecto.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.dsdelivery.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
