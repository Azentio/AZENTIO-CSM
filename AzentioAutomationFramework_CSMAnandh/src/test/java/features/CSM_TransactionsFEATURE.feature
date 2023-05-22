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
Scenario: To check the show all TRX falg under user in CSM Param
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
