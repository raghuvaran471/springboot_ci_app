package com.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine::Constructor");
	}

	@Override
	public int start() {
		System.out.println("DE::Start() method called");
		// TODO Auto-generated method stub
		return 0;
	}

}
