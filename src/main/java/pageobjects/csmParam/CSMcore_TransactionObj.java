package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMcore_TransactionObj {
		
		WebDriver driver;	
		public CSMcore_TransactionObj(WebDriver driver)
		
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//td[text()='Transactions']")
		private WebElement transactions_Transactions;
		public WebElement transactionsTransactions()
		{
			return transactions_Transactions;
		}	
		@FindBy(xpath="//span[text()='Maintenance']")
		private WebElement transactions_MaintenanceScreen;
		public WebElement transactionsMaintenanceScreen()
		{
			return transactions_MaintenanceScreen;
		}
		@FindBy(xpath="//input[@id='lookuptxt_trx_type_D001MT']")
		private WebElement transactions_TrxTypeInput;
		public WebElement transactionsTrxTypeInput()
		{
			return transactions_TrxTypeInput;
		}
		@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
		private WebElement transactions_DepositAcc_BranchcodeInput;
		public WebElement transactionsDepositAccBranchcodeInput()
		{
			return transactions_DepositAcc_BranchcodeInput;
		}
		@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
		private WebElement transactions_CreditAcc_CurrencycodeInput;
		public WebElement transactionsCreditAccCurrencycodeInput()
		{
			return transactions_CreditAcc_CurrencycodeInput;
		}
		@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_GL']")
		private WebElement transactions_DebitAcc_GlcodeInput;
		public WebElement transactionsDebitAccGlcodeInput()
		{
			return transactions_DebitAcc_GlcodeInput;
		}
		@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
		private WebElement transactions_DebitAcc_CifcodeInput;
		public WebElement transactionsDebitAccCifcodeInput()
		{
			return transactions_DebitAcc_CifcodeInput;
		}
		@FindBy(xpath="//span[text()='close']")
		private WebElement transactions_Viewmemo_closebtn;
		public WebElement transactionsViewmemoclosebtn()
		{
			return transactions_Viewmemo_closebtn;
		}
		@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TRS_AC_SL']")
		private WebElement transactions_DebitAcc_SerialcodeInput;
		public WebElement transactionsDebitAccSerialcodeInput()
		{
			return transactions_DebitAcc_SerialcodeInput;
		}
		@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
		private WebElement transactions_Warning_Okbtn;
		public WebElement transactionsWarningOkbtn()
		{
			return transactions_Warning_Okbtn;
		}	
		
		
		@FindBy(xpath="//input[@id='trs_ac_cy_D001MT']")
		private WebElement transactions_DebitAcc_CurrencyInput;
		public WebElement transactionsDebitAccCurrencyInput()
		{
			return transactions_DebitAcc_CurrencyInput;
		}
		@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
		private WebElement transactions_EnterAmountInput;
		public WebElement transactionsEnterAmountInput()
		{
			return transactions_EnterAmountInput;
		}
		@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
		private WebElement transactions_CreditAcc_GlcodeInput;
		public WebElement transactionsCreditAccGlcodeInput()
		{
			return transactions_CreditAcc_GlcodeInput;
		}
		@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
		private WebElement transactions_CreditAcc_CifcodeInput;
		public WebElement transactionsCreditAccCifcodeInput()
		{
			return transactions_CreditAcc_CifcodeInput;
		}	
		@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_SL']")
		private WebElement transactions_CreditAcc_SerialcodeInput;
		public WebElement transactionsCreditAccSerialcodeInput()
		{
			return transactions_CreditAcc_SerialcodeInput;
		}
		@FindBy(xpath="//button[@id='trxMgntSaveBtn_D001MT']")
		private WebElement transactions_Maintance_Savebtn;
		public WebElement transactionsMaintanceSavebtn()
		{
			return transactions_Maintance_Savebtn;
		}
		@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
		private WebElement transaction_Trxsuccesspopup_Okbtn;
		public WebElement transactionTrxsuccesspopupOkbtn()
		{
			return transaction_Trxsuccesspopup_Okbtn;
		}
		@FindBy(xpath = "//input[@type='button'][@value='Ok']")
		private WebElement Confirm_Ok;
		public WebElement ConfirmOk() {
			return Confirm_Ok;
		}
		
		@FindBy(xpath="//span[text()='Approve']")
		private WebElement transactions_ApproveScreen;
		public WebElement transactionsApproveScreen()
		{
			return transactions_ApproveScreen;
		}
		@FindBy(xpath= "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
		private WebElement transactions_TransactionNo_InputValue;
		public WebElement transactionsTransactionNoInputValue()
		{
			return transactions_TransactionNo_InputValue;
		}
		
		@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
		private WebElement transactions_TransactionNo_Doubleclk;
		public WebElement transactionsTransactionNoDoubleclk()
		{
			return transactions_TransactionNo_Doubleclk;
		}	
		
		@FindBy(xpath="//span[contains(text(),' Approve ')]")
		private WebElement transactions_Approvescreen_Appbtn;
		public WebElement transactionsApprovescreenAppbtn()
		{
			return transactions_Approvescreen_Appbtn;
		}
		
		@FindBy(xpath="//a[@id='infoBarSearchButton_D001MT']")
		private WebElement transactions_Maintance_SearchIcon;
		public WebElement transactionsMaintanceSearchIcon()
		{
			return transactions_Maintance_SearchIcon;
		}
		@FindBy(xpath="//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
		private WebElement transactions_Maintance_BookedEntriesBtn;
		public WebElement transactionsMaintanceBookedEntriesBtn()
		{
			return transactions_Maintance_BookedEntriesBtn;
		}
		@FindBy(id = "hdr_runn_date")
		private WebElement CSM_DateToChangeTheCurrentDate;

		public WebElement CSMDateToChangeTheCurrentDate() {
			return CSM_DateToChangeTheCurrentDate;
		}

		@FindBy(id = "global_user_run_date")
		private WebElement CSM_DateInUserRunningDate;

		public WebElement CSMDateInUserRunningDate() {
			return CSM_DateInUserRunningDate;
		}

		@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
		private WebElement Transactions_transactionNo_codeValues;

		public WebElement Transactions_transactionNo_codeValues()

		{
			return Transactions_transactionNo_codeValues;
		}


		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement Transactions_successokbtn;

		public WebElement Transactions_successokbtn() {
			return Transactions_successokbtn;
		}
		@FindBy(xpath = "//div[contains(text(),'Saved Successfully')]")
		private WebElement getTransactionNumber;

		public WebElement getTransactionNumber() {
			return getTransactionNumber;
		}
		@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
		private WebElement CSM_UseButtonInChangeRunningDate;

		public WebElement CSMUseButtonInChangeRunningDate() {
			return CSM_UseButtonInChangeRunningDate;
		}

		@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
		private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

		public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
			return CSM_ClearCacheInTechnicalDetailsIcon;

		}

		@FindBy(id = "_popup_path_sol_ok")
		private WebElement CSM_OkButtonInInformationPopUpMenu;

		public WebElement CSMOkButtonInInformationPopUpMenu() {
			return CSM_OkButtonInInformationPopUpMenu;
		}
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;
		public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday()
		{
		    return csmOkButtonForConfirmationPopUpForCompanyHoliday;
		}
		@FindBy(id = "_header_rundate_dialog_close")
		private WebElement CSM_CloseButtonInChangeRunningDate;

		public WebElement CSMCloseButtonInChangeRunningDate() {
			return CSM_CloseButtonInChangeRunningDate;
		}

		@FindBy(id = "tech_details_icon")
		private WebElement CSM_TechnicalDetailsIcon;

		public WebElement CSMTechnicalDetailsIcon() {
			return CSM_TechnicalDetailsIcon;
		}

		@FindBy(id = "_popup_path_sol_ok")
		private WebElement CSM_OkButtonUnderInformationPopUp;

		public WebElement CSMOkButtonUnderInformationPopUp() {
			return CSM_OkButtonUnderInformationPopUp;
		}
		@FindBy(id = "_popup_path_sol_ok")
		private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

		public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
			return CSM_OkButtonInAccessDeniedPopUpMenu;
		}

		@FindBy(xpath = "//Input[@id='lookuptxt_trs_cy_D001MT']")
		private WebElement transactionsMaincCurrencyInput;
		public WebElement transactionsMaincCurrencyInput() {
			// TODO Auto-generated method stub
			return transactionsMaincCurrencyInput;
		}
		
		
		@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
		private WebElement CSM_enterTransactionNoUnderMaintenance;
		public WebElement CSMenterTransactionNoUnderMaintenance() {
			// TODO Auto-generated method stub
			return CSM_enterTransactionNoUnderMaintenance;
		}
		
		
		
		@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
		private WebElement CSM_clickOnEnteredTransactionNoUnderMaintenance;
		public WebElement CSMclickOnEnteredTransactionNoUnderMaintenance() {
			// TODO Auto-generated method stub
			return CSM_clickOnEnteredTransactionNoUnderMaintenance;
		}
		
		
		@FindBy(xpath = "//select[@name='trxMgntCO.ctstrsVO.TRSFR_METHOD']")
		private WebElement CSM_ModeOfPaymentDropdown_TransactionUnderMaintenance;
		public WebElement CSMModeOfPaymentDropdown_TransactionUnderMaintenance() {
			// TODO Auto-generated method stub
			return CSM_ModeOfPaymentDropdown_TransactionUnderMaintenance;
		}
		
		
		
		
		@FindBy(xpath = "//a[@role='button']//span[text()='close']")
		private WebElement CSM_CloseButtonForCurrencyPopScreen_TransactionUnderMaintenance;
		public WebElement CSMCloseButtonForCurrencyPopScreen_TransactionUnderMaintenance() {
			// TODO Auto-generated method stub
			return CSM_CloseButtonForCurrencyPopScreen_TransactionUnderMaintenance;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}



