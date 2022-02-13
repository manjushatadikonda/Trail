import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actions {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\saita\\\\Desktop\\\\Manju Workspace\\\\Trail\\\\jars\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
       WebDriverWait wait=new WebDriverWait(driver,20);
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.navigate().to("https://www.amazon.in/");
        Actions a= new Actions(driver);
        WebElement mouseover=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1\']"));
        a.moveToElement(mouseover).build().perform();
        WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));		
	    a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("masks").build().perform();
	    a.keyUp(Keys.SHIFT).build().perform();
	    a.keyDown(Keys.COMMAND).sendKeys("a"+"c").build().perform();
	    a.moveToElement(driver.findElement(By.xpath("//a[text()='Amazon Pay']"))).click().build().perform();
	    a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().build().perform();
	    a.keyDown(Keys.COMMAND).sendKeys("v").build().perform();
	    
	}
}
