package miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderList {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("India");
        Thread.sleep(1000);
        List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
        System.out.println(result.size());
        
        //for each
        
        //for(WebElement r:result)
        //{
        //	System.out.println(r.getText());
       // }
        
        //for Loop
       /* for(int i=0;i<=result.size()-1;i++)
        	
        {
        	System.out.println(result.get(i).getText());
        }*/
        
        Iterator<WebElement> it = result.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next().getText());
        }
        
        
	}

}
