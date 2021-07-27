package ReadExcelFile;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path="‪‪F:/Login.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("log");
		int rowcount =sh.getPhysicalNumberOfRows();
		int colcount=sh.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				Cell cl = sh.getRow(i).getCell(j);
				System.out.println(cl);
			}
		}
		

	}

}
