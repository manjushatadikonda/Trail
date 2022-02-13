

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.javac.util.List;

public class calendar {
	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\saita\\\\Desktop\\\\Manju Workspace\\\\Trail\\\\jars\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //WebDriverWait wait=new WebDriverWait(driver,20);
        driver.navigate().to("https://www.path2usa.com/travel-companions");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// 5 sec wait gives each line a barrier of 5 sec
        driver.findElement(By.id("travel_date")).click();
        while(!driver.findElement(By.xpath("//table[@class=' table-condensed']//th[@class='datepicker-switch']")).getText().contains("March"))//first checks for current month if it is same as our required month then it does not go inside loop and directly executes the main selection of date function else it clicks on next 
        {
        	driver.findElement(By.xpath("//table[@class=' table-condensed']//th[@class='next']")).click();
        }
   
        java.util.List<WebElement> date=driver.findElements(By.xpath("//td[@class='day']"));
        int count= date.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
         String s=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
        	if(s.equalsIgnoreCase("27"))//to select the date 27th in the current month
        	{
        		driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
        	    break;
        	}
        }
       driver.quit();
}
}

