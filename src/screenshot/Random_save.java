package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Random_save {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     String random=RandomString.make(4);
	     File des=new File("C:\\Users\\AKSHAY\\Desktop\\screenshotselenium\\Test2"+random+".png");
	     FileHandler.copy(src, des);
	     
	    
	}

}
