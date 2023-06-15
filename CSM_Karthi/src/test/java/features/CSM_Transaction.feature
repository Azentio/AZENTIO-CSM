Feature: To test the funcnalities of Transaction module

  @TRS_023
  Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_023
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the UPAA field under TransactionType
    And user Enter the code in UPAA field
    And user double click the code on UPAA field
    And user check the status of the AllowInternalGLAccount CheckBox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    And user Enter the SerialNo under TRXType
    And user validate the popup

  @TRS_024
  Scenario: Checking Single Transfer (Main Debit) Transaction Mode of Payment Cash - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_024
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the UPAA field under TransactionType
    And user Enter the code in UPAA field
    And user double click the code on UPAA field
    And user Enter the Arabicword No1 on UPAA screen
    And user Enter the Arabicword No2 on UPAA screen
    And user check the status of the AllowInternalGLAccount CheckBox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    And user Enter the SerialNo under TRXType
    And user validate the popup

  @TRS_027
  Scenario: Checking Cash Deposit Transaction - CV/FC
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_027
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    #And User Click on Technical Details Icon
    #And User Click Clear Cache in Technical Details Icon
    #And User Click Ok Button Under Information PopUp Menu
    And User click the Transactions
    Then Click the Maintenance Below the Transactions
    And enter the value in trx type
    Then enter values of Branch code
    And enter values of Currency code
    And enter values of Gl code
    And enter values of Cif code
    Then enter values of serial
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enters the Amount in this Checkbox
    And Enter the Amount in this Checkbox clicksomething
   And user check if the  value is entered or not
    #And user click the ok
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from sucess pop upforTRS_027
    And system show the popup success user click the ok button
    And close the transaction tab
    And User click the Approve screen
    Then user Enters the Transaction number forTRS_114
    And double click the Value
     And click the Approve button
    And system show the popup success user click the ok button
    #And system show the popup success user click the ok Button
    And User click the Maintenance screen
     #And user click the save ok Button
    Then click the search button
     Then user Enters the Transaction number forTRS_027
    And double click the data
    Then click the Booked Entries

  @TRS_025
  Scenario: Checking Cash Deposit Transaction - Currency Denomination
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_025
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontypeforTRS_025
    And User double click the record under updateafterapprove screenforTRS_025
    And user deal with the Currency Denomination chequebox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And User click the Transactions
    Then Click the Maintenance Below the Transactions
    And enter the value in trx type
    Then enter values of Branch code
    And enter values of Currency code
    And enter values of Gl code
    And enter values of Cif code
    Then enter values of serial
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    
    And user check if the  values is entered or not
    #And User Click Transactions Maintenance for loading Amount
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from sucess pop up
    And User Click Ok Button in Success PopUp Menu
    And User click the Approve screens
    Then user Enter the Transaction number
    And double click the Value
    And click the Approve button
    And system show the popup success user click the ok button

  #And system show the popup success user click the ok Button
  @TRS_026
  Scenario: Checking Cash Withdrawal Transaction - Currency Denomination
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_026
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontypeforTRS_026
    And User double click the record under updateafterapprove screenforTRS_026
    And user deal with the Currency Denomination chequebox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And User click the Transactions
    Then Click the Maintenance Below the Transactions
    And enter the value in trx type
    Then enter values of Branch code
    And enter values of Currency code
    And enter values of Gl code
    And enter values of Cif code
    Then enter values of serial
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user check if the  values is entered or not
    #And User Click Transactions Maintenance for loading Amount
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from sucess pop upforTRS_026
    And User Click Ok Button in Success PopUp Menu
    And User click the Approve screens
    Then user Enters the Transaction number forTRS_026
    And double click the Value
    And click the Approve button
     And system show the popup success user click the ok button

  @TRS_063
  Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund Checked/ Allow Overdraw unchecked
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_063
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype for TRS_063
    And User double click the record under updateafterapprove screen
    And User Check the ProceedOnInsufficientFund chequebox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
    And user deal with AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the save ok button
    And user click the ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_063
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popups
    #And User Click on Technical Details Icon
    #And User Click Clear Cache in Technical Details Icon
    #And User Click Ok Button Under Information PopUp Menu
    #And User Click on Close Button in Change Running Date Popup
    #And User Click on Technical Details Icon
    #And User Click Clear Cache in Technical Details Icon
    #And User Click Ok Button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And user Enter the BranchCode under TRXType for debitAccount
    And user Enter the CurrencyCode under TRXType for debitAccount
    And user Enter the GLCode under TRXType for debitAccount
    And user Enter the CifCode under TRXType for debitAccount
    And user Enter the SerialNo under TRXType for debitAccount
    And user check if the  value is entered or not
    And Enter the Amount in this Checkbox
    And user validate the popup as Amount Exceed warning pop up

  @TRS_064
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Proceed on Insufficient Fund Checked/ Allow Overdraw unchecked
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_064
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype for TRS_063
    And User double click the record under updateafterapprove screenforTRS_064
    And User Check the ProceedOnInsufficientFund chequebox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve fieldforTRS_064
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
    And user deal with AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the save ok button
    And user click the ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_064
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popups
    #And User Click on Technical Details Icon
    #And User Click Clear Cache in Technical Details Icon
    #And User Click Ok Button Under Information PopUp Menu
    #And User Click on Close Button in Change Running Date Popup
    #And User Click on Technical Details Icon
    #And User Click Clear Cache in Technical Details Icon
    #And User Click Ok Button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And user Enter the BranchCode under TRXType for debitAccount
    And user Enter the CurrencyCode under TRXType for debitAccount
    And user Enter the GLCode under TRXType for debitAccount
    And user Enter the CifCode under TRXType for debitAccount
    And user Enter the SerialNo under TRXType for debitAccount
    And user check if the  value is entered or not
    And Enter the Amount in this Checkbox
    And user validate the popup as Amount Exceed warning pop up

  @TRS_065
  Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw Checked
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_065
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype for TRS_063
    And User double click the record under updateafterapprove screen
    And User UNCheck the ProceedOnInsufficientFund chequebox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the save ok button
    And user click the ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popups
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And user Enter the BranchCode under TRXType for debitAccount
    And user Enter the CurrencyCode under TRXType for debitAccount
    And user Enter the GLCode under TRXType for debitAccount
    And user Enter the CifCode under TRXType for debitAccount
    And user Enter the SerialNo under TRXType for debitAccount
    And user check if the  value is entered or not
    And Enter the Amount in this Checkbox
    And user validate the popup as Amount Exceed warning pop up

  @TRS_066
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw Checked
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_066
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype for TRS_063
    And user double click the code on Approve fieldforTRS_064
    And User UNCheck the ProceedOnInsufficientFund chequebox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve fieldforTRS_064
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the save ok button
    And user click the ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popups
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And user Enter the BranchCode under TRXType for debitAccount
    And user Enter the CurrencyCode under TRXType for debitAccount
    And user Enter the GLCode under TRXType for debitAccount
    And user Enter the CifCode under TRXType for debitAccount
    And user Enter the SerialNo under TRXType for debitAccount
    And user check if the  value is entered or not
    And Enter the Amount in this Checkbox
    And user validate the popup as Amount Exceed warning pop up

  @TRS_067
  Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund Checked/ Allow Overdraw Checked
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_067
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype for TRS_063
    And User double click the record under updateafterapprove screen
    And User Check the ProceedOnInsufficientFund chequebox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the save ok button
    And user click the ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popups
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And user Enter the BranchCode under TRXType for debitAccount
    And user Enter the CurrencyCode under TRXType for debitAccount
    And user Enter the GLCode under TRXType for debitAccount
    And user Enter the CifCode under TRXType for debitAccount
    And user Enter the SerialNo under TRXType for debitAccount
    
    And Enter the Amount in this Checkbox
    And user check if the  value is entered or not
    And User Click Save Button in Maintenance Screen
     And User get Transaction number from sucess pop upforTRS_067
    And User Click Ok Button in Success PopUp Menu
    And User click the Approve screens
    Then user Enters the Transaction number forTRS_067
    And double click the Value
    And click the Approve button
     And system show the popup success user click the ok button
    
  @TRS_110_PREREQ_01
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
    #Prerequestis No1
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_110
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user retrive the existing record forTRS110 from the limits screen
    And user delete the record from the limits screen
    And user click the save ok button
    And user retrive the existing record no2 from the limits screen
    And user delete the record from the limits screen
    And user click the save ok button
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  @TRS_110_PreReq
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_110
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with WithdrawLimit in Limits
    #And  User Uncheck the with warnuserlimit in Limit
    #And User check the with proceediflimit in Limit
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type no2 in Limits
    And User enter value with WithdrawLimit No2 in Limits
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  #Steps
  @TRS_110
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_110
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    Then System show the warning popup clikc ok button
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user validate the popup as CannotProceed warning pop up

  #postrequistes
  @TRS_110_Postreq
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_110
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user retrive the existing record forTRS110 from the limits screen
    And user delete the record from the limits screen
    And user click the save ok button
    And user retrive the existing record no2 from the limits screen
    And user delete the record from the limits screen
    #And user click the save ok Button
    And user click the save ok button
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  @TRS_111_PreReq
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
    #Prerequisites
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_111
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with DepositLimitno1 in Limits
    And User check the with warnuserlimit in Limit
    #And User check the with proceediflimit in Limit
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  #Steps
  @TRS_111
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_111
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    #Then System show the warning popup clikc ok button
    And user Enter the SerialNo under TRXType
    #Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user check if the  value is entered or not
    And user click the ok
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from success pop up
    And User Click Ok Button in Success PopUp Menu
    And User click the Approve screen
    Then user Enters the Transaction number
    And double click the Value
    And click the Approve button
    And system show the popup success user click the ok button

  @TRS_111_PostReq
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_111
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user retrive the existing record from the limits screen
    And user delete the record from the limits screen
    And user click the save ok button
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  @TRS_112_PreReq
  Scenario: Checking Cash Depsoit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    #Prerequisites
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_112
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with DepositLimitno1 in Limits
    And User check the with warnuserlimit in Limit
    #And User check the with proceediflimit in Limit
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  #Steps
  @TRS_112
  Scenario: Checking Cash Depsoit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_112
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    Then System show the warning popup clikc ok button
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user check if the  value is entered or not
    And user validate the popup as CannotProceed warning pop up

  #Postrequisites
  @TRS_112_PostReq
  Scenario: Checking Cash Depsoit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_112
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user retrive the existing record from the limits screen
    And user delete the record from the limits screen
    And user click the save ok button
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  @TRS_113_PreReq
  Scenario: Checking Cash Deposit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    #Prerequesties
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_113
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with DepositLimitno1 in Limits
    And User check the with warnuserlimit in Limit
    And User check the with proceediflimit in Limit
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  #Steps
  @TRS_113
  Scenario: Checking Cash Deposit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_113
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    Then System show the warning popup clikc ok button
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user validate the warning pop up
    #And user click the ok
    And user check if the  value is entered or not
    And User Click Save Button in Maintenance Screen
    And user validate the warning pop up
    #And user click the ok
    And User get Transaction number from success pop up forTRS_113
    And user click the ok
    And User click the Approve screen
    Then user Enters the Transaction number forTRS_113
    And double click the Value
    And click the Approve button
    And user validate the warning pop up
    And user click the ok

  #PostRequesties
  @TRS_113_PostReq
  Scenario: Checking Cash Deposit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_113
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user retrive the existing record from the limits screen
    And user delete the record from the limits screen
    And user click the save ok button
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  @TRS_114_PreReq
  Scenario: Checking Cash Deposit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_114
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with DepositLimitno1 in Limits
    And User check the with proceediflimit in Limit
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  @TRS_114
  Scenario: Checking Cash Deposit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_114
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    Then System show the warning popup clikc ok button
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user check if the  value is entered or not
    And user click the ok
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from success pop up forTRS_114
    And User Click Ok Button in Success PopUp Menu
    And User click the Approve screen
    Then user Enters the Transaction number forTRS_114
    And double click the Value
    And click the Approve button
    And system show the popup success user click the ok button

  @TRS_114_PostReq
  Scenario: Checking Cash Deposit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_114
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user retrive the existing record from the limits screen
    And user delete the record from the limits screen
    And user click the save ok button
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  @TRS_115_Prereq
  Scenario: Checking Cash Depsoit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit - Specifc vs. General
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_115
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with DepositLimitno1 in Limits
    And User check the with warnuserlimit in Limit
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type no2 in Limits
    And User enter value with DepositLimitno2 in Limits
    And User check the with warnuserlimit in Limit
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  @TRS_115
  Scenario: Checking Cash Depsoit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit - Specifc vs. General
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_115
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    Then System show the warning popup clikc ok button
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user validate the popup as CannotProceed warning pop up

  @TRS_115_PostReq
  Scenario: Checking Cash Depsoit Transaction - Priority Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit - Specifc vs. General
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_115
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screens
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user retrive the existing record forTRS115no1 from the limits screen
    And user delete the record from the limits screen
    And user click the save ok button
    And user retrive the existing record forTRS115 from the limits screen
    And user delete the record from the limits screen
    #And user click the save ok button
    And user click the save ok button
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screens
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok

  @TRS_127_01 
  Scenario: Checking Cash Deposit Transaction - Alert Approve
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_127
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup

  @TRS_127
  Scenario: Checking Cash Deposit Transaction - Alert Approve
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TRS_127
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    #And User Click on Technical Details Icon
    #And User Click Clear Cache in Technical Details Icon
    #And User Click Ok Button Under Information PopUp Menu
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    #Then System show the warning popup clikc ok Button
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user check if the  value is entered or not
    And user click the ok
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from success pop up forTRS_127
    And User Click Ok Button in Success PopUp Menu
    And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup

  @TRS_128_01
  Scenario: Checking Cash Deposit Transaction - Alert Reject
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_128
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup

  @TRS_128
  Scenario: Checking Cash Deposit Transaction - Alert Reject
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TRS_128
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    #Then System show the warning popup clikc ok Button
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user check if the  value is entered or not
    And user click the ok
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from success pop up forTRS_127
    And User Click Ok Button in Success PopUp Menu
    And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup

  @TRS_139_01
  Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund Checked/ Allow Overdraw Checked - Account Balance Overdrawn Alert flag
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_139
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup

  @TRS_139
  Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund Checked/ Allow Overdraw Checked - Account Balance Overdrawn Alert flag
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_139
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype for TRS_063
    And User double click the record under updateafterapprove screen
    And User Check the ProceedOnInsufficientFund chequebox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the save ok button
    And user click the ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click the save ok button
    And user click the ok
    And user_606 click ControlRecord sub menu under SystemParameter
    And user_606 click UPA under ControlRecord
    And user_606 click AlertActivation field under controlRecord
    And user_606 click the AccountBalanceOverdrawnFlag under AlertActivation
    And user_606 click the AccountBalanceOverdrawnfield under AlertActivation
    And user_606 check the AccountBalanceOverdrawnCheckBox under AlertActivation
    #And user_606 click the AccountBalanceOverdrawnfield under AccountBalanceOverdrawnFlag
    #And user_606 check the AccountBalanceOverdrawnCheckBox under AccountBalanceOverdrawnFlag
    And user_606 click the UPA button under ControlRecord
    And user click the save ok button
    And user click the ok
    And user_606 Click the Approve field under ControlRecord
    And user_606 Click the Approve Button under ControlRecord
    And user click the save ok button
    #And user click the ok
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TRS_139
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    #Then System show the warning popup clikc ok Button
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user check if the  value is entered or not
    And user click the ok
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from success pop up forTRS_139
    And User Click Ok Button in Success PopUp Menu
    And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup

  @TRS_140_01
  Scenario: Checking Cash Deposit Transaction - Interbranch - Interbranch Entry Alert flag
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_140
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup

  @TRS_140
  Scenario: Checking Cash Deposit Transaction - Interbranch - Interbranch Entry Alert flag
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_140
    And user click the parameters menu
    And user click the system parameters submenus
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype for TRS_063
    And User double click the record under updateafterapprove screen
    And user_606 click the EnableMultiBranch checkbox
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
    And user_606 click ControlRecord sub menu under SystemParameter
    And user_606 click UPA under ControlRecord
    And user_606 click AlertActivation field under controlRecord
    And user_606 click the AccountBalanceOverdrawnFlag under AlertActivation
    #And user_606 click the InterbranchEntry Alert flag
    And user_606 click the InterBranchEntry field
    And user_606 click the InterBranchEntry checkbox
    And user_606 click the UPA button under ControlRecord
    And user click the save ok button
    And user click the ok
    And user_606 Click the Approve field under ControlRecord
    And user_606 Click the Approve Button under ControlRecord
    And user click the save ok button
    And user click the ok
    Given navigate to CSM application and login with valid credentials TellerUser
    And user update test data set id for TRS_140
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Dates
    And User Click on Use Button in Change Running Date Popup
    And user click the ok
    And User Click on Close Button in Change Running Date Popup
    And user click Transaction submenu on CSMCore
    And user click Maintance screen under Transaction submenu
    And user Enter the TRXType on maintance screen
    And user Enter the BranchCode under TRXType
    And user Enter the CurrencyCode under TRXType
    And user Enter the GLCode under TRXType
    And user Enter the CifCode under TRXType
    #Then System show the warning popup clikc ok Button
    And user Enter the SerialNo under TRXType
    Then System show the warning popup clikc ok button
    And user enter the currency
    And Enter the Amount in this Checkbox
    And user check if the  value is entered or not
    And user click the ok
    And User Click Save Button in Maintenance Screen
    And User get Transaction number from success pop up forTRS_140
    And User Click Ok Button in Success PopUp Menu
    And user click the BranchManager Account in the Alert popup
    And user click the send button in Alert popup
