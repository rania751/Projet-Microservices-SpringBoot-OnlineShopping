package com.projectsoc1.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.projectsoc1.inventoryservice.model.Inventory;
import com.projectsoc1.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
@EnableEurekaClient
public class InventoryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryserviceApplication.class, args);
	}
	
	
	  @Bean
	    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
	        return args -> {
	            Inventory inventory = new Inventory();
	            inventory.setSkuCode("iphone_13");
	            inventory.setQuantity(100);

	            Inventory inventory1 = new Inventory();
	            inventory1.setSkuCode("iphone_13_red");
	            inventory1.setQuantity(50);
	            
	            Inventory inventory2 = new Inventory();
	            inventory2.setSkuCode("iphone_14");
	            inventory2.setQuantity(0);

	            inventoryRepository.save(inventory);
	            inventoryRepository.save(inventory1);
	            inventoryRepository.save(inventory2);
	        };
	    }

}
