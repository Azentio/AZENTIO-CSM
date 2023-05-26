package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataProvider.ExcelData;
import dataProvider.ExcelReader;

public class ExcelTest {
	String path;
	String sheetName;
	String columnName;

	public ExcelTest(String path, String sheetName, String columnName) {
		this.path = path;
		this.sheetName = sheetName;
		this.columnName = columnName;
	}

	public  List<String> getTestCaseTagsfromExcel() {
		ExcelReader excelReader = new ExcelReader(path);
		List<String> li = new ArrayList<String>();
		int columnCount = excelReader.getRowCount(sheetName);
		for (int i = 2; i <=columnCount; i++) {
			String cellData = excelReader.getCellData(sheetName, columnName, i);
			if (!(cellData.isBlank())) {
				li.add(cellData);
			}
			
		}
		return li;
	}

	public static void main(String[] args) {
		String path = System.getProperty("user.dir") +"\\TestData\\CSMparamTestData.xlsx";
		ExcelData data = new ExcelData(path, "CSM_Accountparameters", "DataSet ID");
		Map<String, String> testdata = data.getTestdata("CHB_180 _D3");
		System.out.println(testdata.get("Code"));
	}

}
