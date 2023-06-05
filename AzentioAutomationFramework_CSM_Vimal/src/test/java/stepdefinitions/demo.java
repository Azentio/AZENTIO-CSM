package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import vimal.UserUtility;

public class demo {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		UserUtility.previousDate();
		
//		Map<K, V> map = new HashMap<>();        
	      
		 XSSFWorkbook Workbook = new XSSFWorkbook(new File(System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx"));
		 
		 XSSFSheet sheet = Workbook.getSheet("CSMTransactionStaffAcc");
		 
		int noOfRows = sheet.getPhysicalNumberOfRows();
		
		int noOfCols = sheet.getRow(sheet.getFirstRowNum()).getPhysicalNumberOfCells();
		
		System.out.println(noOfRows + " "+ noOfCols);
		 
		 for (int i = 0; i < noOfRows; i++) {
			
			 
			 
			 Row row = sheet.getRow(i);
			 Cell cell = row.getCell(i);
			 
			 String mapValue = cell.getStringCellValue();
			 
			 Map<String,Map<String, String>> nestedMap = new HashMap<>();

			 HashMap<String,String> map1 = new HashMap<String,String>();
			 
			 for (int j = 0; j < noOfCols; j++) {
				 
				 row = sheet.getRow(j);
				 cell = row.getCell(j);
				 
				 map1.put(cell.getStringCellValue(), cell.getStringCellValue());
				 
			}
			 
			 nestedMap.put(mapValue, map1);
		}
		 
//		 System.out.println(nestedMap);
	}
}
