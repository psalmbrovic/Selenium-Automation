package TestCAses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Valid {
	public static void main(String[] args) throws IOException {
		//Need to make connection with excel file
		FileInputStream fs =new FileInputStream("C:\\Users\\SAMUEL PC\\Documents\\selenium.xlsx");
		
		//Create Workbook Class Object
		//XSLX -----Class name will start from XSSF and in case of XLS,class name start with HSSF
		
		XSSFWorkbook wk =new XSSFWorkbook(fs);
		XSSFSheet s1 = wk.getSheet("Sheet1");
		//XSSFRow r1 = s1.getRow(0);
		//XSSFCell c1 = r1.getCell(1);
		//System.out.println(c1.getStringCellValue());
		
		//to get number of rows
		
		//System.out.println("Number of Rows -" + s1.getPhysicalNumberOfRows());
		//System.out.println("Index of Last Number -" + s1.getLastRowNum());
		
		//XSSFRow r1 =s1.getRow(4);
		//System.out.println(r1.getPhysicalNumberOfCells());
		
		int r = s1.getPhysicalNumberOfRows();
		
		for (int i=0;i<r;i++) {
			XSSFRow r1 =s1.getRow(i);
			int c= r1.getPhysicalNumberOfCells();
			for (int j=0;j<c;j++) {
				XSSFCell c11 =r1.getCell(j);
				System.out.print(c11.getStringCellValue() + "   ");

			}
			
			System.out.println();
		}
		
	}

}
