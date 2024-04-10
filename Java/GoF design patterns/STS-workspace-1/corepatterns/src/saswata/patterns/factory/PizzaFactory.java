package saswata.patterns.factory;

public class PizzaFactory {
	
	public static Pizza createPizza(String type) {
		
		Pizza p = null;
		
		if (type.equalsIgnoreCase("cheese")) {
			p = new CheesePizza();
		}
		else if (type.equalsIgnoreCase("chicken")) {
			p = new ChickenPizza();
		}
		else if (type.equalsIgnoreCase("veggie")) {
			p = new VeggiePizza();
		}
		return p;
	}

}
