package tableStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTableData {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		WebElement findData = driver.findElement(By.xpath("//table[@id='customers']//tr[6]//td[3]"));
		
		String data = findData.getText();
		System.out.println(data);
		

	}

}
