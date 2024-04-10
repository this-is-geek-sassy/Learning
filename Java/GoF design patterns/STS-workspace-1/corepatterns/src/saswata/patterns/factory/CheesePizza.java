package saswata.patterns.factory;

public class CheesePizza implements Pizza {

	@Override
	public void preparaePizza() {
		System.out.println("Preparing cheese pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking cheese pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting cheese pizza");
	}

}
