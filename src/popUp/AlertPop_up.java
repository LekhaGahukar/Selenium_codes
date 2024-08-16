package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop_up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("1234");
        driver.findElement(By.cssSelector("input[name=submit]")).click();
        Thread.sleep(1000);
        Alert alt=driver.switchTo().alert();
        alt.accept();
        Thread.sleep(1000);
        System.out.println(alt.getText());
        Thread.sleep(1000);
        alt.accept();
        
        
	}

}
