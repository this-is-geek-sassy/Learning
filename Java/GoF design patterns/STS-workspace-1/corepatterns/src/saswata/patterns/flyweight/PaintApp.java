package saswata.patterns.flyweight;

public class PaintApp {
	
	public void render(int noOfShapes) {
		
		Shape shape = null;
		for (int i = 1; i <= noOfShapes; i++) {
			if (i%2 == 0) {
				shape = ShapeFactory.getShape("circle");
				shape.draw(i, "red", "white");
			} else {
				shape = ShapeFactory.getShape("rectangle");
				shape.draw(i, i+i, "dotted");
			}
		}
	}

}
