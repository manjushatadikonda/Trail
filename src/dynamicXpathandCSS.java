import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpathandCSS {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","/Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriver 2");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        //By using dynamic Xpath: for standard attributes id name and classname if it is alpha numeric then we cannot use those to findelement so dynamic xpath can be used here as //tagname[contains(@attribute,'till where the static value is only that value can be written here')]"
	    //static values but using dynamic xpath syntax
        driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Manjusha");
	    driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("hbfjbs");
	   //dynamic Xpath
	    driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).click();
	    //By using CSS only the syntax changes: static CSS:tagname[attribute='value']and dynamic CSS: tagname[@attribute ='value']
	    //static values but using dynamic css syntax
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Manjusha");
	    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hadjjk");
	    //dynamic CSS
	    driver.findElement(By.cssSelector("button[id*='u_0']")).click();
	    Thread.sleep(3000);
        driver.quit();
	}
}
package files;

public class payload {
	
	public static String MissingTitleField()
	{
		return "{\n"
				+ "    \"author\": \"John Smith\"\n"
				+ "}";
	}
	
	public static String MissingAuthorField()
	{
		return "{\n"
				+ "    \"title\": \"Reliability of late night deployments\"\n"
				+ "}";
	}
	
	public static String EmptyAuthorField()
	{
		return "{\n"
				+ "    \"author\": \"\",\n"
				+ "    \"title\": \"Reliability of late night deployments\"\n"
				+ "}";
	}
	
	public static String EmptyTitlerField()
	{
		return "{\n"
				+ "    \"author\": \"John Smith\",\n"
				+ "    \"title\": \"\"\n"
				+ "}";
	}
	
	public static String ContainsIdField()
	{
		return "{\n"
				+ "	\"id\": 1,\n"
				+ "    \"author\": \"John Smith\",\n"
				+ "    \"title\": \"Reliability of late night deployments\"\n"
				+ "}";
	}
	
	public static String RightPayload()
	{
		return "{\n"
				+ "    \"author\": \"John Smith\",\n"
				+ "    \"title\": \"Reliability of late night deployments\"\n"
				+ "}";
	}

}
