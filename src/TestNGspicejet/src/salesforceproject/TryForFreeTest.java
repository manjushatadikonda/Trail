package TestNGspicejet.src.salesforceproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TryForFreeTest extends TestBase{
	User user=null;
	
   TryForFree tryfreeobj=null;
    
    
	
	
@Test(priority=0)
public void validateuser()
{
	user=new User("Manju","Tadikonda","QA Analyst","123@gmail.com","123457890","IBM","United States","1 - 20 employees");
	
	tryfreeobj=new TryForFree(driver);
	WebElement check=tryfreeobj.detailsform(user);
	//WebElement check1=tryfreeobj.detailsform(user)
	Assert.assertEquals(check.getAttribute("value"),"Manju");
}
}
