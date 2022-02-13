/*
 * 1.open crickbuzz and select a random cricket match scorecard
 * 2.there will be many tables in it,we need to select the final scorecard table and take runs from that. to get this use the parent child relation in xpath to get the selected table and selected column results.
 * 3.make a list of runs by all players
 * 4.add all the runs
 * 5.add if any extras for total score
 * 6.get the total score directly from the table to compare with our sum;
 */












import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Handlinggrids {
public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","/Users/sandeepvecha/Desktop/Java Manju/ManjuSelinium/jars/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //WebDriverWait wait=new WebDriverWait(driver,20);
        driver.navigate().to("https://www.cricbuzz.com/live-cricket-scorecard/37671/eliminator-indian-premier-league-2021");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);// 5 sec wait gives each line a barrier of 5 sec
        java.util.List<WebElement> list1= driver.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']")); //select a static id that is unique randomly first, here innings1 id is unique for first table we require , later class is common for all the rows in it and class is common for the column of runs in it 
        int n=list1.size();
        System.out.println(n);
        int sum=0;
        for(int i=0;i<n;i++)
        {
        	String runscore=list1.get(i).getText();
        	int run=Integer.parseInt(runscore); //using parseInt we transfer string to int value
        	System.out.println(run);
        	sum=sum+run;
        }
        int extras= Integer.parseInt(driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText());
        sum=sum+extras;
        System.out.println(sum);
        int total=Integer.parseInt(driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-8 text-bold text-black text-right']")).getText());
        System.out.println(total);
        //assert.asserttrue(false);
}
}
