package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FH {
	public void writeDataFromFile(String filepath, String filename, String Data) throws IOException
	{
		File  f = new File(filepath+"/"+filename);
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write("Hello World");
		bw.flush();
		bw.close();
		//fw.write(Data);
	//	fw.flush();
		//fw.close();
	}
	
	public void readDataFromFile(String filepath, String filename, String Data) throws IOException 
	{
		//File f = new File("C:\\Users\\SAMUEL PC\\Desktop\\Selenium Java\\test.txt");
				File f = new File(filepath+"/"+filename);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String s =br.readLine();
				//int i =fr.read();
				while(s!=null) 

		
		{
			System.out.println(s);
			s = br.readLine();
			//System.out.print((char)i);
			//i =fr.read();
		}
	}

}
