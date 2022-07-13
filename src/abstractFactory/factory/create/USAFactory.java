package abstractFactory.factory.create;

import abstractFactory.classes.transport.*;
import abstractFactory.factory.interf.*;
import abstractFactory.interf.transport.Air;
import abstractFactory.interf.transport.Car;;

public class USAFactory implements CreateFactory{

	@Override
	public Car createCar() {
		return new AvtoShevrolet();
	}

	@Override
	public Air createAir() {
		return new Boeng();
		
	}
}

