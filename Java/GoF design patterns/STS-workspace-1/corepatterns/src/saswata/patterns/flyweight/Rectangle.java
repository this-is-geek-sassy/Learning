package saswata.patterns.flyweight;

public class Rectangle extends Shape {
	
	private String label;
	

	public Rectangle() {
		label = "rectangle";
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	

	@Override
	public void draw (int length, int bredth, String fillStyle) {
		System.out.println("Drawing a " + label + " with length "
				+ length + " bredth: " + bredth
				+ " fill style: " + fillStyle);
	}

}
