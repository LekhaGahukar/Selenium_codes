package tableStudy;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExactWayToPrintTableData {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		int totalRow = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		 int totalColumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
		//outer loop
		 for(int i=1;i<=totalRow;i++)
		 {
			 //inner loop
			 for(int j=1;j<=totalColumn;j++ )
			 {
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/th["+j+"]")).getText();
				    System.out.print(text+" ");
				}
				else
				{
					String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				    System.out.print(text+" ");
				}
				
			 }
			 System.out.println();
		 }
		 
		
		}

}
