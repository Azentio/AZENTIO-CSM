Feature: To check the functionalitites of TransactionStaffAccounts request

                             #  *********** Sprint - 8 (2) **********  #
  @TSA_148
  Scenario: Checking if the system is sending an alert when saving the transaction if any of the accounts defined is related to a Staff account
    Given User_613 login to Csm Param application
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the Control Record
    And User_613 Click the Update After Approve under control record
    Then User_613 Select The Alert Activation
    And User_613 Click the Account Balance Overdown
    Then User_613 The Flag of Staff Account Transaction should be checked
    And User_613 Click the CIF parameters
    And User_613 Click the CIF type
   # Then User_613 Click the Update After Approve under the CIF type
    And User_613 Enter the value in Brife Desc Eng
    Then User_613 Double click of the existing record
    And User_613 Click the Main Information
    #Then Check the flag  Cif Staff(checking)
    And User_613 Click the System Parameters
    Then User_613 click the Transaction type
    And User_613 Click the Update after approve under Transaction type
    Then User_613 Click the Search button
    And User_613 Enter the code value
    Then User_613 double click the Data
    #And User_613 select the Transaction Status
    #Then User_613 click ok button
    And User_613 click the Transactions
    #And User_613 click the Approve below the Transactions
    #Then User_613 enter the transaction No in below Checkbox
    And User_613 double click the data
    And User_613 click the Approve button
     #Then System give the popup
     
  @TSA_152
  Scenario: Check if the user is able to see his account the flag is unchecked grant access personal acc
    Given Navigate to SADS application and login with valid credentials
    And User Click on Parameters under SADS application
    And User Click on Account Restrictions in Parameters under SADS application
    And User Click on Maintenance in Account Restrictions under Parameters
    #And User click warning ok button
    And User Enter the value in Code under Maintenance Screen
    And User Enter the value in Description  under Maintenance Screen
    #And User Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen
    And User Click the RootIcon in ApplicationsOROPTs under maintenance secreen
    And User Click on RADM application in ApplicationsOROPTs
    And User Click on RADM application Checkbox in ApplicationsOROPTs
    And User Click on RET application in ApplicationsOROPTs
    And User Click on RET application Checkbox in ApplicationsOROPTs
    And User Click on RootIcon in Companies OR Branches in maintenance secreen
    And User Click on 1BAJ application in Companies OR Branches
    And User Click on  1BAJ application Checkbox in Companies OR Branches
    And User Enter the User ID in UserID tab
    And User Click on User ID Checkbox under UserID tab
    And User Click on Add button in Restriction Type under Maintenance Screen
    And User Click on Select Icon under Restriction Type
    And user select all account info under Restriction Level
    And User Click on Add button under Restriction Level
    And User Click on Search Icon in  CIF NO Under the Restriction Level
    And User Enter the CIF No in the Search box
    And User double the data in the Search box
    And User Click on Save button under Maintenance Screen
    And User Click on Ok button in Success PopUp Menu
    And User Click on Approve under Account Restrictions
    And User Enter the Code in Approve Screen
    And User Click the Selected code in Approve Screen
    Then User Click on Approve button in Approve Screen

                                  # ********** Sprint -9 ********* #
  @TRS_017
  Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_017
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the Code value
    Then User_613 double click the Existing data
    #And User_613 just check the flag UPA
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    Then User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button in transaction type
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_017_01
  Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates
    Given navigate to CSM application and login with valid credentials
    And User_613 Click on Date to Change the Current Date
    And User_613 Enter the Date in User Running Date
    And User_613 Click on Use Button in Change Running Date Popup
    And User_613 Click Ok Button in Information PopUp menu
    And User_613 Click on Close Button in Change Running Date Popup
    And User_613 update test data set id for TRS_017
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of Currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    Then User_613 System show the warning popup click ok button
    And User_613 system gives the view memo popup user close the popup
    #And  user enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 click the Account details button
    And User_613 click the Add button under account details
    Then User_613 enter values of Branch code under account details
    And User_613 enter values of gl code under account details
    Then User_613 enter values of cif number under account details
    And User_613 system gives the view memo popup user close the popup
    And User_613 enter values of serial under account details
    Then User_613 Enter the Amount in this Checkbox under account details
    And User_613 click the Add button under account details
    Then User_613 enter values of Branch code under account details_2
    And User_613 enter values of gl code under account details_2
    Then User_613 enter values of cif number under account details_2
    And User_613 enter values of serial under account details_2
    Then User_613 Enter the Amount in this Checkbox under account details_2
    And User_613 click the ok button in account details
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button
    And User_613 click the Maintenance screen
    #Then User_613 click the search button
    And User_613 enter the trx number
    And User_613 double click the data
    Then User_613 click the Booked Entries

  #And  User Click the Queries
  #And  Click the Statement of Account
  #And  Click the By trade Date
  #And  enter values of Currency Value
  #And  enter values of GL code
  #And  enter values of cif code
  #Then enter values of Serial
  #And  Click the Retrive button
  
  @TRS_018
  Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_018
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the Code value     
    Then User_613 double click the Existing data
    And User_613 Allow internal GL Account flag should be checked
    #And User_613 just check the flag UPA
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    Then User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_018_01
  Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
    Given navigate to CSM application and login with valid credentials
    And User_613 Click on Date to Change the Current Date
    And User_613 Enter the Date in User Running Date
    And User_613 Click on Use Button in Change Running Date Popup
    And User_613 Click Ok Button in Information PopUp menu
    And User_613 Click on Close Button in Change Running Date Popup
     And User_613 update test data set id for TRS_018
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of Currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    Then User_613 enter values of serial
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button
    And User_613 click the Maintenance screen
    #Then User_613 click the search button
    And User_613 enter the trx number
    And User_613 double click the data
    Then User_613 click the Booked Entries

  #And  User Click the Queries
  #And  Click the Statement of Account
  #And  Click the By trade Date
  #And  enter values of Currency Value
  #And  enter values of GL code
  #And  enter values of cif code
  #Then enter values of Serial
  #And  Click the Retrive button
  
  @TRS_019
  Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
    Given User_613 login to Csm Param application
     And User_613 update test data set id for TRS_018
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the Code value
    Then User_613 double click the Existing data
    And User_613 Allow internal GL Account flag should be checked
    And User_613 just check the flag UPA
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    Then User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_019_01
  Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
    Given navigate to CSM application and login with valid credentials
    And User_613 Click on Date to Change the Current Date
    And User_613 Enter the Date in User Running Date
    And User_613 Click on Use Button in Change Running Date Popup
    And User_613 Click Ok Button in Information PopUp menu
    And User_613 Click on Close Button in Change Running Date Popup
     And User_613 update test data set id for TRS_018
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of Currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    Then User_613 enter values of serial
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    And User_613 click the save button
    And User_613 system show the popup success user click the ok button

  @TRS_020
  Scenario: Checking Single Transfer (Main Debit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
    #single transfer value change
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_062
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data
    And User_613 Allow internal GL Account flag should be checked
    And User_613 just check the flag UPA
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    Then User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the single transfar Approved record in the code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_020_01
  Scenario: Checking Single Transfer (Main Debit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
    Given navigate to CSM application and login with valid credentials
    And User_613 Click on Date to Change the Current Date
    And User_613 Enter the Date in User Running Date
    And User_613 Click on Use Button in Change Running Date Popup
    And User_613 Click Ok Button in Information PopUp menu
    And User_613 Click on Close Button in Change Running Date Popup
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the single transfer in trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of Currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    Then User_613 enter values of serial
    And User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    And User_613 click the save button
    And User_613 system show the popup success user click the ok button
    And User_613 click the Maintenance screen
    #Then User_613 click the search button
    And User_613 enter the trx number
    And User_613 double click the data
    Then User_613 click the Booked Entries

  @TRS_021
  Scenario: Checking Single Transfer (Main Debit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_062
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data
    #And  Allow internal GL Account flag should be checked
    And User_613 just check the flag UPA
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    Then User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the single transfar Approved record in the code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_021_01
  Scenario: Checking Single Transfer (Main Debit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
    Given navigate to CSM application and login with valid credentials
    And User_613 Click on Date to Change the Current Date
    And User_613 Enter the Date in User Running Date
    And User_613 Click on Use Button in Change Running Date Popup
    And User_613 Click Ok Button in Information PopUp menu
    And User_613 Click on Close Button in Change Running Date Popup
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the single transfer in trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of Currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    Then User_613 enter values of serial
  #Then system show the stopper message
  
  @TRS_022
  Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
    #multi transfer value change
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_017
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the Code value
    Then User_613 double click the Existing data
    And User_613 just check the flag UPA
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    Then User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_022_01
  Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
    Given navigate to CSM application and login with valid credentials
    And User_613 Click on Date to Change the Current Date
    And User_613 Enter the Date in User Running Date
    And User_613 Click on Use Button in Change Running Date Popup
    And User_613 Click Ok Button in Information PopUp menu
    And User_613 Click on Close Button in Change Running Date Popup
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of Currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    Then User_613 enter values of serial
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button
    And User_613 click the Maintenance screen
    #Then User_613 click the search button
    And User_613 enter the trx number
    And User_613 double click the data
    Then User_613 click the Booked Entries

  #And  User_613 Click the Queries
  #And User_613 Click the Statement of Account
  #And User_613 Click the By trade Date
  #And User_613 enter values of Currency Value
  #And  enter values of GL code
  #And  enter values of cif code
  #Then enter values of Serial
  #And  Click the Retrive button
                                    # ********* Sprint - 10 *********** #
  @TRS_057
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Booked Entries + Balance Updates
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_062
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data
    And Check the falg of set default Trx currency is equal to account currency
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the type code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_057_01
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Booked Entries + Balance Updates
    And User_613 update test data set id for TRS_062
    Given navigate to CSM application and login with valid credentials
    And User_613 Click on Date to Change the Current Date
    And User_613 Enter the Date in User Running Date
    And User_613 Click on Use Button in Change Running Date Popup
    And User_613 Click Ok Button in Information PopUp menu
    And User_613 Click on Close Button in Change Running Date Popup
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the single transfer in trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of Currency code
    Then User_613 enter values of gl code for single transfer in debit account
    And User_613 enter values of cif number for single transfer in debit account
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter values of serial for single transfer in debit account
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 enter the gl code in credit account
    And User_613 enter the cif code in credit account
    Then User_613 enter the Serial number in credit account
    #And System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 system gives the view memo popup user close the popup
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button
    And User_613 click the Maintenance screen
    #Then User_613 click the search button
    And User_613 enter the trx number
    And User_613 double click the data
    Then User_613 system gives the view memo popup user close the popup
    Then User_613 click the Booked Entries

  #And  User Click the Queries
  #And  Click the Statement of Account
  #And  Click the By trade Date
  #And  enter values of Currency Value
  #And  enter values of GL code
  #And  enter values of cif code
  #Then enter values of Serial
  #And  Click the Retrive button
  @TRS_058
  Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates
    Given User_613 login to Csm Param application
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data

  @TRS_059
  Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates
    Given User_613 login to Csm Param application
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data

  @TRS_060
  Scenario: Checking Cash Withdrawal Transaction - Booked Entries + Balance Updates
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_061
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the type Code value
    Then User_613 double click the typecode data
    And User_613 just check the flag UPA
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the type code
    And User_613 Double Click the Approved typecode data
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_060_01
  Scenario: Checking Cash Withdrawal Transaction - Booked Entries + Balance Updates
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button
    And User_613 click the Maintenance screen
    #Then User_613 click the search button
    And User_613 enter the trx number
    And User_613 double click the data
    Then User_613 click the Booked Entries

  #And  User Click the Queries
  #And  Click the Statement of Account
  #And  Click the By trade Date
  #And  enter values of Currency Value
  #And  enter values of GL code
  #And  enter values of cif code
  #Then enter values of Serial
  #And  Click the Retrive button
  @TRS_061
  Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked.
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_061
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the type Code value
    Then User_613 double click the typecode data
    And User_613 uncheck the flag of proceed on insufficient fund
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the type code
    And User_613 Double Click the Approved typecode data
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully
    Then User_613 click the Account parameters
    And User_613 click the Account type
    Then User_613 click the update after Approve
    And User_613 Enter the type code
    Then User_613 Double click the Data in account type
    And User_613 click the Instructions
    Then User_613 uncheck the flag Allow Overdrawn
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully
    And User_613 click the Approve screen
    Then User_613 enter the type code
    And User_613 double click the Data
    Then User_613 click the Approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_061_01
  Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked.
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    Then User_613 enter values of serial

  @TRS_062
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_062
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data
    And User_613 uncheck the flag of proceed on insufficient fund
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the type code
    And User_613 Double click the Data in account type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully
    Then User_613 click the Account parameters
    And User_613 click the Account type
    Then User_613 click the update after Approve
    And User_613 Enter the type code
    Then User_613 Double click the Data in account type
    And User_613 click the Instructions
    Then User_613 uncheck the flag Allow Overdrawn
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully
    And User_613 click the Approve screen
    Then User_613 enter the type code
    And User_613 double click the Data
    Then User_613 click the Approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_062_01
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the single transfer in trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of Currency code
    Then User_613 enter values of gl code for single transfer in debit account
    And User_613 enter values of cif number for single transfer in debit account
    And User_613 enter values of serial for single transfer in debit account
  #Then system show the popup of Non internal Account
  
                                                 # **********   Sprint -11   ********** #
  @TRS_104
  Scenario: Checking Cash Deposit Transaction - CIF Type Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_105
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the user
    Then User_613 Click the Update after approve under user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the data
    Then User_613 click the cif types
    And User_613 enter the code values
    Then User_613 check the flag of Warn user If Limit Exceeds
    And User_613 click the ok button
    Then User_613 Click the update After approve button in user
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the approve screen in user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the Data
    Then User_613 Click the Approve button under user
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_104_01
  Scenario: Checking Cash Deposit Transaction -CIF Type Deposit Limit Defined -Warn User if Limit Exceeds UnChecked -Proceed if Limit Exceeds Checked -Amount > Limit
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button

  @TRS_105
  Scenario: Checking Cash Depsoit Transaction -CIF Type Deposit Limit Defined -Warn User if Limit Exceeds Checked -Amount > Limit -Specifc vs. General
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_105
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the user
    Then User_613 Click the Update after approve under user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the data
    Then User_613 click the cif types
    And User_613 enter the code values
    #Then user enter the Transaction
    #And  enter the value in deposit limit
    #Then check the flag of Warn user If Limit Exceeds
    And User_613 click the ok button
    Then User_613 Click the update After approve button in user
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the approve screen in user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the Data
    Then User_613 Click the Approve button under user
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_105_01
  Scenario: Checking Cash Depsoit Transaction -CIF Type Deposit Limit Defined -Warn User if Limit Exceeds Checked -Amount > Limit -Specifc vs. General
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox

  #Then system show the stopper message
  @TRS_106
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_106
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the user
    Then User_613 Click the Update after approve under user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the data
    Then User_613 click the Priority
    And User_613 Click the Number one
    #Then enter the withdraw limit
    #Then check the flag of Warn user If Limit Exceeds
    And User_613 click the ok button
    Then User_613 Click the update After approve button in user
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the approve screen in user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the Data
    Then User_613 Click the Approve button under user
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_106_01
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    #Then System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button

  @TRS_107
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_107
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the user
    Then User_613 Click the Update after approve under user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the data
    Then User_613 click the Priority
    And User_613 Click the Number one
    #Then enter the withdraw limit
    #Then check the flag of Warn user If Limit Exceeds
    And User_613 click the ok button
    Then User_613 Click the update After approve button in user
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the approve screen in user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the Data
    Then User_613 Click the Approve button under user
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_107_01
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    #Then system show the stopper message
  
  @TRS_108
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_107
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the user
    Then User_613 Click the Update after approve under user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the data
    Then User_613 click the Priority
    And User_613 Click the Number one
    #Then enter the withdraw limit
    #Then check the flag of Warn user If Limit Exceeds
    #And check the falg of proceed If Limit Exceeds
    And User_613 click the ok button
    Then User_613 Click the update After approve button in user
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the approve screen in user
    Then User_613 Enter the Name in the UserId
    And User_613 double click the Data
    Then User_613 Click the Approve button under user
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_108_01
  Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button

                                              # ********* Sprint -12 ************* #
  @TRS_157
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_157
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data
    #And  check the flag of debtor Account
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the type code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_157_01
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account
    Given navigate to CSM application and login with valid credentials
     And User_613 update test data set id for TRS_157
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    And User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 enter the Debit account in glcode value
    And User_613 enter the Ciftype value in Debit account
    Then User_613 enter the serial value in Debit account
    Then User_613 System show the warning popup click ok button
    Then User_613 System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button
    Then User_613 click the Booked Entries

  @TRS_158
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Credit Account
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_157
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data
    #And User_613 check the flag of Creditor Account
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the type code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_158_01
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Credit Account
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 enter the Debit account in glcode value
    And User_613 enter the Ciftype value in Debit account
    Then User_613 enter the serial value in Debit account
    Then User_613 System show the warning popup click ok button
    Then User_613 System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button
    Then User_613 click the Booked Entries

  @TRS_159
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Teller Account
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_157
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data
    #And User_613 check the flag of Teller Account
    Then User_613 Click the Update After approve button in Transaction type
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the type code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_159_01
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Teller Account
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 enter the Debit account in glcode value
    And User_613 enter the Ciftype value in Debit account
    Then User_613 enter the serial value in Debit account
    Then User_613 System show the warning popup click ok button
    Then User_613 System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button
    Then User_613 click the Booked Entries

  @TRS_160
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Other Account
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_157
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Transaction type
    Then User_613 Click the Update after approve in transaction type
    And User_613 Enter the single transfer Code value
    Then User_613 double click the Existing data
    #And User_613 check the flag of other Account
    Then User_613 click the update after approve button
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 Click the Approve Below the Transaction type
    Then User_613 Enter the Approved record in the type code
    And User_613 Double click the Data in transaction type
    And User_613 click the approve button
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_160_01
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Other Account
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 enter the Debit account in glcode value
    And User_613 enter the Ciftype value in Debit account
    Then User_613 enter the serial value in Debit account
    Then User_613 System show the warning popup click ok button
    Then User_613 System show the warning popup click ok button
    And User_613 click the save button
    And User_613 get Transaction number from sucess pop up
    And User_613 click the Approve screen
    Then User_613 Enter the Transaction number
    And User_613 double click the Value
    Then User_613 click the Approve button
    And User_613 system show the popup success user click the ok button
    Then User_613 click the Booked Entries

  @TRS_161
  Scenario: Checking Single Transfer(Main Debit)Intra Transaction-Deduct Charges from Debit Account-Modify flags not checked on Trx Type or Charge Code
    #single transfer value change
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_161
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    And User_613 click the Charges
    And User_613 Click the Maintance of charges
    Then User_613 Click the Update after approve in charges
    And User_613 Enter the Value of T in Brief Name
    Then User_613 double click the Existing data of charges
    And User_613 Uncheck the flag of Allow modify and clear
    And User_613 uncheck the flag of Allow modify
    Then User_613 click the update after approve button
    And User_613 System giving information message click ok button
    And User_613 system show the success popup click ok button
    And User_613 click the Approve screen in Charges
    Then User_613 enter the code value under charges
    And User_613 double click the data in the code
    Then User_613 click the Approve button in charges
    And User_613 System show the  confirm popup user click the ok button
    And User_613 System show the record was successfully

  @TRS_161_01
  Scenario: Checking Single Transfer(Main Debit)Intra Transaction-Deduct Charges from Debit Account-Modify flags not checked on Trx Type or Charge Code
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial
    And User_613 System show the warning popup click ok button
    Then User_613 system gives the view memo popup user close the popup
    And User_613 enter the currency
    And User_613 Enter the Amount in this Checkbox
    Then User_613 enter the Debit account in glcode value
    And User_613 enter the Ciftype value in Debit account
    Then User_613 enter the serial value in Debit account
    And User_613 the Cv Charges is Enabeled

                                                # *********** Sprint -14 *********** #
  @TRS_369
  Scenario: Functional Testing -Checking if a single transfer transaction could be done for a non approved modified account when"Proceed on Modified account” flag is checked
    Given User_613 login to Csm Param application
    #And User_613 update test data set id for TRS_161
    Then User_613 Click the Parameters
    Then User_613 click the Account parameters
    And User_613 click the acc control record
    Then User_613 click the Update after approve screen under account parameters
    And User_613 click the JvAccounts tab in maintance
    Then User_613 click the Accounts under JvAccounts tab
    #And User_613 Check the flag of proceed on modified account
    Then User_613 click the update button in account parameters

  @TRS_369_01
  Scenario: Functional Testing -Checking if a single transfer transaction could be done for a non approved modified account when"Proceed on Modified account” flag is checked
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Accounts
    Then User_613 click the General Accounts
    And User_613 Click the maintenance under General accounts
    Then User_613 Enter the value in Status Tab
    #And User_613 Double click the value under Status
    Then User_613 rename the Brief name
    And User_613 click the update button
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial

  @TRS_370
  Scenario: Functional Testing-Checking if a multi transfer transaction could be done for a non approved modified account when “Proceed on Modified account” flag is checked
    Given User_613 login to Csm Param application
    #And User_613 update test data set id for TRS_161
    Then User_613 Click the Parameters
    Then User_613 click the Account parameters
    And User_613 click the acc control record
    Then User_613 click the Update after approve screen under account parameters
    And User_613 click the JvAccounts tab in maintance
    Then User_613 click the Accounts under JvAccounts tab
    #And User_613 Check the flag of proceed on modified account
    Then User_613 click the update button in account parameters

  @TRS_370_01
  Scenario: Functional Testing-Checking if a multi transfer transaction could be done for a non approved modified account when “Proceed on Modified account” flag is checked
    Given navigate to CSM application and login with valid credentials
    And User_613 click the Accounts
    Then User_613 click the General Accounts
    And User_613 Click the maintenance under General accounts
    Then User_613 Enter the value in Status Tab
    And User_613 Double click the value under Status
    Then User_613 rename the Brief name
    And User_613 click the update button
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial

  @TRS_371
  Scenario: Functional Testing-Checking if a deposit transaction could be done for a non approved modified account  when “Proceed on Modified account” flag is checked
    Given User_613 login to Csm Param application
    And User_613 update test data set id for TRS_161
    Then User_613 Click the Parameters
    Then User_613 click the Account parameters
    And User_613 click the acc control record
    Then User_613 click the Update after approve screen under account parameters
    And User_613 click the JvAccounts tab in maintance
    Then User_613 click the Accounts under JvAccounts tab
    #And User_613 Check the flag of proceed on modified account
    Then User_613 click the update button in account parameters

  @TRS_371_01
  Scenario: Functional Testing-Checking if a multi transfer transaction could be done for a non approved modified account when “Proceed on Modified account” flag is checked
    Given navigate to CSM application and login with valid credentials
    And User_613 update test data set id for TRS_161
    And User_613 click the Accounts
    Then User_613 click the General Accounts
    And User_613 Click the maintenance under General accounts
    Then User_613 Enter the value in Status Tab
    #And User_613 Double click the value under Status
    Then User_613 rename the Brief name
    And User_613 click the update button
    And User_613 click the Transactions
    Then User_613 Click the Maintenance Below the Transactions
    And User_613 enter the value in Trx type
    Then User_613 enter values of Branch code
    And User_613 enter values of currency code
    And User_613 enter values of gl code
    And User_613 enter values of cif number
    And User_613 system gives the view memo popup user close the popup
    Then User_613 enter values of serial

                                          #  Sprint -15 #
  @TA_033
  Scenario: Created batch record when a CIF type exception is defined/ From GL to GL
    Given User_613 login to Csm Param application
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the Control Record
    And User_613 Click the Update After Approve in control record
    Then User_613 Select The Alert Activation
    And User_613 click the No Access privilege

  @TA_033_01
  Scenario: Created batch record when a CIF type exception is defined/ From GL to GL
   Given navigate to CSM application and login with valid credentials 
    And User_613 update test data set id for TA_037  
    And User_613 click the Transfer Accounts
    Then User_613 click the Maintance under Transfer account
    And User_613 Select the Transfer type from GL to GL
    Then User_613 Enter the value in Cif
    And User_613 Enter the original GL
    Then User_613 Enter the Destination GL
    And User_613 Enter the Reason field
    Then User_613 click the Set Exception
    And User_613 Select the exception factor in Ranking
    Then User_613 Select the value in Set Exception
    And User_613 Click the ok button in Set Exception
    Then User_613 click the Retrive button
    
    
     @TA_034
    Scenario: Created batch record when multi CIF types exception are defined/ From GL to GL
    Given User_613 login to Csm Param application
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the Control Record
    And User_613 Click the Update After Approve in control record
    Then User_613 Select The Alert Activation
    And User_613 click the No Access privilege
    
    @TA_034_01
    Scenario: Created batch record when multi CIF types exception are defined/ From GL to GL
    Given navigate to CSM application and login with valid credentials
    And User_613 update test data set id for TA_037    
    And User_613 click the Transfer Accounts
    Then User_613 click the Maintance under Transfer account
    And User_613 Select the Transfer type from GL to GL
    Then User_613 Enter the value in Cif
    And User_613 Enter the original GL
    Then User_613 Enter the Destination GL
    And User_613 Enter the Reason field
    Then User_613 click the Set Exception
    And User_613 Select the exception factor in Ranking
    Then User_613 Select the value in Set Exception
    And User_613 Click the ok button in Set Exception
    Then User_613 click the Retrive button
    
     @TA_035
    Scenario: Created batch record when Legal status exception is defined/ From GL to GL
    Given User_613 login to Csm Param application
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the Control Record
    And User_613 Click the Update After Approve in control record
    Then User_613 Select The Alert Activation
    And User_613 click the No Access privilege
    
     @TA_035_01
    Scenario: Created batch record when Legal status exception is defined/ From GL to GL
    Given navigate to CSM application and login with valid credentials
    And User_613 update test data set id for TA_037   
    And User_613 click the Transfer Accounts
    Then User_613 click the Maintance under Transfer account
    And User_613 Select the Transfer type from GL to GL
    Then User_613 Enter the value in Cif
    And User_613 Enter the original GL
    Then User_613 Enter the Destination GL
    And User_613 Enter the Reason field
    Then User_613 click the Set Exception
    And User_613 Select the exception factor in Ranking
    Then User_613 Select the value in Set Exception
    And User_613 Click the ok button in Set Exception
    Then User_613 click the Retrive button
    
     @TA_036
    Scenario: Created batch record when multi Ranking exception are defined/ From GL to GL
    Given User_613 login to Csm Param application
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the Control Record
    And User_613 Click the Update After Approve in control record
    Then User_613 Select The Alert Activation
    And User_613 click the No Access privilege
    
    @TA_036_01
    Scenario: Created batch record when multi Ranking exception are defined/ From GL to GL
  Given navigate to CSM application and login with valid credentials 
    And User_613 update test data set id for TA_037  
    And User_613 click the Transfer Accounts
    Then User_613 click the Maintance under Transfer account
    And User_613 Select the Transfer type from GL to GL
    Then User_613 Enter the value in Cif
    And User_613 Enter the original GL
    Then User_613 Enter the Destination GL
    And User_613 Enter the Reason field
    Then User_613 click the Set Exception
    And User_613 Select the exception factor in Ranking
    Then User_613 Select the value in Set Exception
    And User_613 Click the ok button in Set Exception
    Then User_613 click the Retrive button
    
     @TA_037
    Scenario: Creating batch record when Ranking exception is defined/ From GL to GL
    Given User_613 login to Csm Param application
    Then User_613 Click the Parameters
    And User_613 Click the System Parameters
    Then User_613 Click the Control Record
    And User_613 Click the Update After Approve in control record
    Then User_613 Select The Alert Activation
    And User_613 click the No Access privilege
    
    @TA_037_01
    Scenario: Creating batch record when Ranking exception is defined/ From GL to GL
    Given navigate to CSM application and login with valid credentials
    And User_613 update test data set id for TA_037    
    And User_613 click the Transfer Accounts
    Then User_613 click the Maintance under Transfer account
    And User_613 Select the Transfer type from GL to GL
    Then User_613 Enter the value in Cif
    And User_613 Enter the original GL
    Then User_613 Enter the Destination GL
    And User_613 Enter the Reason field
    Then User_613 click the Set Exception
    And User_613 Click the Add symbol
    And User_613 Select the exception factor in Ranking
    Then User_613 Select the value in Set Exception
    And User_613 Click the ok button in Set Exception
    Then User_613 click the Retrive button
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
