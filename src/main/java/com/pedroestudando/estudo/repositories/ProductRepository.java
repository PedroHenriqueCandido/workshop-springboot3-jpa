package com.pedroestudando.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroestudando.estudo.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>  {

}
