package com.example.tight;

// tight Coupling
public class CoffeeMaker {
	//private  EspressoMachine   expressoMachine;
	private  DripCoffeeMachine  dripCoffeeMachine;   
	
	public  CoffeeMaker() {
	//	this.expressoMachine = new EspressoMachine();
		this.dripCoffeeMachine = new DripCoffeeMachine();
	}
	
	public void makeCoffee() {
		// System.out.println( expressoMachine.brew() );
		System.out.println( dripCoffeeMachine.brew() );
	}
}
