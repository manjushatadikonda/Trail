package flipkartPOM.TestNGspicejet.src.flipkartproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class HomePageTest extends TestBase
{
	WebDriver driver=null;
	TestBase test=null;
	HomePage home=null;
	Searchitemresults item=null;
	
@BeforeClass
public void initialize()
{
	test=new TestBase();
	driver=test.initializedriver();
	home=new HomePage(driver);
	
}


@Test(priority=0)
public void testtitle()
{
	Assert.assertEquals(home.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	
}
@Test(priority=1)
public void clicksearchbutton() throws InterruptedException
{
	item= home.searchitem();
	Assert.assertEquals(item.getTitle(),"Realme Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com");

}

}
