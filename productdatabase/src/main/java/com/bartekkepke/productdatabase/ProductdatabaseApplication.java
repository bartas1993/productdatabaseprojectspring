package com.bartekkepke.productdatabase;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductdatabaseApplication {

	static int run = 1;

	public static void main(String[] args) {
		if(run == 1)
		{
			SpringApplication.run(ProductdatabaseApplication.class, args);
		}
		else
		{
			System.out.print("APPLICATION WONT START");
		}
	}

}
