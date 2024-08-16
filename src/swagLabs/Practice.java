package swagLabs;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {
	    public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");		
		//home page		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");		
		driver.findElement(By.className("btn_action")).click();		
		//saucedemo.com/v1/inventory.html
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_item']"));
		int totalItems = items.size();
		System.out.println(totalItems);		
		//add to cart
		String mytext = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).getText();
		System.out.println(mytext);		
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[5]")).click();
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[4]")).click();
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[3]")).click();
		driver.findElement(By.id("shopping_cart_container")).click();	
	    //checkout
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();		
		//address details
		driver.findElement(By.id("first-name")).sendKeys("Lekha");
		driver.findElement(By.id("last-name")).sendKeys("Gahukar");
		driver.findElement(By.id("postal-code")).sendKeys("440036");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		
	}

}
