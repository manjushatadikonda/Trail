
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriverjar");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,30);
	driver.manage().window().maximize();
	driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
	
	// checkbox selection
	//driver.findElement(By.xpath("//input[@label='blah']")).click();
	WebElement hi=driver.findElement(By.xpath("//input[@label='blah']"));
	hi.findElement(By.xpath(null))
	//ckick on remove button if checkbox is selected
	if(driver.findElement(By.xpath("//input[@label='blah']")).isSelected())
	{
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
	}
	else
		System.out.println("checkbox not selected");
	
	
	//to verify whether checkbox is deleted
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@label='blah']")));
	boolean condition =driver.findElements(By.xpath("//input[@id='checkbox']")).size()>0;
	
	if(!condition)
	{
		System.out.println("checkbox removed");
		
	}
	else
		System.out.println("checkbox still exists");
	
	//Add button
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	
	//verify if checkbox is added again
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Add']")));
	boolean condition1 =driver.findElements(By.xpath("//input[@id='checkbox']")).size()>0;
	
	if(condition1)
	{
		System.out.println("checkbox is added");
		
	}
	else
		System.out.println("checkbox not added yet");
	
	//enable button
	driver.findElement(By.xpath("//button[text()='Enable']")).click();
	
	//verify if we are able to add data to text field
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[2]/div/div[1]/form[2]/p"),"It's enabled!"));
	WebElement textfield=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[2]/input"));
	boolean condition2= textfield.isEnabled();
	if(condition2)
	{
		System.out.println("text field enabled");
	}
	else
		System.out.println("text field is not enabled");
	
	//sendkeys to text field
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/form[2]/input")));
	driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[2]/input")).sendKeys("Manju");
	
	//disable button
	driver.findElement(By.xpath("//button[text()='Disable']")).click();
	
	//verify if text field is disabled
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div[2]/div/div[1]/form[2]/p"),"It's disabled!"));
	WebElement textfield1=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[2]/input"));
	boolean condition3= textfield1.isEnabled();
	if(!condition3)
	{
		System.out.println("text field disabled");
	}
	else
		System.out.println("text field is still enabled");
		
}
}
