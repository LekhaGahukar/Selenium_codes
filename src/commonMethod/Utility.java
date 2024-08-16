package commonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	//excelData
	//screenShot
	//click
	//scroll
	// wait-->implicit
	
	public static void scrollMethod(WebDriver driver,WebElement element)
	{
     		JavascriptExecutor js= (JavascriptExecutor)driver;
     		js.executeScript("arguments[0].scrollIntoView(true)",element);
     		
	}
	
	public static void screenshot(WebDriver driver,String filename) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\AKSHAY\\Desktop\\screenshotselenium\\"+filename+".png");
		FileHandler.copy(src,des);
	}
	public static void clickAction(WebElement element)
	{
		element.click();
	}

	public static String readExcelsheet(String filepath,String sheetNum,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream(filepath);
		String value = WorkbookFactory.create(myfile).getSheet(sheetNum).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;		
		
	}
	public static String readDataFromPropertiesFile(String key) throws IOException
	{

	FileInputStream myFile= new
	FileInputStream(System.getProperty("user.dir")+"\\fbTest.properties");
	Properties prop= new Properties();
	prop.load(myFile);
	String value = prop.getProperty(key);
	return value;
	}
	public static void sleep(WebDriver driver,long time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	

}
