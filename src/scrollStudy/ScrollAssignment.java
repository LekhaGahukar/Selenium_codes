package scrollStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAssignment {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/");
		Thread.sleep(3000);
	    WebElement enterEmail = driver.findElement(By.name("EMAIL"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    Thread.sleep(3000);
	    js.executeScript("arguments[0].scrollIntoView(true)",enterEmail);
	    enterEmail.sendKeys("lekha.gahukar@google.com");
	    WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
	    js.executeScript("arguments[0].click()",button);
	    
		
	}

}
