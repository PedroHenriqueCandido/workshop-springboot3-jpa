package com.pedroestudando.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroestudando.estudo.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>  {

	
}
