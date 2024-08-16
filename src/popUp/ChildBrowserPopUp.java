package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allwindow=driver.getWindowHandles();
		System.out.println(allwindow);
		
		Iterator<String> it=allwindow .iterator();
		String mainpage=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("the7-search")).sendKeys("Pop Up ex");
		driver.close();
		
		driver.switchTo().window(mainpage);
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("home")).click();
		driver.close();
	}

}
