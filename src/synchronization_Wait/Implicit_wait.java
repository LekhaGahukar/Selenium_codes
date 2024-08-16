package synchronization_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/home");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));//implicit wait


		// 6000--> page load 2000, 4000? save-->next execution or relese for other execution

		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	}

}
