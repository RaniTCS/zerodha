package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class D
{
   public static void main(String[] args) throws Throwable
   {
	   //create object of file input stream
	   FileInputStream file=new  FileInputStream("C:\\Users\\Rajashri Awari\\Documents\\Par.xlsx");
	   //open the excel using create method
	   boolean data = WorkbookFactory.create(file).getSheet("Par").getRow(0).getCell(0).getBooleanCellValue();
	   //print data in excel sheet
	   System.out.println(data);
	   
	   
	   
	
}
}
