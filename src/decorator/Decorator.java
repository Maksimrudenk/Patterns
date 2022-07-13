package decorator;

import decorator.objects.Component;

public abstract class Decorator implements Component {

	
protected Component component;
    
    // в конструкторе инициализация переменной component
    public Decorator (Component component) {
        this.component = component;
    }
    
    public abstract void afterDraw();

    // метод интерфейса
    @Override
    public void draw() {
        component.draw();
        afterDraw();      // добавление своего компонентва
    }
}

