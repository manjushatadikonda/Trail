package assignment4.TestNGspicejet.src.assignment4Project;

public class Item 
{
	public String name;
	public double price;
	public double discount;
	public Item(String name, double price, double discount)
	{
		this.name=name;
		this.price=price;
		this.discount=discount;
	}
	public double getPrice()
	{
	 return price;
	}
	public double getDiscount()
	{
		
		return discount;
	}
}
