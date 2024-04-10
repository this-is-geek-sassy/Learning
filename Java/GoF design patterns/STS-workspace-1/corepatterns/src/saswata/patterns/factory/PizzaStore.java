package saswata.patterns.factory;

public class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza p = PizzaFactory.createPizza(type);
		
		p.preparaePizza();
		p.bake();
		p.cut();
		
		return p;
	}

}
