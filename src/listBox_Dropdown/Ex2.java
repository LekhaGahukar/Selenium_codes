package listBox_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		WebElement findday = driver.findElement(By.name("birthday_day"));		
		Select s2=new Select(findday);		
		s2.selectByIndex(30);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s3=new Select(month);
		s3.selectByValue("1");
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select s4=new Select(year);
		s4.selectByVisibleText("1993");
		
			
	}

	
}
