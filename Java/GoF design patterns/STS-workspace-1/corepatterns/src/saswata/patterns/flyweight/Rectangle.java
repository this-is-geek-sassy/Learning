package saswata.patterns.flyweight;

public class Rectangle implements Shape {
	
	private String label;
	private int length;
	private int bredth;
	private String fillStyle;

	public Rectangle() {
		label = "rectangle";
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBredth() {
		return bredth;
	}

	public void setBredth(int bredth) {
		this.bredth = bredth;
	}

	public String getFillStyle() {
		return fillStyle;
	}

	public void setFillStyle(String fillStyle) {
		this.fillStyle = fillStyle;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a " + label + " with length "
				+ length + " bredth: " + bredth
				+ " fill style: " + fillStyle);
	}

}
