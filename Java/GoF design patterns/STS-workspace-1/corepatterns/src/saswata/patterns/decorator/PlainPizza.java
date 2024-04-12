package saswata.patterns.decorator;

public class PlainPizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("baking normal pizza");
	}

}
