package commonMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//wait
		//Utility.sleep(driver, 6000);
		//scrolling
		WebElement elementLocate = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));		
		Utility.scrollMethod(driver, elementLocate);
		Utility.sleep(driver, 6000);
		//screenshot
		//Utility.screenshot(driver,"screeshot_one");
		
		//click()
		//WebElement newelement = driver.findElement(By.id("opentab"));
		//Utility.clickAction(newelement);
		
		//WebElement newelement1 = driver.findElement(By.xpath("//button[text()='Home']"));
		//Utility.clickAction(newelement1);		
		
		//excel
		WebElement inputfield = driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']"));
		inputfield.sendKeys(Utility.readExcelsheet("D:\\selenium\\exceldata\\velocityData.xlsx","Sheet4", 1, 1));
		
		
		
		
		
		
	}

}
