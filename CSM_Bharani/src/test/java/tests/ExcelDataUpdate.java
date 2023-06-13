package tests;

import java.util.Map;

import dataProvider.ExcelData;

public class ExcelDataUpdate {
	public static void main(String args[])
	{
		String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	    ExcelData csmTransactionsExcelData = new ExcelData(path, "Transactions", "Data Set ID");
	    Map<String, String> testData;
	    testData= csmTransactionsExcelData.getTestdata("DS01_TRS_096");
	    System.out.println(testData.get("TRXType_CurrencyCode"));
	}

}
