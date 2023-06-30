Feature: To check the functionalitites of TransactionStaffAccounts request
 
                                       #    *********** Sprint - 8 (2) **********  #
@TSA_148
Scenario: Checking if the system is sending an alert when saving the transaction if any of the accounts defined is related to a Staff account
Given User login to Csm Param application
Then Click the Parameters 
And  Click the System Parameters
Then Click the Control Record 
And  Click the Update After Approve  
Then Select The Alert Activation 
And  Click the Account Balance Overdown 
Then The Flag of Staff Account Transaction should be checked 
And  Click the CIF parameters 
And  Click the CIF type 
Then Click the Update After Approve under the  CIF type
And  Enter the value in Brife Desc Eng  
Then Doubleclick of the existing record 
And  Click the Main Information 
#Then Check the flag  Cif Staff(checking)
And  Click the System Parameters
Then User_613 Click the Transaction Type 
And  Click the Update After Approve 
Then Click the Search button
And  Enter the code value 
Then user Double Click the Data 
And  select the Transaction Status 
Then click ok button 
And  User click the Transactions 
And  click the Approve below the Transactions
Then enter the transaction No in below Checkbox
And  User double click the data
And  click the Approve button
#Then System give the popup 


@TSA_152
Scenario: Check if the user is able to see his account the flag is unchecked grant access personal acc
Given Navigate to SADS application and login with valid credentials
    And User Click on Parameters under SADS application
    And User Click on Account Restrictions in Parameters under SADS application
    And User Click on Maintenance in Account Restrictions under Parameters
    And User click warning ok button
    And User Enter the value in Code under Maintenance Screen
    And User Enter the value in Description  under Maintenance Screen
    And User Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen
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

 
                                     #     ********** Sprint -9 *********   #

@TRS_017
Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates
Given User login to Csm Param application
And user_613 update test data set id for TRS_017 
Then Click the Parameters 
And  Click the System Parameters
And  User_613 click the Transaction type 
Then Click the Update after approve
And  Enter the Code value 
#Then User double click the Existing data 
And  just check the flag UPA
Then Click the Update After approve button in transaction type 
And  System giving information message click ok button
Then system show the success popup click ok button 
And  user_613 Click the Approve Below the Transaction type
Then Enter the Approved record in the code 
And  user_613 Double Click the Data
And  user_613 click the approve button in transaction type
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_017_01
Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates
Then User navigate to CSM application and login with valid credentials
And User_613 Click on Date to Change the Current Date
And User_613 Enter the Date in User Running Date
And User_613 Click on Use Button in Change Running Date Popup
And User_613 Click Ok Button in Information PopUp menu
And User_613 Click on Close Button in Change Running Date Popup
And user_613 update test data set id for TRS_017 
And User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of gl code 
And  enter values of cif number
And  system gives the view memo popup user close the popup
Then enter values of serial 
Then System show the warning popup click ok button
And  system gives the view memo popup user close the popup
#And  user enter the currency
And  Enter the Amount in this Checkbox
Then user_613 click the Account details button
And user_613 click the Add button under account details
Then user_613 enter values of Branch code under account details
And user_613 enter values of gl code under account details
Then user_613 enter values of cif number under account details
And  system gives the view memo popup user close the popup
And user_613 enter values of serial under account details
Then user_613 Enter the Amount in this Checkbox under account details
And user_613 click the Add button under account details
Then user_613 enter values of Branch code under account details_2
And user_613 enter values of gl code under account details_2
Then user_613 enter values of cif number under account details_2
And user_613 enter values of serial under account details_2
Then user_613 Enter the Amount in this Checkbox under account details_2
And user_613 click the ok button in account details
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button   
And  User click the Maintenance screen
Then click the search button
And enter the trx number
And double click the data
Then click the Booked Entries
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
Given User login to Csm Param application
And   user update test data set id for TRS_018 
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve under Transction type
And  Enter the Code value 
Then User double click the Existing data 
And  just check the flag UPA
Then Click the Update After approve button in transaction type 
And  System giving information message click ok button
Then system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_018_01
Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
Then User navigate to CSM application and login with valid credentials
And User_613 Click on Date to Change the Current Date
And User_613 Enter the Date in User Running Date
And User_613 Click on Use Button in Change Running Date Popup
And User_613 Click Ok Button in Information PopUp menu
And User_613 Click on Close Button in Change Running Date Popup
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of gl code 
And  enter values of cif number
Then enter values of serial 
And  user enter the currency
And  Enter the Amount in this Checkbox
Then System show the warning popup click ok button
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button   
And  User click the Maintenance screen
Then click the search button
And enter the trx number
And double click the data
Then click the Booked Entries
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
Given User login to Csm Param application
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the Code value 
Then User double click the Existing data 
And  Allow internal GL Account flag should be checked
And  just check the flag UPA
Then Click the Update After approve button in transaction type 
And  System giving information message click ok button
Then system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_019_01
Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
Then User navigate to CSM application and login with valid credentials
And User_613 Click on Date to Change the Current Date
And User_613 Enter the Date in User Running Date
And User_613 Click on Use Button in Change Running Date Popup
And User_613 Click Ok Button in Information PopUp menu
And User_613 Click on Close Button in Change Running Date Popup
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of gl code 
And  enter values of cif number
Then enter values of serial 
And  user enter the currency
And  Enter the Amount in this Checkbox
And  click the save button
And  system show the popup success user click the ok button


