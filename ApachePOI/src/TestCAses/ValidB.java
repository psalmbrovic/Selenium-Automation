package TestCAses;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ValidB {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("");
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet s1 = wk.createSheet("Selenium");
		XSSFRow r1 = s1.createRow(0);
		XSSFCell c1 = r1.createCell(0);
		c1.setCellValue("Hello World");
		wk.write(fs);
		wk.close();
		

			}

}
