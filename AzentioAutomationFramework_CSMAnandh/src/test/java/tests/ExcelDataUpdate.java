package tests;

import dataProvider.ExcelData;

public class ExcelDataUpdate {
	public static void main(String args[])
	{
		String testDataPath = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
		ExcelData exelDataForGeneralLedger = new ExcelData(testDataPath, "ChargeWaiverExecutionTracker", "TestCaseID");
		exelDataForGeneralLedger.updateTestData("CW_019", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_020", "ExecuteYes/No", "Yes");
		/*exelDataForGeneralLedger.updateTestData("CW_002", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_003", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_004", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_005", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_006", "ExecuteYes/No", "Yes");
		exelDataForGeneralLedger.updateTestData("CW_007", "ExecuteYes/No", "Yes");*/
	//CSM_Transaction
		/*ExcelData exelDataForGeneralLedger = new ExcelData(testDataPath, "CSM_Transaction", "DataSet ID");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_001", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_002", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_003", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_004", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_005", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_006", "Less Exemption Date", "01/01/2017");
		exelDataForGeneralLedger.updateTestData("DS01_TC_CW_007", "Less Exemption Date", "01/01/2017");*/
	}

}
