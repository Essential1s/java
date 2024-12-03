class TwoDShape {
	private double width;
	private double height;
	int common;
	TwoDShape() {
		width = height = 0.8;
	}
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	TwoDShape(double x) {
		width = height = x;
	}
	
	void ShowDim() {
		System.out.println("Width and height: " + width + "and" + height);

	}
	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		if (w>200)
			width = 200;
		else width = w;
	}
	void setHeight(double h) {
		if (h > 290)
			height = 290;
		else 
			height = h;
	}
}

class Triangle extends TwoDShape {
	int common;
	String style;

	Triangle() {
		super();
		style = "otsutstvuet";
	}
	Triangle(String s, double w, double h) {
		super(w, h);
		style = s;
	}
	Triangle(double x) {
		super(x);
		style = "filled";
	}

	Triangle(int a, int b) {
		super.common = a;
		common = b;
		System.out.println("common value in superclass" + super.common);
		System.out.println("common value in podclass" + common);

	}
	double area() {
		return getWidth()*getHeight()/2;
	}
	
	void showStyle() {
		System.out.println("Style: " + style);
	}
}

class Rectangle extends TwoDShape {
	int common;
	String outline;

	Rectangle() {
		super();
		outline = "otsutstvuet";

	}

	Rectangle(double x) {
		super(x);
		outline = "sploshnaya";
	}

	Rectangle(String o, double w, double h) {
		super(w, h);
		outline = o;
	}
	Rectangle(int a, int b) {
		super.common = a;
		common = b;
	}

	double area() {
		return getWidth() * getHeight();

	}
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
	       return false;	
	}
	void showOutline() {
		System.out.println("Outline: " + outline);
	}
}

