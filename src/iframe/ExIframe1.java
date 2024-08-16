package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExIframe1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.switchTo().frame("courses-iframe");
		WebElement myText = driver.findElement(By.xpath("//strong[text()=' Learn Earn & Shine']"));
		String result=myText.getText();
		System.out.println(result);

	}

}
