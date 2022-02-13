package flipkartPOM.TestNGspicejet.src.flipkartproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MobilePageTest extends TestBase{

	 MobilePage mobobj1=null;
	    
	   CartPage cartobj=null;
		
		
	@Test(priority=0)
	public void validatecart() throws InterruptedException
	{
		
		mobobj1=new MobilePage(driver);
		cartobj=mobobj1.addtocart();
		Assert.assertEquals(cartobj.getTitle(),"Shopping Cart | Flipkart.com");
	}
}
