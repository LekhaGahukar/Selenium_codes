package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_ratings_flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String rating = driver.findElement(By.xpath("((//div[contains(@class,'col')])[8]//span)[4]")).getText();
		System.out.println(rating);
		
		

	}

}
