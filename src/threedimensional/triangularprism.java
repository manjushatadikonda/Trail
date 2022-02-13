package threedimensional;

public class triangularprism implements Shape{
	private double base;
	private double height1;
public triangularprism()
{
	
}
public triangularprism(double base,double height1)
{
	
}
public double getbase()
{
	return base;
}
public double getheight()
{
	return height1;
}
public double area()
{
	return 0.5*base*height1;
}
public double volume()
{
	return 0.5*base*height1;
}
}
