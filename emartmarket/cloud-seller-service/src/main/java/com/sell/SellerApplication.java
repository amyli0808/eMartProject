package com.sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class SellerApplication {
	public static void main(String[] args)throws Exception{
		SpringApplication.run(SellerApplication.class, args);
	}
}
