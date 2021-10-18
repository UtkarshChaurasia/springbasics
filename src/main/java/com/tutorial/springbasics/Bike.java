package com.tutorial.springbasics;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	 
	public void drive() {
		System.out.println("Bhaaggg raha hai..");
	}

}
