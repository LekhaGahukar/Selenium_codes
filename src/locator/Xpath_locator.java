package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		//input[@name='firstname']
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Software");
		
		//input[@name='lastname']
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Testing");
		
		//input[@name='reg_email__']
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8633445566");
		
		//input[@name='reg_passwd__']
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("velocity1993");
		
		//select[@name='birthday_day']
		//driver.findElement(By.xpath("//select[@id='day']")).sendKeys("31");
		
	}

}
