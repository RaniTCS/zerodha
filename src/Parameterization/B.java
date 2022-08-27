package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B 
{
    public static void main(String[] args) throws Throwable
    {
		//create object of file input streamclass
    	FileInputStream file=new FileInputStream("C:\\Users\\Rajashri Awari\\Documents\\Par.xlsx");
    	//open excel sheet using create method
    	double data = WorkbookFactory.create(file).getSheet("Par").getRow(1).getCell(1).getNumericCellValue();
    	//print data in exel sheet
    	System.out.println(data);
    	
		
	}
}
