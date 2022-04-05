package com.aniruddha.btraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import com.aniruddha.btraining.entity.Product;
import com.aniruddha.btraining.service.ProductService;

@RestController

public class ProductRestController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> list() {
	    return service.listAll();
	}

}
