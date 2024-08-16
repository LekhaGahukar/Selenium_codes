package testNGVerificationAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertStudy {

	@Test
	public void facebook() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement customGender = driver.findElement(By.xpath("//input[@value='-1']"));
		boolean result = customGender.isDisplayed();
		Assert.assertFalse(result);
		
	}

}
