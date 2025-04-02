package com.pedroestudando.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroestudando.estudo.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>  {

	
}
