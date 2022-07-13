package abstractFactory.factory.create;

import abstractFactory.classes.transport.*;
import abstractFactory.factory.interf.*;
import abstractFactory.interf.transport.Air;
import abstractFactory.interf.transport.Car;;

public class RussianFactory implements CreateFactory{

	@Override
	public Car createCar() {
		return new AvtoLada();
	}

	@Override
	public Air createAir() {
		return new Tu();
		
	}
}

