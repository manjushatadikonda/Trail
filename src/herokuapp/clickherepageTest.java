package herokuapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class clickherepageTest extends TestBase

{
clickherepage page1=null;
statuscode200page codepage=null;


@Test(priority=0)
public void clickstatuscodelink()
{
	page1=new clickherepage(driver);
	codepage=new statuscode200page(driver);
	codepage= page1.clickstatuscode();
	Assert.assertEquals(codepage.geturl(),"https://the-internet.herokuapp.com/status_codes/200");

}
}
