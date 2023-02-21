package com.spring.inventoryservice;

import com.spring.inventoryservice.models.Inventory;
import com.spring.inventoryservice.repositories.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner loadData(InventoryRepository repository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("iphone_13");
            inventory.setQuantity(100);
            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("iphone_10");
            inventory2.setQuantity(20);
            Inventory inventory3 = new Inventory();
            inventory3.setSkuCode("iphone_11");
            inventory3.setQuantity(10);

            repository.save(inventory);
            repository.save(inventory2);
            repository.save(inventory3);
        };
    }*/
}
