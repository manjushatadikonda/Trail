package herokuapp;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class redirectionpageTest extends TestBase{

	WebDriver driver=null;
	TestBase test=null;
	redirectionpage home=null;
	clickherepage here=null;
	
@BeforeClass
public void initialize()
{
	test=new TestBase();
	driver=test.initializedriver();
	home=new redirectionpage(driver);
	
}


@Test(priority=0)
public void testtitle()
{
	Assert.assertEquals(home.getTitle(),"The Internet");
	
}
@Test(priority=1)
public void clickherelink()
{
	here= home.clickhere();
	Assert.assertEquals(here.geturl(),"https://the-internet.herokuapp.com/status_codes");

}
}
