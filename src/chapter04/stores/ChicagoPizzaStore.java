package stores;

import pizza.Pizza;
import pizza.chicago.ChicagoStyleCheesePizza;
import pizza.chicago.ChicagoStyleClamPizza;
import pizza.chicago.ChicagoStylePepperoniPizza;
import pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
    protected Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if(type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if(type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if(type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else {
			return null;
		}
	}
}
