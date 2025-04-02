package com.pedroestudando.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroestudando.estudo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

	
}
