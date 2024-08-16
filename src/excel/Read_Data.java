package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream myfile=new FileInputStream("D:\\selenium\\exceldata\\velocityData.xlsx");
	Workbook myWorkBook = WorkbookFactory.create(myfile);
	Sheet mySheet = myWorkBook.getSheet("Sheet2");
	Row myRow = mySheet.getRow(3);
	Cell myCell = myRow.getCell(0);
	double value = myCell.getNumericCellValue();
	System.out.println(value);
	
	}

}
