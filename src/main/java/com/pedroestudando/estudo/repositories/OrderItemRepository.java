package com.pedroestudando.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroestudando.estudo.entities.OrderItem;
import com.pedroestudando.estudo.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {

	
}
