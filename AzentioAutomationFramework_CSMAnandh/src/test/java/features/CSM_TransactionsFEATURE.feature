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
And uncheck the show today trx flag in CSM Param
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
And uncheck the show today trx flag in CSM Param
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
And uncheck the show all trx flag in CSM Param
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
And uncheck the show all trx flag in CSM Param
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
@TRS_044_01
Scenario: To un check the enable multi branh in transaction type
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_044_01
And click on transaction type feature
And click on update after approve in transcation type
And search the deposite transaction number in update after approve
And select the transaction record in update after approve screen
And check the multi branch field in transaction type
And check the allow internal GL flag
And click on update after approve button in transaction type
And click on ok button in update confirmation of transaction type
And click on ok button of successfull update in transaction type
And close the transaction type update after approve screen
And click on ok button
And click on approve feature under transaction type
And search for the transaction type which is updated
And select the updated transaction type in approval screen
And click on approve button in transaction type approval
And click on ok button in update confirmation in transaction type
And click on ok button in successful approval of transaction type
@TRS_044
Scenario: Checking Cash Deposit Transaction - Interbranch
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_044
And change the system date to given date
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And enter the currency code
And enter the amount for deposite in transaction
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_044
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And click on approve button
Then verify system should show the stopper message for transaction approval

@TRS_045_01
Scenario: To un check the enable multi branh in transaction type
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_045_01
And click on transaction type feature
And click on update after approve in transcation type
And search the deposite transaction number in update after approve
And select the transaction record in update after approve screen
And uncheck the multi branch field in transaction type
And click on update after approve button in transaction type
And click on ok button in update confirmation of transaction type
And click on ok button of successfull update in transaction type
And close the transaction type update after approve screen
And click on ok button
And click on approve feature under transaction type
And search for the transaction type which is updated
And select the updated transaction type in approval screen
And click on approve button in transaction type approval
And click on ok button in update confirmation in transaction type
And click on ok button in successful approval of transaction type
@TRS_045
Scenario: Checking Cash Deposit Transaction - Interbranch
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_045
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the currency code for cash deposite
And clear the currency code value from deposite
And click on live search in deposte transaction
And search for branch code in deposite transaction live search
And search for currency code in deposite live search
And search for gl code in deposite transaction live search
And search for CIF number in deposite transaction live search
And search for serial number in deposite transaction live search
And select the other branch account from live search in deposite transaction
Then verify system should show the validation for multi branch validation

@TRS_046_01
Scenario: To check the multi branch and post and past date of falg in transaction type 
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_046_01
And click on transaction type feature
And click on update after approve in transcation type
And search the deposite transaction number in update after approve
And select the transaction record in update after approve screen
And check the Allow Back Dated Value Date flag
And check the Allow Post Dated Value Date flag
And click on update after approve button in transaction type
And click on ok button in update confirmation of transaction type
And click on ok button of successfull update in transaction type
And close the transaction type update after approve screen
And click on ok button
And click on approve feature under transaction type
And search for the transaction type which is updated
And select the updated transaction type in approval screen
And click on approve button in transaction type approval
And click on ok button in update confirmation in transaction type
And click on ok button in successful approval of transaction type

@TRS_046
Scenario: Checking Cash Deposit Transaction - Interbranch
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_046
And change the system date to given date
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for deposite in transaction
And change the value date to past date in transaction maintenance
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_046
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And click on booked entries button in approved transactions
And close the transaction tab
And click on queries feature
And click on statement of accounts feature
And click on by value date under statements of accounts
#And enter the branch code in staments of accounts
And enter the currency code in staments of accounts
And enter the account type in statements of accounts
And enter the CIF number in staments of accounts
And enter the serial number in statements of accounts
And enter the from date in statements of accounts
And enter the to date in statements of accounts
And click on retrive button in statements of accounts
Then verify system should display the CV amount in statement of accounts screen



@TRS_049
Scenario: Checking Cash Deposit Transaction - Interbranch
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_049
And change the system date to given date
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for deposite in transaction
And change the value date to post date in transaction maintenance
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_049
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And click on booked entries button in approved transactions
And close the transaction tab
And click on queries feature
And click on statement of accounts feature
And click on by value date under statements of accounts
#And enter the branch code in staments of accounts
And enter the currency code in staments of accounts
And enter the account type in statements of accounts
And enter the CIF number in staments of accounts
And enter the serial number in statements of accounts
And enter the from date in statements of accounts
And enter the to date in statements of accounts
And click on retrive button in statements of accounts
Then verify system should display the CV amount in statement of accounts screen

@TRS_047_50_01
Scenario: To check the show today TRX falg under user in CSM Param
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_047_50_01
And click on transaction type feature
And click on update after approve in transcation type
And search the deposite transaction number in update after approve
And select the transaction record in update after approve screen
And check the allow internal GL flag
And check the Allow Back Dated Value Date flag
And check the Allow Post Dated Value Date flag
And check the enable multi branch flag
And click on update after approve button in transaction type
And click on ok button in update confirmation of transaction type
And click on ok button of successfull update in transaction type
And close the transaction type update after approve screen
And click on ok button
And click on approve feature under transaction type
And search for the transaction type which is updated
And select the updated transaction type in approval screen
And click on approve button in transaction type approval
And click on ok button in update confirmation in transaction type
And click on ok button in successful approval of transaction type
@TRS_047
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Interbranch ( Past value date)
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_047
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the debit branch code
And enter the debit currency code
And enter the debit gl code
And enter the debit cif number
And enter the debit debit serial number
And enter the currency code
And enter the amount for debit transfer transaction  
And enter the credit branch code
And enter the credit gl code
And enter the credit cif number
And enter the credit serial number
And click on ok button no resident pop up
And change the value date to past date in transaction maintenance
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_047
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And click on booked entries button in approved transactions
@TRS_050
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Interbranch ( Past value date)
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_050
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the debit branch code
And enter the debit currency code
And enter the debit gl code
And enter the debit cif number
And enter the debit debit serial number
And enter the currency code
And enter the amount for debit transfer transaction  
And enter the credit branch code
And enter the credit gl code
And enter the credit cif number
And enter the credit serial number
And click on ok button no resident pop up
And change the value date to post date in transaction maintenance
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_050
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And click on booked entries button in approved transactions

@TRS_048
Scenario: Checking Multi Transfer (Main Credit) Transaction - Interbranch
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_048
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And click on ok buton in staff member ok button
And enter the amount for deposite in transaction
And click on account details button in transaction maintenance
And click on add button in acccount details of transaction maintenance
And enter the branch code in first grid of account details
And enter the gl code in frist grid of account details
And enter the cif number in first grid of account details
And enter the serial number in frist grid of account details
And enter the amount in first grid of account details
And click on add button in acccount details of transaction maintenance
And click on live search in second row of account details
And enter the second account branch code in account details
And search the second gl code in additional account details
And search the second cif number in additional account details
And search the second serial number in additional account details
And select the record for second additional account
And enter the amount in second grid of account details
And click on ok button in additional account details
And change the value date to past date in multi credit transaction
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_048
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And click on booked entries button in approved transactions