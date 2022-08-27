package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A
{
   public static void main(String[] args) throws Throwable
   {
	   //create object of file input stream class
	   FileInputStream file=new FileInputStream("C:\\Users\\Rajashri Awari\\Documents\\may 7.xlsx");
	   //open exel sheet using create method
	  // double data = WorkbookFactory.create(file).getSheet("may 7").getRow(0).getCell(0).getNumericCellValue();
	   //print data in exel sheet
	  // System.out.println(data);
	  // String data = WorkbookFactory.create(file).getSheet("may 7").getRow(2).getCell(2).getBooleanCellValue();
	   //System.out.println(data);
	   String data = WorkbookFactory.create(file).getSheet("may 7").getRow(2).getCell(0).getStringCellValue();
	   System.out.println(data);
	   
	  
}
}
//("C:\\Users\\Ankush\\OneDrive\\Documents\\may7.xlsx");