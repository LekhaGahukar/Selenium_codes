package tableStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTableRow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		for(int i=1;i<=3;i++)
		{
		
		  WebElement tabledata = driver.findElement(By.xpath("//table[@id='customers']//tr[6]//td["+i+"]"));
		  String fetchRow = tabledata.getText();
		  System.out.println(fetchRow);

		}
	}

}
