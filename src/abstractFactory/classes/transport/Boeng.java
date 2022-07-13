package abstractFactory.classes.transport;

import abstractFactory.interf.transport.*;

public class Boeng implements Air{

	@Override
	public void fly() {
        System.out.println("Boeng Fly on");		
	}
}

