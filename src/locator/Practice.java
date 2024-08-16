package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement myaccount =driver.findElement(By.xpath("//a[@title=\"My Account\"]"));
		myaccount.click();
	
		
		driver.findElement(By.linkText("Login")).click();
		
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("123qwer@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		String myorder=driver.findElement(By.xpath("//h2[text()=\"My Orders\"]")).getText();
		if(myorder.equals("My Orders"))
		{
			System.out.println("Login successfull");
		}
		else
		{
			System.out.println("Invalid User Name & Password ");
		}
		//System.out.println(myorder);
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
