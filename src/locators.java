import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriver 2");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F&pspid=2023538075&activity=ybar-signin");
	    //By ID: ID should not have space, if there is space it does not work
        //then we should go for other attributes classname or name. whatever the unique ID or name or Classname that should be used to find the exact element
        driver.findElement(By.id("login-username")).sendKeys("Manjusha");
	    driver.findElement(By.id("login-signin")).click();
	    driver.findElement(By.id("mbr-forgot-link")).click();
	    //By Name: 
	    driver.findElement(By.name("username")).sendKeys("Manjusha");
	    driver.findElement(By.name("signin")).click();
	    driver.findElement(By.linkText("Forgot username?")).click();
	    //By ClassName:if className has space in it then it does not work
	    driver.findElement(By.className("phone-no")).sendKeys("Manjusha");
	   // driver.findElement(By.className("pure-button puree-button-primary challenge-button")).click();
	    driver.findElement(By.linkText("Forgot username?")).click();
	    
	}

}

