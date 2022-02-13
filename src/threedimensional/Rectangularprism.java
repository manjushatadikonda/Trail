package threedimensional;

public class Rectangularprism implements Shape {
	private double length;
	private double width;
	private double height;

	public Rectangularprism() {
	
	}

	public Rectangularprism(double l, double w, double h) {
	
	}

	public double getLength() {
return length;
	}

	public double getWidth() {
	return width;
	}

	public double getHeight() {
	return height;
	}

	public double area() {
	return 2 * (width * length + height * length + height * width);
	}

	public double volume() {
	return length * length * height;
	}
}
