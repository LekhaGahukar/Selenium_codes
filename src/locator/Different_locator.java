package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Different_locator
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		driver.findElement(By.id("mobileNumber"));
		WebElement mobile=driver.findElement(By.name("mobileNumber"));
		mobile.sendKeys("8600553951");
	    System.out.println(mobile.isEnabled());
	    
	 }

}
