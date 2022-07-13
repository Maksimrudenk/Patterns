package abstractFactory.classes.transport;

import abstractFactory.interf.transport.*; ;

public class AvtoLada implements Car {

	@Override
	public void drive() {
		System.out.println("Lada go");		
	}

	@Override
	public void stop() {
		System.out.println("Lada stop");		
	}
}

