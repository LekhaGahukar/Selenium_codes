package coverFox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Execution {

	public static void main(String[] args) throws InterruptedException 
	{
		//for disable notification
		ChromeOptions ot = new ChromeOptions();
		ot.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(ot);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		Thread.sleep(3000);
		
		//home page
		driver.findElement(By.xpath("//div[text()='Male']")).click();
		Thread.sleep(3000);
		
		//home page//health-plan page
		driver.findElement(By.className("next-btn")).click();
		Thread.sleep(3000);
		
		//coverfox.com/health-plan/member-details
		WebElement dropDown = driver.findElement(By.id("Age-You"));		
		Select s=new Select(dropDown);
		s.selectByValue("28y");
		driver.findElement(By.className("next-btn")).click();
		Thread.sleep(6000);
		
		
		//coverfox.com/health-plan/address-details
		//enter pincode
		driver.findElement(By.className("mp-input-text")).sendKeys("440036");	
		//enter mobile number
		driver.findElement(By.id("want-expert")).sendKeys("8600553956");
		driver.findElement(By.className("next-btn")).click();
		Thread.sleep(9000);
		
		//coverfox.com/health-plan/results/combined
		String myText =driver.findElement(By.xpath("//div[contains(text(),'Insurance Plans')]")).getText();
		String[] ar = myText.split(" ");
		String numberInString = ar[0];
		int result = Integer.parseInt(numberInString);
		System.out.println(result);
		
		//no of company matching your age
		List<WebElement> banner = driver.findElements(By.xpath("//div[@class='plan-card-container']"));
		int numberofbanner = banner.size();
		if(result==numberofbanner)
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
		
		
		
		

	}

}
