Feature: To test the funcnalities of Transaction module

  @TRS_023
  Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
    Given navigate to CSM param application and login with valid credentials
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

  @TRS_024
  Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
    Given navigate to CSM param application and login with valid credentials
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

  @TRS_027
  Scenario: Checking Cash Deposit Transaction - CV/FC
  
    Given navigate to CSM application and login with valid credentials
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Date
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok Button Under Information PopUp Menu
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
    And click the save button
    And system show the popup success user click the ok button
    And User click the Approve screen
    Then user Enter the Transaction number
    And double click the Value
    Then click the Approve button
    And system show the popup success user click the ok button
    And User click the Maintenance screen
    Then click the search button
    And enter the trx number
    And double click the data
    Then click the Booked Entries

  @TRS_025
  Scenario: Checking Cash Deposit Transaction - Currency Denomination
    Given navigate to CSM param application and login with valid credentials
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype
    And User double click the record under updateafterapprove screen
    And user deal with the Currency Denomination chequebox
    Given navigate to CSM application and login with valid credentials
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Date
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok Button Under Information PopUp Menu
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
    And click the save button
    And system show the popup success user click the ok button
    And User click the Approve screen
    Then user Enter the Transaction number
    And double click the Value
    Then click the Approve button
    And system show the popup success user click the ok button

  @TRS_026
  Scenario: Checking Cash Withdrawal Transaction - Currency Denomination
    Given navigate to CSM param application and login with valid credentials
    And user click the system parameters submenu
    And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
    And user Enter the code in inputfield on updateafterapprove screen under transactiontype
    And User double click the record under updateafterapprove screen
    And user deal with the Currency Denomination chequebox
    Given navigate to CSM application and login with valid credentials
    And User Click on Date to Change the Current Date
    And User Enter the Date in User Running Date
    And User Click on Use Button in Change Running Date Popup
    And User Click Ok Button in Information PopUp menu
    And User Click on Close Button in Change Running Date Popup
    And User Click on Technical Details Icon
    And User Click Clear Cache in Technical Details Icon
    And User Click Ok Button Under Information PopUp Menu
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
    And click the save button
    And system show the popup success user click the ok button
    And User click the Approve screen
    Then user Enter the Transaction number
    And double click the Value
    Then click the Approve button
    And system show the popup success user click the ok button
