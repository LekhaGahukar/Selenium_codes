package tableStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_perticular_column {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int totalRows = rows.size();
		System.out.println(totalRows);	
	    
		for(int i=2;i<=totalRows;i++)
		{
		WebElement singleColumn = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td[2]"));
		String second_column = singleColumn.getText();
		System.out.println(second_column);
		}
		
		

	}

}
