package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Qualifier("prime")
@Component
public class PrimeDiscount implements Discount {

	@Override
	public void caculateDiscount() {
		System.out.println("You Will get 20% discount");		
	}

}
