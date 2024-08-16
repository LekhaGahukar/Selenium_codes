package scrollStudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(90,1500)");
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(90,500)");
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(90,-1500)");
		
		

	}

}
