package abstractFactory.classes.transport;

import abstractFactory.interf.transport.*;

public class Tu implements Air{

	@Override
	public void fly() {
        System.out.println("Tu Fly on");		
	}
}

