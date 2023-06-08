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
Then Click the Transaction Type 
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
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of gl code 
And  enter values of cif number
Then enter values of serial 
And  system gives the view memo popup user close the popup
Then System show the warning popup click ok button
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

@TRS_018
Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
Given User login to Csm Param application
And   user update test data set id for TRS_018 
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
Then User navigate to CSM application and login with valid credentials
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
Then Click the Update After approve button
And  System giving information message click ok button
Then system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of Gl code 
And  enter values of Cif code
Then enter values of serial 
And  user enter the currency
And  Enter the Amount in this Checkbox
And  click the save button
And  system show the popup success user click the ok button


@TRS_020
Scenario: Checking Single Transfer (Main Debit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
#single transfer value change
Given User login to Csm Param application
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then User double click the Existing data 
And  Allow internal GL Account flag should be checked
#And  just check the flag UPA
Then Click the Update After approve button
And  System giving information message click ok button
Then system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the single transfar Approved record in the code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the single transfer in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of Gl code 
And  enter values of Cif code
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
Then Click the Parameters 
And  Click the System Parameters
And  User click the Transaction type 
Then Click the Update after approve
And  Enter the single transfer Code value 
Then User double click the Existing data 
#And  Allow internal GL Account flag should be checked
And  just check the flag UPA
Then Click the Update After approve button
And  System giving information message click ok button
Then system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the single transfar Approved record in the code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the single transfer in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of Gl code 
And  enter values of Cif code
Then enter values of serial 
And  user enter the currency
And  Enter the Amount in this Checkbox
And  click the save button
And  system show the popup success user click the ok button


@TRS_022
Scenario: Checking Multi Transfer (Main Credit) Transaction - Booked Entries + Balance Updates - Allow Internal GL flag checked
#multi transfer value change
Given User login to Csm Param application
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
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of Gl code 
And  enter values of Cif code
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
Then Click the Update After approve button
And  System giving information message click ok button
And  system show the success popup click ok button 
And  User Click the Approve Below the Transaction type
Then Enter the Approved record in the type code 
And  User Double Click the Data
And  User click the approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the single transfer in trx type
Then enter values of Branch code
And  enter values of Currency code
Then  enter values of gl code for single transfer
And  enter values of cif number for single transfer
And  enter values of serial for single transfer
#Then click the Booked Entries
#And  click the save button
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
Then Click the Update After approve button
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
Then Click the Update After approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully 
And  user click the Approve screen
Then enter the type code
And  double click the Data 
Then user click the Approve button
And  System show the  confirm popup user click the ok button
And  System show the record was successfully
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
And  user update test data set id for TRS_062 
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
And  click the save button
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button




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
And  User get Transaction number from sucess pop up
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button















  