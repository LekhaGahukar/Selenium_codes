package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestEx {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream myfile=new FileInputStream("D:\\selenium\\exceldata\\velocityData.xlsx");
	//String result = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue(); 
	//System.out.println(result); 
	double result1 = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(3).getCell(1).getNumericCellValue();
	System.out.println(result1); 
	}

}
