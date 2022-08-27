package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class C
{
    public static void main(String[] args) throws Throwable 
    {
		//create object of FileInputString class
    	FileInputStream file=new FileInputStream("C:\\Users\\Rajashri Awari\\Documents\\Par.xlsx");
    	//open exel sheet using create method
    	String data = WorkbookFactory.create(file).getSheet("Par").getRow(1).getCell(0).getStringCellValue();
    	System.out.println(data);
    	
	}
}
