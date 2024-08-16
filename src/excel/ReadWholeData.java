package excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ReadWholeData {

public static void main(String[] args) throws EncryptedDocumentException,
IOException {

FileInputStream myFile = new FileInputStream("D:\\selenium\\exceldata\\velocityData.xlsx");

Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
// row-->0-4, cell-->0-2
// outer loop for row
for (int i = 0; i <= 4; i++) {
// inner loop for cell
for (int j = 0; j <= 2; j++) {
	
double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
System.out.print(value + " ");
}
System.out.println();
}
}
}