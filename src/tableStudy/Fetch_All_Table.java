package tableStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_All_Table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int totalRows = rows.size();
		System.out.println(totalRows);	
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tr[1]//th"));
	    int	totalColumn=cols.size();
	    System.out.println(totalColumn);
	    
	    //fetch header from table
	    for(int k=1;k<=totalColumn;k++)
	    {
	      String header=driver.findElement(By.xpath("//table[@id='customers']//tr[1]//th["+k+"]")).getText();
	      System.out.print(header+" "); 
	    }
	    System.out.println();
	    
	    //fetch all the data from table
	    //for loop for outer
	    for(int i=2;i<=totalRows;i++)
	    {
	    	//for loop for inner
	    	for(int j=1;j<=totalColumn;j++)
	    	{
	    		WebElement row_Column = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]"));
	    	    String allTable = row_Column.getText(); 
	            System.out.print(allTable+" ");
	    	}
	    	System.out.println();
	    }
	}

}
