package TestCAses;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exercise1 {
	public static void main(String[] args) {
		
		//Blank Workbook
		XSSFWorkbook wk = new XSSFWorkbook();
		
		//Create a blank Sheet
		XSSFSheet sh = wk.createSheet("Employee Data");
		
		
		//This data needs to be written (Object[])
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1",new Object[] {"ID","Name","LastName"});
		data.put("2",new Object[] {"1","sam","Aba"});
		data.put("3",new Object[] {"2","samuel","abatan"});
		data.put("4",new Object[] {"3","ade","Adeshina"});
		data.put("5",new Object[] {"4","damola","ademola"});
		
		//Iterate over data and write to sheet
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) 
		{
			Row rw = sh.createRow(rownum++);
			Object [] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) 
			{
				Cell cell = rw.createCell(cellnum++);
				if (obj instanceof String)
					cell.setCellValue((String)obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}
		try
		{
			//write the workbook in file system
			FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo"));
			wk.write(out);
			out.close();
			System.out.println("howtodoinjava_demo.xlsx written successfully on disk");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
