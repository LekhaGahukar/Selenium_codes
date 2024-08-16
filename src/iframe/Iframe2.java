package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.letskodeit.com/practice");
				//driver.switchTo().frame(1);
				driver.switchTo().frame("iframe-name");
				WebElement mytext = driver.findElement(By.xpath("//h1[text()=\"All Courses\"]"));
                String result = mytext.getText(); 
              
               
                System.out.println(result);
	}

}
