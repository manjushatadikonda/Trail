package flipkartPOM.TestNGspicejet.src.flipkartproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SearchitemresultsTest extends TestBase{

	
	 MobilePage mobobj=null;
	    
	   Searchitemresults searchobj=null; 
		
		
	@Test(priority=0)
	public void validateitem() throws InterruptedException
	{
		
		searchobj=new Searchitemresults(driver);
		mobobj=searchobj.selectitem();
		Assert.assertEquals(mobobj.getTitle(),"realme Narzo 50i ( 32 GB Storage, 2 GB RAM ) Online at Best Price On Flipkart.com");
	}
}
