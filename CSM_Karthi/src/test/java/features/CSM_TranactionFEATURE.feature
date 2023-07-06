Feature: Checking functionality of transaction

 # @TRS_218
  #Scenario: Checking the transaction - GL type field - Don’t notify and proceed - Proceed on insufficient funds flag unchecked
    #Pre-requisties
    #Given user Navigate to CSM Params application and login with valid credentials
    #And user update test data set id for TRS_218
    #And user click the parameters menu
    #And user navigate to account parameters
    #Then user navigate to general ledger under account parameters
    #And user click the Update after approve in general ledger flag
    #Then user enter the code in the code column under update after approve
    #Then user double click the entered code to view the details in update after approve screen
    #And user click the additional details button in the update after approve
    #Then user select the dropdown values under allow overdraw option
    #And user click the update button to save the record in update after approve screen
    #Then user click the ok popup to close the confirmation box
    #And user click the approve in general ledger
    #Then user enter the code in the code column in approve flag
    #Then user double click the entered code to view the details in approve screen
    #And user click the approve button to save the record in approve screen
    #Then user click the ok button in the confirmation box to save the record
    #Then user click the ok popup to close the confirmation box
    #And user click the system parameters submenu
    #And user click on the transaction type under the system parameters
    #And user click on the update after approve field under the transaction type
    #And user enters the transaction type code in the code column under the update after approve
    #And user double clicks on the entered transaction type code from the list to view the transaction type details
    #And User Check the ProceedOnInsufficientFund flag chequebox
    #And user click on the update after approve button to save the changes
    #And user click on the approve field under the transaction type menu
    #And user enters the transaction type code in the code column under the approve menu
    #And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    #And user click on the approve button to approve the changes
    #Test case execution
    #Given user Navigate to CSM core application and login with valid credentials
    #And user click on Date to Change the Current Date in the CSM core application
    #And user Enters the Date in user Running Date in the CSM core application
    #And user click on Use Button in Change Running Date Popup in the CSM core application
    #And User Click Ok Button for confirmation PopUp for Company Holiday
    #And user click Ok Button in Information PopUp menu in the CSM core application
    #And user click on Close Button in Change Running Date Popup in the CSM core application
    #And user click on Technical Details Icon in the CSM core application
    #And user click Clear Cache in Technical Details Icon in the CSM core application
    #And user click Ok Button Under Information PopUp Menu in the CSM core application
    #And user click on Transactions under CSM application in the CSM core application
    #And user click on Maintenance under Transactions in the CSM core application
    #And user enters the transaction type
    #Then user Enter the Branch Code for AC1 in Maintenance Screen
    #And user Enter Currency Code for AC1 in Maintenance Screen
    #And user click random click
    #And user Enter GL Code for AC1 in Maintenance Screen
    #And user click random click
    #Then user Enter CIF Code for AC1 in Maintenance Screen
    #And user click random click
    #And user Enter Serial for AC1 in Maintenance Screen
    #And user click random click
    #And user click Ok Button in Warning PopUp Menu
    #Then user Enter the Currency in Maintenance Screen
    #And user Enter Currency Code for AC2 in Maintenance Screen
    #And user click random click
    #Then user Enter GL Code for AC2 in Maintenance Screen
    #And user click random click
    #And user Enter CIF Code for AC2 in Maintenance Screen
    #And user click random click
    #Then user Enter Serial for AC2 in Maintenance Screen
    #And user click random click
    #And user click Ok Button in Warning PopUp Menu
    #Then user Enter the Amount in Maintenance Screen
    #And user click Ok Button in Warning PopUp Menu
    #Then user click Save Button in Maintenance Screen
    #And user click Ok Button in Warning PopUp Menu
    #Then user click the ok popup to close the confirmation box

  @TRS_245
  Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit - Not Overdrawn/ Withdrawal - Base/ Base
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_245
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA fieldforTRS_245
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve fieldforTRS_245
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_245
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_246
  Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit - Not Overdrawn/ Withdrawal - Base/ FC
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_246
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA fieldforTRS_245
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve fieldforTRS_245
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_246
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_247
  Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit - Not Overdrawn/ Withdrawal - FC/ FC
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_247
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA fieldforTRS_245
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve fieldforTRS_245
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_247
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_248
  Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit - Not Overdrawn/ Withdrawal - FC/ Base
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_248
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA fieldforTRS_245
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve fieldforTRS_245
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_248
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_249
  Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit -  Overdrawn/ Withdrawal - Base/ Base
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_249
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA fieldforTRS_245
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve fieldforTRS_245
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_249
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_250
  Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit -  Overdrawn/ Withdrawal - Base/ FC
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_250
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA fieldforTRS_245
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve fieldforTRS_245
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_250
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_251
  Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit -  Overdrawn/ Withdrawal - FC/ FC
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_251
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA fieldforTRS_245
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve fieldforTRS_245
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_251
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_252
  Scenario: Functional Testing - Main Account Debited - No Future Value Date - No Charges - Account Sign Credit -  Overdrawn/ Withdrawal - FC/ Base
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_252
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
    #Given navigate to CSM param application and login with valid credentials
    #And user click the parameters menu
    And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA fieldforTRS_245
    And user click the Instructions in AccountTypes
    And user Check AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve fieldforTRS_245
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_252
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_253
  Scenario: Functional Testing - Main Account Credited - No Future Value Date - No Charges - Account Sign Debit -  Overdrawn/ Deposit - Base/ Base
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_253
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
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
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_253
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_254
  Scenario: Functional Testing - Main Account Credited - No Future Value Date - No Charges - Account Sign Debit -  Overdrawn/ Deposit - Base/ FC
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_254
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
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
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_254
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_255
  Scenario: Functional Testing - Main Account Credited - No Future Value Date - No Charges - Account Sign Debit -  Overdrawn/ Deposit - FC/ FC
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_255
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
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
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_255
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_256
  Scenario: Functional Testing - Main Account Credited - No Future Value Date - No Charges - Account Sign Debit -  Overdrawn/ Deposit - FC/ Base
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_256
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And User Check the ProceedOnInsufficientFund flag chequebox
    And User click the allow post dated value flag under update after approve
    And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
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
    And user click confirm ok Button
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click confirm ok Button
    Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_256
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    Then user Enter the Currency in Maintenance Screen
    Then user Enter the Amount in Maintenance Screen

  @TRS_119toTRS_129
  Scenario: test data
    #TRS_119 to TRS_129
    And user update test data set id for TRS_119
    And user update test data set id for TRS_220
    And user update test data set id for TRS_221
    And user update test data set id for TRS_222
    And user update test data set id for TRS_223
    And user update test data set id for TRS_224
    And user update test data set id for TRS_225
    And user update test data set id for TRS_226
    And user update test data set id for TRS_227
    And user update test data set id for TRS_228
    And user update test data set id for TRS_229

  @TRS_245toTRS_256
  Scenario: test data
    #TRS_245 to TRS_256
    #TRS_245
    And User click the allow back dated value flag under update after approve
    And user update test data set id for TRS_246
    And user update test data set id for TRS_247
    And user update test data set id for TRS_248
    And user update test data set id for TRS_249
    And user update test data set id for TRS_250
    And user update test data set id for TRS_251
    And user update test data set id for TRS_252
    And user update test data set id for TRS_253
    And user update test data set id for TRS_254
    And user update test data set id for TRS_255
    And user update test data set id for TRS_256
    
    #@TRS_393 is already done the prereq
     @TRS_393_PreReq 
  Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - Local  - Multi Transfer - Mode of Payment A/C
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_393
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And user check the MultipleTransfer check Box
     And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
     @TRS_393
  Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - Local  - Multi Transfer - Mode of Payment A/C
  
      Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_393
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user change the mode of payment to Account
    And user Enter the Branch Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Currency Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter GL Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter CIF Code for AC1 in Maintenance Screen
    And user click random click
    And user Enter Serial for AC1 in Maintenance Screen
    And user click random click
    And user click Ok Button in Warning PopUp Menu
    And user Enter the Currency in Maintenance Screen
     And user click random click
    And user Enter the Amount in Maintenance Screen
    And user click random click
    And user click the AccountDetails button under maintenance screen
    And user click the Add button on AccountDetails button
    And user click the record on accountDetails
   And user Enter the GL on AccountDetails button
   And user Enter the Cif on AccountDetails button
   And user Enter the SerialNo on AccountDetails button
   
   
    #@TRS_394 is Already done
   @TRS_394_Prereq
  Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - Local  - Multi Transfer - Mode of Payment Cash
    Given navigate to CSM param application and login with valid credentials
    And user update test data set id for TRS_394
    And user click the parameters menu
    And user click the system parameters submenu
    And user click on the transaction type under the system parameters
    And user click on the update after approve field under the transaction type
    And user enters the transaction type code in the code column under the update after approve
    And user double clicks on the entered transaction type code from the list to view the transaction type details
    And user check the MultipleTransfer check Box
     And user click on the update after approve button to save the changes
    And user click on the approve field under the transaction type menu
    And user enters the transaction type code in the code column under the approve menu
    And user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen
    And user click on the approve button to approve the changes
     @TRS_394
  Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - Local  - Multi Transfer - Mode of Payment Cash
      Given navigate to CSM application and login with valid credentials
    And user update test data set id for TRS_394
    And user click on Date to Change the Current Date in the CSM core application
    And user Enters the Date in user Running Date in the CSM core application
    And user click on Use Button in Change Running Date Popup in the CSM core application
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And user click Ok Button in Information PopUp menu in the CSM core application
    And user click on Close Button in Change Running Date Popup in the CSM core application
    And user click on Technical Details Icon in the CSM core application
    And user click Clear Cache in Technical Details Icon in the CSM core application
    And user click Ok Button Under Information PopUp Menu in the CSM core application
    And user click on Transactions under CSM application in the CSM core application
    And user click on Maintenance under Transactions in the CSM core application
    And user enters the transaction type
    And user change the mode of payment to Account
    And user Enter the currency on cash field
    And user double click the record on cash field
    #And user Enter the Branch Code for AC1 in Maintenance Screen
    #And user click random click
    #And user Enter Currency Code for AC1 in Maintenance Screen
    #And user click random click
    #And user Enter GL Code for AC1 in Maintenance Screen
    #And user click random click
    #And user Enter CIF Code for AC1 in Maintenance Screen
    #And user click random click
    #And user Enter Serial for AC1 in Maintenance Screen
    #And user click random click
    #And user click Ok Button in Warning PopUp Menu
    And user Enter the Currency in Maintenance Screen
     And user click random click
    And user Enter the Amount in Maintenance Screen
    And user click random click
    And user click the AccountDetails button under maintenance screen
    And user click the Add button on AccountDetails button
    And user click the record on accountDetails
   And user Enter the GL on AccountDetails button
   And user Enter the Cif on AccountDetails button
   And user Enter the SerialNo on AccountDetails button
   
    
    
