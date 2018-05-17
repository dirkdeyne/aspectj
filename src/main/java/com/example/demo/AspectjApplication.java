package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspectjApplication implements CommandLineRunner {
  
  @Autowired ItemRepository itemRepo;
  
  @Override
  public void run(String... args) throws Exception {
    List<Item> items = 
        Stream.of("pineapple","pen")
              .map(name -> new Item(name))
              .collect(Collectors.toList());
    itemRepo.saveAll(items);
    
    Item pineapple = itemRepo.getById(1L);
    Item pen = itemRepo.getById(2L);
    System.err.println(pineapple + "-" + pen);
  }
  
	public static void main(String[] args) {
		SpringApplication.run(AspectjApplication.class, args);
	}
}
