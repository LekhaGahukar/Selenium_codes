package practice_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumbase.io/demo_page");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345678");
        driver.findElement(By.xpath("//textarea[@name='textareaName']")).sendKeys("Lekha kishor gahukar");
        driver.findElement(By.id("myTextInput2")).clear();
        driver.findElement(By.xpath("//button[contains(text(),' Me')]")).click();
        String text = driver.findElement(By.xpath("//p[@id='pText']")).getText();
        System.out.println(text);
        WebElement drop = driver.findElement(By.xpath("//select[@name='selectName']"));
        Select s1=new Select(drop);
        s1.selectByValue("75%");
        driver.findElement(By.id("radioButton2")).click();
        driver.findElement(By.xpath("//input[@name='checkBoxName1']")).click();
	}

}
