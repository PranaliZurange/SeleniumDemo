package ReadFileData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	FileInputStream fis=new FileInputStream(".//Data/Book1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	Row firstrow=sh.getRow(0);
	int rowcount=sh.getPhysicalNumberOfRows();
	for (int i = 0; i <rowcount; i++) 
	{
		for (int j = 0; j < firstrow.getLastCellNum(); j++) 
		{
		Cell cl=sh.getRow(i).getCell(j);
		System.out.print(cl);
	System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println("------------------");
	System.out.println(sh.getRow(4).getCell(0).toString());
	System.out.println(System.getProperty("user.dir"));
	}

}
