package com.aniruddha.btraining.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniruddha.btraining.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	

}
