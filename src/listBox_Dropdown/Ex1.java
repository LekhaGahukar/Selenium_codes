package listBox_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        WebElement dropdownList = driver.findElement(By.id("dropdown-class-example"));
        
        Select s1=new Select(dropdownList);
        
       // s1.selectByIndex(3);
        //s1.selectByValue("option1");
        s1.selectByVisibleText("Option2");
        
        
	}

}
