import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class emiratescompleteflow {
	public static void main(String[] args) throws InterruptedException {
		///Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriver 5
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","/Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriver 5");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.navigate().to("https://www.emirates.com/us/english/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;// Java Script to scroll the web page
		js.executeScript("window.scrollBy(0, 180)");// scroll the window to 200 pixels
        //fromcity
		//wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@class='clear-x-mobile icon icon-delete-light  js-clear-selected  dropdown__clear']"), 150));
        driver.findElement(By.xpath("//button[@class='clear-x-mobile icon icon-delete-light  js-clear-selected  dropdown__clear']")).click();
        //Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@name='Departure Airport']")).sendKeys("new");
      wait.until(ExpectedConditions
				.numberOfElementsToBeMoreThan(By.xpath("//ol[@class='location__list']//li[@class='location__item js-dropdown-select-item js-location-list']"), 150));
        List<WebElement> list1=driver.findElements(By.xpath("//ol[@class='location__list']//li[@class='location__item js-dropdown-select-item js-location-list']"));
        System.out.println(list1.size());
        for(int i=0;i<list1.size();i++)
        {
        	String fromcity=list1.get(i).getText();
        	System.out.println(fromcity);
        	if(fromcity.contains("NYC"))
        	{
        		list1.get(i).click();
        		break;
        	}
        }
	    //Tocity
        driver.findElement(By.name("Arrival Airport")).sendKeys("Col");
        wait.until(ExpectedConditions
				.numberOfElementsToBeMoreThan(By.xpath("//ol[@class='location__list']//li[@class='location__item js-dropdown-select-item js-location-list']"), 150));
        List<WebElement> list2=driver.findElements(By.xpath("//ol[@class='location__list']//li[@class='location__item js-dropdown-select-item js-location-list']"));
		System.out.println(list2.size());
        for (int k = 0; k < list2.size(); k++) {
			String tocity = list2.get(k).getText();
			System.out.println(tocity);

			if (tocity.contains("CLO")) {
				list2.get(k).click();
				break;
			}
		}
	   //traveldate
        driver.findElement(By.xpath("//input[@id='search-flight-date-picker--depart']")).click();
        while (!driver.findElement(By.xpath(
				"//div[@class='ek-datepicker__column-title'] //div[@class='ek-datepicker__column-label label-month']"))
				.getText().contains("January")) {
			driver.findElement(By.xpath("//a[text()='Next Month']")).click();
		}

		List<WebElement> fromDates = driver.findElements(By.xpath("//td[@class='ek-datepicker__day']"));
		int r = fromDates.size();
		System.out.println(r);
		for (int i = 0; i < r; i++) {
			String date = driver.findElements(By.xpath("//td[@class='ek-datepicker__day']")).get(i).getText();
			if (date.equalsIgnoreCase("5")) {
				driver.findElements(By.xpath("//td[@class='ek-datepicker__day']")).get(i).click();
				break;

			}

		}
		//returndate
		while (!driver.findElement(By.xpath(
				"//div[@class='ek-datepicker__column-title'] //div[@class='ek-datepicker__column-label label-month']"))
				.getText().contains("January")) {
			driver.findElement(By.xpath("//a[text()='Next Month']")).click();
		}

		List<WebElement> toDates = driver.findElements(By.xpath("//td[@class='ek-datepicker__day']"));
		int t = toDates.size();
		System.out.println(r);
		for (int i = 0; i < t; i++) {
			String date = driver.findElements(By.xpath("//td[@class='ek-datepicker__day']")).get(i).getText();
			if (date.equalsIgnoreCase("28")) {
				driver.findElements(By.xpath("//td[@class='ek-datepicker__day']")).get(i).click();
				break;

			}

		}
	   //passengersselect
		driver.findElement(By.xpath("//a[@name='toggle Passengers']")).click();
		//driver.findElement(By.xpath("//div[@datatype='adults']//span[@class='icon icon-plus']")).click();
		driver.findElement(By.xpath("//div[@data-type='adults'] //span[@class='icon icon-plus']")).click();
		driver.findElement(By.xpath("//div[@data-type='children'] //span[@class='icon icon-plus']")).click();
		driver.findElement(By.xpath("//div[@data-type='infants'] //span[@class='icon icon-plus']")).click();
	    driver.findElement(By.xpath("//a[@name='toggle search-flight-class']")).click();
	    driver.findElement(By.xpath("//p[text()='First Class']")).click();
	    driver.findElement(By.xpath("//button[@class='cta cta--large cta--primary js-widget-submit ']")).click();
	}
}

