package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderList_Ex {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("india");
		Thread.sleep(1000);
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(result.size());
		Thread.sleep(1000);
		for(WebElement r:result)
		{
		System.out.println(r.getText());
		}
		Thread.sleep(1000);
		String reqired="india australia match";
		for(WebElement r:result)
		{
		String actualText = r.getText();
		Thread.sleep(1000);
		if(actualText.equals(reqired))
		{
		r.click();
		break;
		}
		}
	}

}
