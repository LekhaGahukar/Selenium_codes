package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCellCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("D:\\selenium\\exceldata\\velocityData.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int lastRow = mysheet.getLastRowNum();
		System.out.println("TotalRow= "+lastRow);
		int totalRowNum = lastRow;
		
		short lastcell = mysheet.getRow(0).getLastCellNum();
		//System.out.println(lastcell); 
         int totalCellNum = lastcell-1;
         System.out.println("TotalColumn= "+totalCellNum);
         
         for(int i=0;i<=totalRowNum;i++)
         {
        	 for(int j=0;j<=totalCellNum;j++)
        	 {
        		Cell myCell = mysheet.getRow(i).getCell(j);
        		CellType myCellType = myCell.getCellType();
        		//System.out.print(myCellType+" ");  
        		if(myCellType==CellType.STRING)
        		{
        			System.out.print(myCell.getStringCellValue()+" " );
        		}
        		else if(myCellType==CellType.NUMERIC)
        		{
        			System.out.print(myCell.getNumericCellValue()+" ");
        		}
        		else if(myCellType==CellType.BOOLEAN)
        		{
        			System.out.print(myCell.getBooleanCellValue()+" ");
        		}
        		
        		 
        	 }
        	 System.out.println();
         }
         
         
	}

}
