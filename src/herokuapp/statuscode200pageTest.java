package herokuapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class statuscode200pageTest extends TestBase
{
	statuscode200page page2=null;
@Test(priority=0)
public void checkurl()
{
	page2=new statuscode200page(driver);
	Assert.assertEquals(page2.geturlstring(), "https://the-internet.herokuapp.com/status_codes/200");
}
}
