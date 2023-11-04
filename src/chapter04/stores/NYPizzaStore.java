package stores;

import pizza.Pizza;
import pizza.newYork.NYStyleCheesePizza;
import pizza.newYork.NYStyleClamPizza;
import pizza.newYork.NYStylePepperoniPizza;
import pizza.newYork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if(type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if(type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if(type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
