package threedimensional;

public class sphere implements Shape
{
private double radius;
public sphere()
{
	
}
public sphere(double r)
{
	this.radius=r;
}
public double getRadius()
{
	return this.radius;
}
public double area()
{
	return 4.0* Math.PI * radius * radius;
}
public double volume() 
{
return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
}
}
