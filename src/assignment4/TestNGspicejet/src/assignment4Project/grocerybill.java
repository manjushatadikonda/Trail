package assignment4.TestNGspicejet.src.assignment4Project;

public class grocerybill 

{
public Employee clerk;
public double total;
private int item_count;
public grocerybill()
{
	
}
	public grocerybill(Employee clerk)
	{
		this.clerk=clerk;
		total=0.0;
		item_count=0;
	}
	public void add(Item i)
	{
		total=total+i.getPrice();
		item_count++;
		
	}
	public double getTotal()
	{
		return total;
	}
	public int getItemcount()
	{
		return item_count;
	}
	public void printReceipt()
	{
		
		System.out.println("  Grocery Receipt   ");
		System.out.println("Customer Name: " + clerk.getname());
		System.out.println("Discount amount: 0.0");
		System.out.println("Discount percent: 0%");
		System.out.println("Total: " + this.getTotal());
	}
	
	}


