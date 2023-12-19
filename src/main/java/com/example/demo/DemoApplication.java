package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ioc = SpringApplication.run(DemoApplication.class, args);
		
		
		
		Discount d = new DiscountImpl();
		
		Discount d1= new PrimeDiscount();
	
		product pr =ioc.getBean(product.class);
		pr.setPid(2);
		pr.setPname("Mama");
		
		Order ord = ioc.getBean(Order.class);
		ord.setOid(22);
		ord.setStatus("Out For Delivery");
		
		ord.getDiscount().caculateDiscount();
		
		
	
		
	}

}
