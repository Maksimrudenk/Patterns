package decorator;

import decorator.objects.Component;
import decorator.objects.Window;

public class Start {

	public static void main(String[] args) {		

		Component windowWithBorder = new ColorDecorator(new BorderDecorator(new Window()));
		windowWithBorder.draw();		

	}
}

