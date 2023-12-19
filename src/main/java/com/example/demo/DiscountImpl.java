package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Qualifier("disc")
@Component
public class DiscountImpl implements Discount {

	@Override
	public void caculateDiscount() {
		System.out.println("You will get 10% discount");
		
	}



		
	}

