package salesforcetest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class salesforecTest {
	WebDriver driver=null;
	salesforce sf=null;
	tryfree obj=null;
@Test
public void test1() throws InterruptedException
{
	sf=new salesforce();
	sf.setup();
	//obj=sf.clicktryfree();
	Assert.assertEquals(sf.getTitle(), "Sales Cloud Free Trial - Salesforce.com");
}
}
