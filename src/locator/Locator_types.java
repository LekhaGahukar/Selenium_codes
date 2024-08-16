package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_types {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Class Locator
        driver.findElement(By.className("radioButton"));
       // radioButtonField.click();
        
        //LinkText Locator
         //WebElement openwindowbutton=driver.findElement(By.linkText("Open Tab"));
        // openwindowbutton.click();
        
        //PartialLinkText Locator
        
        // driver.findElement(By.partialLinkText("Open")).click();
       // driver.findElement(By.linkText("Open Tab")).click();
        
        //CSS Selector
        
        driver.findElement(By.cssSelector("button#openwindow")).click();
        driver.findElement(By.cssSelector("input.radioButton")).click();
        driver.findElement(By.cssSelector("input[name=checkBoxOption1]")).click();
        
        
        
	}

}
