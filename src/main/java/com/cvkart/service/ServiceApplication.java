package com.cvkart.service;

import com.cvkart.service.entity.WarehouseProduct;
import com.cvkart.service.repository.WarehouseProductRepo;
import com.cvkart.service.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {

	@Autowired
	WarehouseProductRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.findAll());
	}
}
