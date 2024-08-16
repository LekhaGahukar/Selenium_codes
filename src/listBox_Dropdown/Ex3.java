package listBox_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        
        WebElement multiDropdown=driver.findElement(By.id("cars"));
        Select s1=new Select(multiDropdown);
        System.out.println(s1.isMultiple());
        
        s1.selectByIndex(3);
        s1.selectByValue("saab");
        s1.selectByVisibleText("Volvo");
	}

}
