

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
	  
	  