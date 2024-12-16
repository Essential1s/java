class Shape {
        private double width;
        private double height;
        
        Shape() {
                width = height = 0.8;
        }
        Shape(double w, double h) {
                width = w;
                height = h;
        }
        Shape(double x) {
                width = height = x;
        }

        double getWidth() {
                return width;
        }

        double getHeight() {
                return height;
        }
}

class Triangle extends Shape {
	String style;
	Triangle(double w, double h) {
		super(w, h);
		
	}
	double area() {
		System.out.println("area - 112.5");
		return getWidth()*getHeight()/2;
		
	}


}

class Demonstration {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10, 15);
		t1.area();
	}
}
