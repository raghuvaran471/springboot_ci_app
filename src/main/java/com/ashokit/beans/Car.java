package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private IEngine eng;

	public Car(IEngine eng) {
		System.out.println("Car::Constructor(param-constructor");
		this.eng = eng;
	}

	public void drive() {
		int status = eng.start();
		if (status == 0)
			System.out.println("Journey Started...");
		else
			System.out.println("Engine Failed To Start...!!");
	}
}
