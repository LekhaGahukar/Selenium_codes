package miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfLinks {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		//how many links are there?
		System.out.println(totalLinks.size() ); 
		
		//Print all Links
		//by using for Loop
	/*	for(int i=0;i<=totalLinks.size()-1;i++)
		{
			System.out.println(totalLinks.get(i).getText() ); 
		}*/
		
		//for each loop
		/*for(WebElement links:totalLinks)
		{
			System.out.println(links.getText());
		}*/
		Iterator<WebElement> it = totalLinks.iterator();
		while(it.hasNext())
		{
			String text=it.next().getText();
			System.out.println(text);
		}
		

	}

}
