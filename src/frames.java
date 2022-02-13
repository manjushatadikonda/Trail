import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\saita\\\\Desktop\\\\Manju Workspace\\\\Trail\\\\jars\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
       //WebDriverWait wait=new WebDriverWait(driver,20);
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	driver.navigate().to("https://jqueryui.com/droppable/");
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// 5 sec wait gives each line a barrier of 5 seconds to load the page
    Actions a= new Actions(driver);
    WebElement frames=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
    driver.switchTo().frame(frames);
    WebElement drag= driver.findElement(By.id("draggable"));
    WebElement drop= driver.findElement(By.id("droppable"));
    a.dragAndDrop(drag, drop).build().perform();
    driver.switchTo().defaultContent();
    //driver.close();
}
}
