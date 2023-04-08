package tests;

import dataProvider.ExcelData;

public class ExcelDataUpdate {
	public static void main(String args[])
	{
		String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
		ExcelData exelDataForGeneralLedger = new ExcelData(testDataPath, "CSMParam_GeneralLedgerTestData", "DataSet ID");
		exelDataForGeneralLedger.updateTestData("DS01_Pre_req_GL_01", "Code", "9641");
	}

}
