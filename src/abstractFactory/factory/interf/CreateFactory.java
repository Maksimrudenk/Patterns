package abstractFactory.factory.interf;

import abstractFactory.interf.transport.*;

public interface CreateFactory {
	
	Car createCar();
	Air createAir();

}

