package assignment4.TestNGspicejet.src.assignment4Project;

public class discountbill extends grocerybill
{
    private boolean preferred;
	int disc_count;
	double disc_amount;
	double disc_percent;
	public double item_price;
	public discountbill()
	{
	
	}
public discountbill(Employee clerk,boolean preferred)
{
	super(clerk);
	this.preferred=preferred;
	disc_count=0;
	disc_percent=0.0;
	item_price=0.0;
	
	
}
public void add(Item i)
{
	item_price=i.getPrice();
	super.add(i);
	if(preferred)
	{
		disc_amount+=i.getDiscount();
	}
	if(disc_amount>0 && preferred)
	{
		disc_count++;
	}
	
	
}
public double getTotal()
{
	if(preferred)
	{
		return (super.getTotal())-disc_amount;
		
		
	}
	else
		return super.getTotal();
}
public int getDiscountCount()
{
	return disc_count;
}
public double getDiscountAmount()
{
	return disc_amount;
}
public double getDiscountPercent()
{
	disc_percent=(disc_amount*100)/super.getTotal();
	return disc_percent;
}
public void printReceipt()
{
	if(!preferred)
	super.printReceipt();
	else
	{   
		System.out.println("  Grocery Receipt   ");
		System.out.println("Customer Name: " + clerk.getname());
		System.out.println("Discount amount:"+ this.getDiscountAmount());
		System.out.println("Discount percent:"+ this.getDiscountPercent() +"%");
		System.out.println("Total: " + this.getTotal());
		
	}
}

}
