Feature: To Test the transactions feature in CSM
@TRS_001_01
Scenario: To check the show all TRX falg under user in CSM Param
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_001_01
And search the user ID in user module
And select the user from suggestion
And check the show all trx flag in CSM Param
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_001_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And logout from the application
@TRS_001
Scenario: checking if the user is able to see all transactions created under the system 
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_001
And change the system date to current date
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction maintenance screen
And clear the transaction maintenenace grid
Then verify transaction maintenance gridgot cleared
And enter the transaction number in transaction maintenance search grid which was done by other teller
Then verify system should show the transaction details for the perticular transaction in search grid
And enter the transaction number in transaction maintenance search grid which was done by him self
Then system should display the transaction details which was created by himself

@TRS_002_01
Scenario: To uncheck the show all TRX falg under user in CSM Param
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_002_01
And search the user ID in user module
And select the user from suggestion
And uncheck the show all trx flag in CSM Param
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_002_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And logout from the application
@TRS_002
Scenario: checking if the user is able to see all transactions created under the system 
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_002
And change the system date to current date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction maintenance screen
And clear the transaction maintenenace grid
Then verify transaction maintenance gridgot cleared
And enter the transaction number in transaction maintenance search grid which was done by him self
Then system should display the transaction details which was created by himself
And enter the transaction number in transaction maintenance search grid which was done by other teller 
Then verify system should not show the transaction which was created by other teller
@TRS_003_01
Scenario: To check the show today TRX falg under user in CSM Param
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_003_01
And search the user ID in user module
And select the user from suggestion
And check the show today trx flag in CSM Param
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_003_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And logout from the application
@TRS_003
Scenario: checking if the system is only displaying transactions created in the current day 
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_003
And change the system date to current date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction maintenance screen
And clear the transaction maintenenace grid
Then verify transaction maintenance gridgot cleared
And enter the transaction number which is created at the meentioned date
Then verify system should show the transaction number in maintenance grid
And enter the transaction number which was created at past date
Then verify system should not show the transaction details of the past date

@TRS_004_01
Scenario: To uncheck the show today TRX falg under user in CSM Param
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_004_01
And search the user ID in user module
And select the user from suggestion
And uncheck the show today trx flag in CSM Param
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_004_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And logout from the application
@TRS_004
Scenario: checking if the user is able to see all transactions created under the system 
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_004
And change the system date to current date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction maintenance screen
And clear the transaction maintenenace grid
Then verify transaction maintenance gridgot cleared
And enter the transaction number which is created at the meentioned date
Then verify system should show the transaction number in maintenance grid
And enter the transaction number which was created at past date
Then verify system should show the transaction details of the past date
@TRS_005
Scenario: Transactions -> Maintenance screen -> No access to Acc.type
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case ID TRS_005
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
Then verify system should show the validation message for no access for account type
@TRS_006
Scenario: Transactions -> Maintenance screen - No access to CIF type
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case ID TRS_006
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for deposite in transaction
Then verify system should show the validation message for no access for CIF type
@TRS_007
Scenario: Transactions -> Maintenance screen - No access to Priority
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case ID TRS_007
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for deposite in transaction
Then verify system should show the validation message for no access for Priority