@TRS_020
Scenario: Checking Single Transfer (Main Debit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
#single transfer value change
Given User login to Csm Param application
And  user update test data set id for TRS_062 
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then User double click the Existing data 
And  Allow internal GL Account flag should be checked
And  just check the flag UPA
Then Click the Update After approve button in transaction type 
And  System giving information message click ok button
Then system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the single transfar Approved record in the code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_020_01
Scenario: Checking Single Transfer (Main Debit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
Then User navigate to CSM application and login with valid credentials
And User_613 Click on Date to Change the Current Date
And User_613 Enter the Date in User Running Date
And User_613 Click on Use Button in Change Running Date Popup
And User_613 Click Ok Button in Information PopUp menu
And User_613 Click on Close Button in Change Running Date Popup
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the single transfer in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of gl code 
And  enter values of cif number
Then enter values of serial
And  system gives the view memo popup user close the popup
And  user enter the currency
And  Enter the Amount in this Checkbox
And  click the save button
And  system show the popup success user click the ok button
And  User click the Maintenance screen
Then click the search button
And enter the trx number
And double click the data
Then click the Booked Entries
 

@TRS_021
Scenario: Checking Single Transfer (Main Debit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
Given User login to Csm Param application
And  user update test data set id for TRS_062 
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then User double click the Existing data 
#And  Allow internal GL Account flag should be checked
And  just check the flag UPA
Then Click the Update After approve button in transaction type 
And  System giving information message click ok button
Then system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the single transfar Approved record in the code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_021_01
Scenario: Checking Single Transfer (Main Debit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag unchecked
Then User navigate to CSM application and login with valid credentials
And User_613 Click on Date to Change the Current Date
And User_613 Enter the Date in User Running Date
And User_613 Click on Use Button in Change Running Date Popup
And User_613 Click Ok Button in Information PopUp menu
And User_613 Click on Close Button in Change Running Date Popup
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the single transfer in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of gl code 
And  enter values of cif number
Then enter values of serial 
#Then system show the stopper message


@TRS_022
Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
#multi transfer value change
Given User login to Csm Param application
And  user update test data set id for TRS_017 
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the Code value 
Then User double click the Existing data 
And  just check the flag UPA
Then Click the Update After approve button
And  System giving information message click ok button
Then system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_022_01
Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
Then User navigate to CSM application and login with valid credentials
And User_613 Click on Date to Change the Current Date
And User_613 Enter the Date in User Running Date
And User_613 Click on Use Button in Change Running Date Popup
And User_613 Click Ok Button in Information PopUp menu
And User_613 Click on Close Button in Change Running Date Popup
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of gl code 
And  enter values of cif number
Then enter values of serial 
And  user enter the currency
And  Enter the Amount in this Checkbox
Then System show the warning popup click ok button
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button   
And  User click the Maintenance screen
Then click the search button
And enter the trx number
And double click the data
Then click the Booked Entries
And  User Click the Queries 
And  Click the Statement of Account 
And  Click the By trade Date 
And  enter values of Currency Value
And  enter values of GL code 
And  enter values of cif code
Then enter values of Serial 
And  Click the Retrive button

                                #  ********* Sprint - 10 ***********  #

@TRS_057
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Booked Entries + Balance Updates
Given User login to Csm Param application
And  user update test data set id for TRS_062 
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then User double click the Existing data 
And  Check the falg of set default Trx currency is equal to account currency
Then Click the Update After approve button in transaction type 
And  System giving information message click ok button
And  system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the type code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_057_01
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Booked Entries + Balance Updates
And  user update test data set id for TRS_062 
Then User navigate to CSM application and login with valid credentials
And User_613 Click on Date to Change the Current Date
And User_613 Enter the Date in User Running Date
And User_613 Click on Use Button in Change Running Date Popup
And User_613 Click Ok Button in Information PopUp menu
And User_613 Click on Close Button in Change Running Date Popup
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the single transfer in trx type
Then enter values of Branch code
And  enter values of Currency code
Then  enter values of gl code for single transfer in debit account
And  enter values of cif number for single transfer in debit account
Then system gives the view memo popup user close the popup
And  enter values of serial for single transfer in debit account
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  user enter the currency
And  Enter the Amount in this Checkbox
Then user_613 enter the gl code in credit account 
And  user_613 enter the cif code in credit account 
Then user_613 enter the Serial number in credit account 
#And System show the warning popup click ok button
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value    
Then system gives the view memo popup user close the popup           
Then click the Approve button
And  system show the popup success user click the ok button   
And  User click the Maintenance screen
Then click the search button
And enter the trx number
And double click the data
Then system gives the view memo popup user close the popup
Then click the Booked Entries
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
Given User login to Csm Param application
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then  User double click the Existing data 




 
@TRS_059
Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates
Given User login to Csm Param application
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then  User double click the Existing data 


@TRS_060
Scenario: Checking Cash Withdrawal Transaction - Booked Entries + Balance Updates
Given User login to Csm Param application
And  user update test data set id for TRS_061 
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the type Code value 
Then User double click the typecode data
And  just check the flag UPA
Then Click the Update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the type code 
And  User Double Click the Approved typecode Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_060_01
Scenario: Checking Cash Withdrawal Transaction - Booked Entries + Balance Updates
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And  user enter the currency
And  Enter the Amount in this Checkbox
Then System show the warning popup click ok button
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button   
And  User click the Maintenance screen
#Then click the search button
#And enter the trx number
#And double click the data
#Then click the Booked Entries
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
Given User login to Csm Param application
And  user update test data set id for TRS_061 
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the type Code value 
Then User double click the typecode data 
And  uncheck the flag of proceed on insufficient fund
Then Click the Update After approve button in transaction type 
And  System giving information message click ok button
And  system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the type code 
And  User Double Click the Approved typecode Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 
Then user click the Account parameters
And  click the Account type
Then click the update after Approve
And  Enter the type code
Then Double click the data
And  click the Instructions
Then uncheck the flag Allow Overdrawn
Then Click the Update After approve button in transaction type
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 
And  user click the Approve screen
Then enter the type code
And  double click the Data 
Then user click the Approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully

@TRS_061_01
Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked.
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number
Then enter values of serial  


@TRS_062
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked
Given User login to Csm Param application
And   user update test data set id for TRS_062 
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then  User double click the Existing data 
And  uncheck the flag of proceed on insufficient fund
Then Click the Update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the type code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 
Then user click the Account parameters
And  click the Account type
Then click the update after Approve
And  Enter the type code
Then Double click the data
And  click the Instructions
Then uncheck the flag Allow Overdrawn
Then Click the Update After approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 
And  user click the Approve screen
Then enter the type code
And  double click the Data 
Then user click the Approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully

@TRS_062_01
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the single transfer in trx type
Then enter values of Branch code
And  enter values of Currency code
Then  enter values of gl code for single transfer
And  enter values of cif number for single transfer
And  enter values of serial for single transfer
#Then system show the popup of Non internal Account


                                 # **********   Sprint -11   ********** #

@TRS_104               
Scenario: Checking Cash Deposit Transaction - CIF Type Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
Given User login to Csm Param application
And  user update test data set id for TRS_105 
Then Click the Parameters 
And  Click the System Parameters
Then Click the User 
Then Click the Update after approve
Then User Enter the Name in the UserId
And  User double click the data
Then User click the cif types
And  enter the code values
Then check the flag of Warn user If Limit Exceeds
And  click the ok button
Then Click the update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  Click the approve screen 
Then user Enter the Name in the UserId
And  user double click the Data
Then Click the Approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully

@TRS_104_01               
Scenario: Checking Cash Deposit Transaction -CIF Type Deposit Limit Defined -Warn User if Limit Exceeds UnChecked -Proceed if Limit Exceeds Checked -Amount > Limit
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And  System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  user enter the currency
And  Enter the Amount in this Checkbox
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button


@TRS_105                              
Scenario: Checking Cash Depsoit Transaction -CIF Type Deposit Limit Defined -Warn User if Limit Exceeds Checked -Amount > Limit -Specifc vs. General
Given User login to Csm Param application
And  user update test data set id for TRS_105 
Then Click the Parameters 
And  Click the System Parameters
Then Click the User 
Then Click the Update after approve
Then User Enter the Name in the UserId
And  User double click the data
Then User click the cif types
And  enter the code values
#Then user enter the Transaction
#And  enter the value in deposit limit
#Then check the flag of Warn user If Limit Exceeds
And  click the ok button
Then Click the update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  Click the approve screen 
Then user Enter the Name in the UserId
And  user double click the Data
Then Click the Approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully

@TRS_105_01                            
Scenario: Checking Cash Depsoit Transaction -CIF Type Deposit Limit Defined -Warn User if Limit Exceeds Checked -Amount > Limit -Specifc vs. General
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  user enter the currency
And  Enter the Amount in this Checkbox
#Then system show the stopper message




@TRS_106
Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
Given User login to Csm Param application
And  user update test data set id for TRS_106 
Then Click the Parameters 
And  Click the System Parameters
Then Click the User 
Then Click the Update after approve
Then User Enter the Name in the UserId
And  User double click the data
Then User click the Priority
And  Click the Number one 
#Then enter the withdraw limit 
#Then check the flag of Warn user If Limit Exceeds
And  click the ok button
Then Click the update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  Click the approve screen 
Then user Enter the Name in the UserId
And  user double click the Data
Then Click the Approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully

@TRS_106_01
Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  user enter the currency
And  Enter the Amount in this Checkbox
#Then System show the warning popup click ok button
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button



@TRS_107
Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
Given User login to Csm Param application
And  user update test data set id for TRS_107 
Then Click the Parameters 
And  Click the System Parameters
Then Click the User 
Then Click the Update after approve
Then User Enter the Name in the UserId
And  User double click the data
Then User click the Priority
And  Click the Number one 
#Then enter the withdraw limit 
#Then check the flag of Warn user If Limit Exceeds
And  click the ok button
Then Click the update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  Click the approve screen 
Then user Enter the Name in the UserId
And  user double click the Data
Then Click the Approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully

@TRS_107_01
Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  user enter the currency
And  Enter the Amount in this Checkbox
#Then system show the stopper message


@TRS_108
Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Given User login to Csm Param application
And  user update test data set id for TRS_107 
Then Click the Parameters 
And  Click the System Parameters
Then Click the User 
Then Click the Update after approve
Then User Enter the Name in the UserId
And  User double click the data
Then User click the Priority
And  Click the Number one 
#Then enter the withdraw limit 
#Then check the flag of Warn user If Limit Exceeds
#And check the falg of proceed If Limit Exceeds
And  click the ok button
Then Click the update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  Click the approve screen 
Then user Enter the Name in the UserId
And  user double click the Data
Then Click the Approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully

@TRS_108_01
Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  user enter the currency
And  Enter the Amount in this Checkbox
Then System show the warning popup click ok button
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button


                                  # ********* Sprint -12 ************* #
                                   


@TRS_157
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account
Given User login to Csm Param application
And  user update test data set id for TRS_157
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then  User double click the Existing data 
And  check the flag of debtor Account
Then Click the Update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the type code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_157_01
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  user enter the currency
And  Enter the Amount in this Checkbox
Then enter the below account in glcode value
And  enter the Ciftype value 
Then enter the serial value 
Then System show the warning popup click ok button
Then System show the warning popup click ok button
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button
Then click the Booked Entries

@TRS_158
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Credit Account
Given User login to Csm Param application
And  user update test data set id for TRS_157
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then  User double click the Existing data 
And  check the flag of Creditor Account
Then Click the Update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the type code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_158_01
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Credit Account
Then User navigate to CSM application and login with valid credentials
And  User_613 click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  User_613 enter the currency
And  Enter the Amount in this Checkbox
Then enter the below account in glcode value
And  enter the Ciftype value 
Then enter the serial value 
Then System show the warning popup click ok button
Then System show the warning popup click ok button
And  click the save button
And  user_613 get Transaction number from sucess pop up
And  user_613 click the Approve screen     
Then user_613 Enter the Transaction number   
And  double click the Value               
Then User_613 click the Approve button
And  system show the popup success user click the ok button
Then click the Booked Entries

@TRS_159
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Teller Account
Given User login to Csm Param application
And  User_163 update test data set id for TRS_157
Then Click the Parameters 
And  Click the System Parameters
And  User_163 click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then  User_163 double click the Existing data 
And  check the flag of Teller Account
Then Click the Update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the type code 
And  User Double Click the Data
And  User_613 click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_159_01
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Teller Account
Then User navigate to CSM application and login with valid credentials
And  User_613 click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  User_613 enter the currency
And  Enter the Amount in this Checkbox
Then enter the below account in glcode value
And  enter the Ciftype value 
Then enter the serial value 
Then System show the warning popup click ok button
Then System show the warning popup click ok button
And  click the save button
And  User_613 get Transaction number from sucess pop up
And  User_613 click the Approve screen     
Then User_613 Enter the Transaction number   
And  double click the Value               
Then User_613 click the Approve button
And  system show the popup success user click the ok button
Then click the Booked Entries

@TRS_160
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Other Account
Given User login to Csm Param application
And  User_613 update test data set id for TRS_157
Then Click the Parameters 
And  Click the System Parameters
And  User_613 click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then User_613 double click the Existing data 
And  check the flag of other Account
Then User_613 click the update after approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  User_613 Click the Approve Below the Transaction type
Then Enter the Approved record in the type code 
And  User_613 Double Click the Data
And  User_613 click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 

@TRS_160_01
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Other Account
Then User navigate to CSM application and login with valid credentials
And  User_613 click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  User_613 enter the currency
And  Enter the Amount in this Checkbox
Then enter the below account in glcode value
And  enter the Ciftype value 
Then enter the serial value 
Then System show the warning popup click ok button
Then System show the warning popup click ok button
And  click the save button
And  User_613 get Transaction number from sucess pop up
And  User_613 click the Approve screen     
Then User_613 Enter the Transaction number   
And  double click the Value               
Then  User_613 click the Approve button
And  system show the popup success user click the ok button
Then click the Booked Entries

@TRS_161
Scenario: Checking Single Transfer(Main Debit)Intra Transaction-Deduct Charges from Debit Account-Modify flags not checked on Trx Type or Charge Code                                  
#single transfer value change 
Given User login to Csm Param application
And  User_613 update test data set id for TRS_161
Then Click the Parameters 
And  Click the System Parameters
And  User_613 click the Charges
And  User_613 Click the Maintance of charges
Then User_613 Click the Update after approve
And  Enter the Value of T in Brief Name 
Then User_613 double click the Existing data of charges
And User_613 Uncheck the flag of Allow modify and clear
And uncheck the flag of Allow modify 
Then User_613 click the update after approve button 
And  System giving information message click ok button
And  system show the success popup click ok button 
And User_613 click the Approve screen in Charges
Then enter the code value
And User_613 double click the data in the code
Then User_613 click the Approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully

@TRS_161_01
Scenario: Checking Single Transfer(Main Debit)Intra Transaction-Deduct Charges from Debit Account-Modify flags not checked on Trx Type or Charge Code                                  
Then User navigate to CSM application and login with valid credentials
And  User_613 click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in Trx type
Then enter values of Branch code
And  enter values of currency code
And  enter values of gl code 
And  enter values of cif number  
And  system gives the view memo popup user close the popup
Then enter values of serial
And System show the warning popup click ok button
Then system gives the view memo popup user close the popup
And  User_613 enter the currency
And  Enter the Amount in this Checkbox
Then enter the below account in glcode value
And  enter the Ciftype value 
Then enter the serial value 
And the Cv Charges is Enabeled
                                        
                              # *********** Sprint -14 *********** #
@TRS_369
Scenario: Functional Testing -Checking if a single transfer transaction could be done for a non approved modified account when"Proceed on Modified account” flag is checked
Given User login to Csm Param application
#And User_613 update test data set id for TRS_161
Then Click the Parameters   
Then User_613 click the Account parameters
And User_613 click the acc control record
Then User_613 click the Update after approve screen under account parameters
And User_613 click the JvAccounts tab in maintance
Then User_613 click the Accounts under JvAccounts tab
#And User_613 Check the flag of proceed on modified account 
Then User_613 click the update button in account parameters

@TRS_369_01
Scenario: Functional Testing -Checking if a single transfer transaction could be done for a non approved modified account when"Proceed on Modified account” flag is checked
Then User navigate to CSM application and login with valid credentials
And User_613 click the Accounts 
Then User_613 click the General Accounts 
And User_613 Click the maintenance under General accounts 
Then User_613 Enter the value in Status Tab
And User_613 Double click the value under Status
Then User_613 rename the Brief name
And User_613 click the update button
And  User_613 click the Transactions
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
Given User login to Csm Param application
#And User_613 update test data set id for TRS_161
Then Click the Parameters   
Then User_613 click the Account parameters
And User_613 click the acc control record
Then User_613 click the Update after approve screen under account parameters
And User_613 click the JvAccounts tab in maintance
Then User_613 click the Accounts under JvAccounts tab
#And User_613 Check the flag of proceed on modified account 
Then User_613 click the update button in account parameters

@TRS_370_01
Scenario: Functional Testing-Checking if a multi transfer transaction could be done for a non approved modified account when “Proceed on Modified account” flag is checked                        
Then User navigate to CSM application and login with valid credentials
And User_613 click the Accounts 
Then User_613 click the General Accounts 
And User_613 Click the maintenance under General accounts 
Then User_613 Enter the value in Status Tab
And User_613 Double click the value under Status
Then User_613 rename the Brief name
And User_613 click the update button
And  User_613 click the Transactions
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
Given User login to Csm Param application
#And User_613 update test data set id for TRS_161
Then Click the Parameters   
Then User_613 click the Account parameters
And User_613 click the acc control record
Then User_613 click the Update after approve screen under account parameters
And User_613 click the JvAccounts tab in maintance
Then User_613 click the Accounts under JvAccounts tab
#And User_613 Check the flag of proceed on modified account 
Then User_613 click the update button in account parameters

@TRS_371_01
Scenario: Functional Testing-Checking if a deposit transaction could be done for a non approved modified account  when “Proceed on Modified account” flag is checked
Scenario: Functional Testing-Checking if a multi transfer transaction could be done for a non approved modified account when “Proceed on Modified account” flag is checked                        
Then User navigate to CSM application and login with valid credentials
And User_613 click the Accounts 
Then User_613 click the General Accounts 
And User_613 Click the maintenance under General accounts 
Then User_613 Enter the value in Status Tab
And User_613 Double click the value under Status
Then User_613 rename the Brief name
And User_613 click the update button
And  User_613 click the Transactions
Then User_613 Click the Maintenance Below the Transactions
And User_613 enter the value in Trx type
Then User_613 enter values of Branch code
And User_613 enter values of currency code
And User_613 enter values of gl code 
And User_613 enter values of cif number  
And User_613 system gives the view memo popup user close the popup
Then User_613 enter values of serial











