package synchronization_Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait_JAvaWait {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/home");
		
		Thread.sleep(7000); //static wait or java wait
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		
		
	}

}
