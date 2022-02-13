
/*Flow for the Java Alert
Open Chrome Browser.
Hit on http://demo.automationtesting.in/Alerts.html
Click on “Alert” button.
Print the text present at the alert box in the console.
Click on “Confirmation” button.
Print the text shown at the alert in the console.
Click on cancel button in the java alert.
Click on “Prompt” button.
Enter “Testing” in the prompt button and click on ok. (Hint: Even though entered text not seen while executing, after execution if error didn’t show means it is pass).
Count the number of buttons present in the page.
Print the same in the console.
*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","/Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
       driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
       Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.switchTo().alert().dismiss();
        String s= driver.findElement(By.xpath("//div[@id='CancelTab']")).getText();
        System.out.println(s);
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        driver.switchTo().alert().sendKeys("Testing");
        driver.switchTo().alert().accept();
        String s1= driver.findElement(By.xpath("//div[@class=' nav nav-tabs']")).getText();
        System.out.println(s1);
        driver.quit();
	}
        
	
	}

