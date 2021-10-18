package com.tutorial.springbasics;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive() {
		System.out.println("Chal rahi hai..");
	}

}
