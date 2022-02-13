package TestNGspicejet.src.salesforceproject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SalesforceHomePageTest extends TestBase
{
	WebDriver driver=null;
	TestBase test=null;
	SalesforceHomePage home=null;
	TryForFree tryfree=null;
	
@BeforeClass
public void initialize()
{
	test=new TestBase();
	driver=test.initializedriver();
	home=new SalesforceHomePage(driver);
	
}


@Test(priority=0)
public void testtitle()
{
	Assert.assertEquals(home.getTitle(),"Salesforce: We Bring Companies and Customers Together");
	
}
@Test(priority=1)
public void clicktryforfree()
{
	tryfree= home.clicktryfree();
	Assert.assertEquals(tryfree.getTitle(),"Free Trial - Salesforce 30-Day - Salesforce.com");

}

}

