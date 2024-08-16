package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println(defaultSize);
		
		Thread.sleep(1000);
		Dimension d=new Dimension(200,1050);
		driver.manage().window().setSize(d);
		
		Thread.sleep(1000);
		Dimension d1=new Dimension(1050,50);
		driver.manage().window().setSize(d1);
		
	}

}
