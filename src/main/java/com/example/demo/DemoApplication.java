package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.loose.CoffeeMaker;
import com.example.loose.DripCoffeeMachine;
import com.example.loose.EspressoMachine;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		// tight 
		//com.example.tight.CoffeeMaker  coffeeMaker
		//    = new com.example.tight.CoffeeMaker();
		// coffeeMaker.makeCoffee();
		
		// loose
		com.example.loose.DripCoffeeMachine  dripCoffeeMachine 
		    = new com.example.loose.DripCoffeeMachine();
		// <bean id="dripCoffeeMachine" class="com.example.loose.DripCoffeeMachine" />
		EspressoMachine espressoMachine = new EspressoMachine();
		// <bean id="espressoMachine" class="com.example.loose.EspressoMachine" />
		
		CoffeeMaker coffeeMaker = new CoffeeMaker();		
		coffeeMaker.setCoffeeMachine( espressoMachine  );
	//	coffeeMaker.setCoffeeMachine( dripCoffeeMachine  );
		coffeeMaker.makeCoffee();
		
	//	<bean id="coffeeMaker" class="com.example.loose.CoffeeMaker" 
	//	  init-method="makeCoffee" > 
	//	   property="coffeeMachine" ref="espressoMachine" /> 
	//	</bean>
		
	}

}









