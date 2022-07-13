package abstractFactory.classes.transport;

import abstractFactory.interf.transport.*; ;

public class AvtoShevrolet implements Car {

	@Override
	public void drive() {
		System.out.println("Shevrolet go");
		
	}

	@Override
	public void stop() {
		System.out.println("Shevrolet stop");		
	}

}

