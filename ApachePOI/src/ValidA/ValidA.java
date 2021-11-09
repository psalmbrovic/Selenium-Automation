package ValidA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ValidA {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\SAMUEL PC\\Desktop\\Selenium Java\\selenium.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fs);
		XSSFSheet s1 = wk .getSheet("Sheet1");
		int r = s1.getPhysicalNumberOfRows();
		
		for (int i=0;i<r;i++) 
		{
			XSSFRow r1 =s1.getRow(i);
			XSSFCell cl =r1.getCell(0);
			
			
			//if (cl.getCellType()==1)
			{
				System.out.println(cl.getStringCellValue());
			}
		//	else if (cl.getCellType()==0) 
			{
				System.out.println(cl.getNumericCellValue());
			}
			//else if(cl.getCellType()==4)
			{
				System.out.println(cl.getBooleanCellValue());
			}
		}
		
	}

}
