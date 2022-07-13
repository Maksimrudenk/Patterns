package abstractFactory;

import abstractFactory.factory.create.*;
import abstractFactory.factory.interf.CreateFactory;


public class Start {
	
	private static CreateFactory factory;

	public static void main(String[] args) {
		
		
		if(true){
			factory = new RussianFactory();
		    }
		else{
			factory = new USAFactory();			
		}
				
		factory.createAir().fly();
		factory.createCar().drive();	
		factory.createCar().stop();
		
	}
}

