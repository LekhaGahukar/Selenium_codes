package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction1 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		WebElement from = driver.findElement(By.xpath("//input[@type='text']"));
        from.sendKeys("nag");
		
        Actions act=new Actions(driver);
        Thread.sleep(1000);
        //act.click(from).perform();
      
    	act.sendKeys(Keys.ARROW_DOWN).perform();
    	//act.sendKeys(Keys.ARROW_DOWN).perform();
      
        act.sendKeys(Keys.ENTER).perform();
        
       
	}

}
