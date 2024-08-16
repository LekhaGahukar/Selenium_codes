package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadCompleteRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream myfile=new FileInputStream("D:\\selenium\\exceldata\\velocityData.xlsx");
	Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	
	for(int i=0;i<=1;i++)
	{
		double value = mySheet.getRow(2).getCell(i).getNumericCellValue();
		System.out.print(value+" ");
	}
	
	
	}

}
