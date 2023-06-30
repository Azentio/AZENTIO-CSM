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

@TRS_089_01
Scenario: under csm Param need to set the limit for withdraw transaction
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_089_01
And search the user ID in user module
And select the user from suggestion
And click on account type access option
And search for the account type which user created
And delete the account type details
And click on add button in account type access
And enter the account type for access
And enter the transaction type for withdraw in account type access
And enter the limit for withdraw in account type access
And check the warn if user limit exceeds in account type
And check the proceed if limit exceeds in account type
And click on ok button in access screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_089_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And store the transaction number and withdraw amount in transaction excel Database
And logout from the application
@TRS_089
Scenario: Checking Cash Withdrawal Transaction - Account Type Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_089
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
And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for debit from the account
Then verify system should show the validation for limit for account type
And click on save button in transaction
And click on ok button in transaction warning
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_089
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And click on approve button
And click on ok button in transaction warning
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved

@TRS_090_01
Scenario: under csm Param need to set the limit for withdraw transaction (check the proceed) 
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_090_01
And search the user ID in user module
And select the user from suggestion
And click on account type access option
And search for the account type which user created
And delete the account type details
And click on add button in account type access
And enter the account type for access
And enter the transaction type for withdraw in account type access
And enter the limit for withdraw in account type access
And check the proceed if limit exceeds in account type
And click on ok button in access screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_090_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And store the transaction number and withdraw amount in transaction excel Database
And logout from the application

@TRS_090
Scenario: Checking Cash Withdrawal Transaction - Account Type Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_090
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
And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for debit from the account
Then verify system should not show the validation for limit for account type
And click on save button in transaction
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_090
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

@TRS_091_01
Scenario: under csm Param need to set the limit for deposite transaction (check the proceed) 
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_091_01
And search the user ID in user module
And select the user from suggestion
And click on account type access option
And search for the account type which user created
And delete the account type details
And click on add button in account type access
And enter the account type for access
And enter the transaction type for withdraw in account type access
And enter the limit for deposite in account type access
And check the warn if user limit exceeds in account type
And click on ok button in access screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_091_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And store the transaction number and deposite amount and exceed amount in transaction excel Database
And logout from the application
@TRS_091
Scenario: Checking Cash Deposit Transaction - Account Type Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_091
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And choose the transaction reason in transaction maintenance
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for deposite in transaction
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_091
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

@TRS_092
Scenario: Checking Cash Deposit Transaction - Account Type Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_092
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And choose the transaction reason in transaction maintenance
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And click on ok buton in staff member ok button
And enter the currency code
And enter the limit exceed amount for deposite in transaction
Then verify system should show the validation for limit of account type

@TRS_093_01
Scenario: under csm Param need to set the limit for deposite transaction (check the proceed,Check warn user if limit exceed) 
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_093_01
And search the user ID in user module
And select the user from suggestion
And click on account type access option
And search for the account type which user created
And delete the account type details
And click on add button in account type access
And enter the account type for access
And enter the transaction type for withdraw in account type access
And enter the limit for deposite in account type access
And check the warn if user limit exceeds in account type
And check the proceed if limit exceeds in account type
And click on ok button in access screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_093_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And store the high deposite amount and transaction type in transaction excel database
And logout from the application
@TRS_093
Scenario: Checking Cash Deposit Transaction - Accont Type Deposit Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_093
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And choose the transaction reason in transaction maintenance
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And click on ok buton in staff member ok button
And enter the currency code
And enter the limit exceed amount for deposite in transaction
Then verify system should show the validation for limit for account type
And click on save button in transaction 
And click on ok button in transaction warning
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_093
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And click on approve button
And click on ok button in transaction warning
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
@TRS_094_01
Scenario: under csm Param need to set the limit for deposite transaction (check the proceed,Check warn user if limit exceed) 
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_094_01
And search the user ID in user module
And select the user from suggestion
And click on account type access option
And search for the account type which user created
And delete the account type details
And click on add button in account type access
And enter the account type for access
And enter the transaction type for withdraw in account type access
And enter the limit for deposite in account type access
And check the proceed if limit exceeds in account type
And click on ok button in access screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_094_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And store the high deposite amount and transaction type in transaction excel database
And logout from the application
@TRS_094
Scenario: Checking Cash Deposit Transaction - Accont Type Deposit Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_094
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And choose the transaction reason in transaction maintenance
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And enter the serial number for cash deposite
And click on ok buton in staff member ok button
And enter the currency code
And enter the limit exceed amount for deposite in transaction
Then verify system should not show the validation for limit for account type
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_094
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

@TRS_095_01
Scenario: under csm Param need to set the limit for withdraw transaction
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_095_01
And search the user ID in user module
And select the user from suggestion
And click on account type access option
And search for the account type which user created
And delete the account type details
And click on add button in account type access
And enter the account type for access
And enter the transaction type for withdraw in account type access
And enter the overdrawn for withdraw accout type access
And check the warn if user limit exceeds in account type
And click on ok button in access screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_095_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And store the transaction number and withdraw amount in transaction excel database for limit and overdrawn
And logout from the application
@TRS_095_03
Scenario: under csm Param need to set the limit for withdraw transaction
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_095_03
And search the user ID in user module
And select the user from suggestion
And click on limit button under user
And search for the withdraw transaction type
And click on add buttton in limit button 
And enter the currency in withdraw limit
And enter the transaction type in limit button
And enter the withdraw limit in limit button
#And check the flag warn if user limit exceeds under limit
And click on ok button in limit access
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_095_03
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And store the transaction number and withdraw amount in transaction excel database for limit and overdrawn
And logout from the application
@TRS_095_03
Scenario: To check the force overdrawn flag under transaction type update after approve
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_095_02
And click on transaction type feature
And click on update after approve in transcation type
And search the transaction type in update after approve transaction type
And select the transaction record in update after approve screen
And check the force overdrawn flg under transaction type
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
@TRS_095
Scenario: Checking Cash Withdrawal Transaction - Account Type Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_095
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
And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for debit from the account
Then verify system should not show the validation for limit for account type
And click on save button in transaction
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_095
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

@TRS_150_155
Scenario: To check the flags in control records (CIF Non-Resident Alert flag,Signature not Found Alert flag,Account Dormant Alert flag,Value Date changed Alert flag,KYC Outstanding Alert flag,Overdraw Limit Exceeded Alert flag)
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameters feature
And click on control records sub feature
And click on update after approve in control records
And click on alert activation tab under control records
And check the flag CIF non resident alert flag in alert activation
And check the flag signature not fountt alert flag in alert activation
And check the flag account dormant alert flag in alert activation
And check the value date changed alert flag in alert activation
And check the overdrawn limit exceeded alert falg in alert activation
And check the KYC out standing alert flag in alert activation
And click on update after approve screen under control records
And click on ok button in save confirmation of control records
And click on ok button for update confirmation in control records
And click on approve feature under control records
And approve the control records feature
And click on ok in approve confirmation in control records
And click on ok button in approve successful pop up in control records
@TRS_150_01
Scenario: To enter the transaction status in withdraw transaction for alert activation
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on transaction type feature
And click on update after approve in transcation type
And get the test data for test case ID TRS_150_01
And search the transaction type in update after approve transaction type
And select the transaction record in update after approve screen
And click on transaction status buttton in transaction type
And check the any existence transaction
And click on add button to add the transaction status
And enter the AND OR in transaction status
And enter the priority in transaction status
And enter the staus code in transaction status
And enter the user level in transaction status
And click on ok button in transaction status window
And check the Allow Back Dated Value Date flag
And check the Allow Post Dated Value Date flag
And uncheck the flag request currency denomination flag in transaction type
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
And store the transaction type in transaction excel data base for withdraw alert activation
@TRS_150_02
Scenario: Login the Branch manager for sending the alert
And get the test data for test case ID TRS_150_02
Given navigate to CSM application and login with valid credentials
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
@TRS_150
Scenario: Checking Cash Withdrawal Transaction - CIF Non-Resident Alert flag
Given user 076 navigate to CSM Aplication and login with teller account
And get the test data for test case ID TRS_150
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
Then verify system should show the non resident warning message
And enter the currency code
And enter the amount for debit from the account
And click on save button in transaction
And store the transaction number in transaction excel database
Then verify alert screen is open in transactio maintenannce
And enter the branch manager user ID in alert section
And click on the branch manager ID in alert suggestion grid
And click on sent button in alert section
@TRS_150_03
Scenario: Login the Branch manager for sending the alert
And get the test data for test case ID TRS_150_03
Given navigate to CSM application and login with valid credentials
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
Then verify branch manager ANANDH got the alert which is sent from teller ANANDHTA
And select the transaction record from alert
And click on open item buttton in alert
And click on approve button in alert screen
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved

@TRS_151
Scenario: Checking Cash Withdrawal Transaction - CIF Non-Resident Alert flag
Given user 076 navigate to CSM Aplication and login with teller account
And get the test data for test case ID TRS_151
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
Then verify system should show the warning message for dormant account in transaction maintenance
And enter the debit debit serial number
Then verify system should show the validation for signature not found in transaction maintenance
And click on ok button in transaction maintenance
And enter the currency code
And enter the amount for debit from the account
And click on save button in transaction
And store the transaction number in transaction excel database
Then verify alert screen is open in transactio maintenannce
And enter the branch manager user ID in alert section
And click on the branch manager ID in alert suggestion grid
And click on sent button in alert section
@TRS_151_02
Scenario: Login the Branch manager for sending the alert
And get the test data for test case ID TRS_151_02
Given navigate to CSM application and login with valid credentials
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
Then verify branch manager ANANDH got the alert which is sent from teller ANANDHTA
And select the transaction record from alert
And click on open item buttton in alert
And click on approve button in alert screen
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved

@TRS_152_01
Scenario: To update the dormant account DDL Value proceed on dormant account in user account
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_152_01
And search the user ID in user module
And select the user from suggestion
And check the show all trx flag in CSM Param
And update the dormant account DDL value in user update after approve screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_152_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And logout from the application
@TRS_152
Scenario: Checking Cash Withdrawal Transaction - CIF Non-Resident Alert flag
Given user 076 navigate to CSM Aplication and login with teller account
And get the test data for test case ID TRS_152
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
Then verify system should show the warning message for dormant account in transaction maintenance
And enter the debit debit serial number
Then verify system should show the validation for signature not found in transaction maintenance
And click on ok button in transaction maintenance
And enter the currency code
And enter the amount for debit from the account
And click on save button in transaction
And store the transaction number in transaction excel database
Then verify alert screen is open in transactio maintenannce
And enter the branch manager user ID in alert section
And click on the branch manager ID in alert suggestion grid
And click on sent button in alert section
@TRS_152_02
Scenario: Login the Branch manager for sending the alert
And get the test data for test case ID TRS_152_02
Given navigate to CSM application and login with valid credentials
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
Then verify branch manager ANANDH got the alert which is sent from teller ANANDHTA
And select the transaction record from alert
And click on open item buttton in alert
And click on approve button in alert screen
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
@TRS_153
Scenario: Checking Cash Withdrawal Transaction - Value Date changed Alert flag
Given user 076 navigate to CSM Aplication and login with teller account
And get the test data for test case ID TRS_153
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
Then verify system should show the warning message for dormant account in transaction maintenance
And enter the debit debit serial number
Then verify system should show the validation for signature not found in transaction maintenance
And click on ok button in transaction maintenance
And enter the currency code
And enter the amount for debit from the account
And change the value date to past date in transaction maintenance
And click on save button in transaction
And store the transaction number in transaction excel database
Then verify alert screen is open in transactio maintenannce
And enter the branch manager user ID in alert section
And click on the branch manager ID in alert suggestion grid
And click on sent button in alert section
@TRS_153_02
Scenario: Login the Branch manager for sending the alert
And get the test data for test case ID TRS_153_02
Given navigate to CSM application and login with valid credentials
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
Then verify branch manager ANANDH got the alert which is sent from teller ANANDHTA
And select the transaction record from alert
And click on open item buttton in alert
And click on approve button in alert screen
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
@TRS_154
Scenario: Checking Cash Withdrawal Transaction - Value Date changed Alert flag
Given user 076 navigate to CSM Aplication and login with teller account
And get the test data for test case ID TRS_154
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
Then verify system should show the non resident warning message
And enter the currency code
And enter the amount for debit from the account
And click on save button in transaction
And store the transaction number in transaction excel database
Then verify alert screen is open in transactio maintenannce
And enter the branch manager user ID in alert section
And click on the branch manager ID in alert suggestion grid
And click on sent button in alert section
@TRS_154_02
Scenario: Login the Branch manager for sending the alert
And get the test data for test case ID TRS_154_02
Given navigate to CSM application and login with valid credentials
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
Then verify branch manager ANANDH got the alert which is sent from teller ANANDHTA
And select the transaction record from alert
And click on open item buttton in alert
And click on approve button in alert screen
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
@TRS_155_01
Scenario: under csm Param need to set the limit for withdraw transaction
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And click on user module under system parameter
And click on update after approve screen under user module
And get the test data for test case ID TRS_155_01
And search the user ID in user module
And select the user from suggestion
And click on account type access option
And search for the account type which user created
And delete the account type details
And click on add button in account type access
And enter the account type for access
And enter the transaction type for withdraw in account type access
And enter the overdrawn for withdraw accout type access
And click on ok button in access screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And close the update after approve screen of user
And click on ok button
And click on approval module under user module
And get the test data for test case ID TRS_155_01
And search the user ID in user module
And select the user from suggestion
And click on approve button in user module
And click on approval confirmation ok button under user screen
And click on ok button after approval screen under user screen
And logout from the application

@TRS_155
Scenario: Checking Cash Withdrawal Transaction - Value Date changed Alert flag
Given user 076 navigate to CSM Aplication and login with teller account
And get the test data for test case ID TRS_155
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
And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for debit from the account
Then verify system shoudl show the validation for amound exceeed available balance in transaction maintenance
And click on save button in transaction
Then verify system shoudl show the validation for amound exceeed available balance in transaction maintenance
And store the transaction number in transaction excel database
Then verify alert screen is open in transactio maintenannce
And enter the branch manager user ID in alert section
And click on the branch manager ID in alert suggestion grid
And click on sent button in alert section
@TRS_155_02
Scenario: Login the Branch manager for sending the alert
And get the test data for test case ID TRS_155_02
Given navigate to CSM application and login with valid credentials
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
Then verify branch manager ANANDH got the alert which is sent from teller ANANDHTA
And select the transaction record from alert
And click on open item buttton in alert
And click on approve button in alert screen
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved

@TRS_156_01
Scenario: check the flag deduct from cash (In Transactionn Type)
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_156_01
And click on transaction type feature
And click on update after approve in transcation type
And search the transaction type in update after approve transaction type
And select the transaction record in update after approve screen
And check the charge deduct from cash under transaction type
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
And update the transaction type in transaction excel database to check the charge deduct from cash
@TRS_156
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Cash
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_156
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
And click on ok buton in staff member ok button
And enter the currency code  
And enter the amount for debit from the account
And enter the credit branch code
And enter the credit gl code
And enter the credit cif number
And enter the credit serial number
And click on ok buton in staff member ok button
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_156
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


@TRS_373_01
Scenario: Un check the Proceed on Modified account flag in account control records in CSM Param
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on accounts parameter
And user_076 click on account control records
And user_076 click on update after approve of account control records
And user_076 click on JV accounts details tab
And user_076 click onn account sectionn in account control record
And user_076 un check the proceed on modified account flag
And user_076 click on update after approve button in account control record
And user_076 click on ok button in update confirmation on account control records
And user_076 click on ok button in update successfull ok button
And user_076 click on approve feature in account control records
And user_076 click on approve buttoon in account control record
And user_076 click on ok button in approve confirmation ok button in account control record
And user_076 click on ok button in approve Successfull ok button in account control record
@TRS_375_01
Scenario: In transaction type setting the parameters check the forbit multiple CIF and set the mode of payment normal behaviour
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_375_01
And click on transaction type feature
And click on update after approve in transcation type
And search the transaction type in update after approve transaction type
And select the transaction record in update after approve screen
And check the main account is debit flag in account type screen
And check the forbit multiple CIF flag in transaction type
And select the mode of payment as normal behaviour in transaction type
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
And store the transaction type in transactions excelData base

@TRS_375_02
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx Intrabank Single Transfer Mode of Payment A/C
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_375_02
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
And click on ok buton in staff member ok button
And enter the currency code  
And enter the amount for debit from the account
And enter the credit branch code
And enter the credit gl code
And enter the credit cif number
And enter the credit serial number
And click on ok buton in staff member ok button
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_375_02
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
@TRS_375_03
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx Intrabank Single Transfer Mode of Payment A/C
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_375_03
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
And click on ok buton in staff member ok button
And enter the currency code  
And enter the amount for debit from the account
And enter the credit branch code
And enter the credit gl code
And enter the credit cif number
Then verify system should show the validation for multiple CIf in transactionn maintenance

@TRS_375_01
Scenario: In transaction type setting the parameters check the forbit multiple CIF and set the mode of payment normal behaviour
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_375_01
And click on transaction type feature
And click on update after approve in transcation type
And search the transaction type in update after approve transaction type
And select the transaction record in update after approve screen
And check the main account is debit flag in account type screen
And check the forbit multiple CIF flag in transaction type
And select the mode of payment as normal behaviour in transaction type
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
And store the transaction type in transactions excelData base

@TRS_375_02
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx Intrabank Single Transfer Mode of Payment A/C
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_375_02
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
And click on ok buton in staff member ok button
And enter the currency code  
And enter the amount for debit from the account
And enter the credit branch code
And enter the credit gl code
And enter the credit cif number
And enter the credit serial number
And click on ok buton in staff member ok button
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_375_02
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
@TRS_375_03
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx Intrabank Single Transfer Mode of Payment A/C
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_375_03
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
And click on ok buton in staff member ok button
And enter the currency code  
And enter the amount for debit from the account
And enter the credit branch code
And enter the credit gl code
And enter the credit cif number
Then verify system should show the validation for multiple CIf in transactionn maintenance

@TRS_376_01
Scenario: In transaction type setting the parameters check the forbit multiple CIF and set the mode of payment normal behaviour
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_376_01
And click on transaction type feature
And click on update after approve in transcation type
And search the transaction type in update after approve transaction type
And select the transaction record in update after approve screen
And check the main account is debit flag in account type screen
And check the forbit multiple CIF flag in transaction type
And select the mode of payment as normal behaviour in transaction type
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
And store the transaction type in transactions excelData base

@TRS_376_02
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx Intrabank Single Transfer Mode of Payment A/C
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_376_02
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And change the mode of payment to cash in transaction maintenance
#And enter the credit branch code in main credit transaction
#And enter the currency code in main credit transaction
#And enter the gl code in main credit transaction
#And enter the CIF number in main credit transaction
#And enter the serial number in main credit transaction
#And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for debit from the account
And enter the debit brach code in main credit transaction
And enter the debit gl code in main credit transaction 
And enter the debit CIF number in main credit transaction
And enter the debit serial number in main credit transaction
And click on ok buton in staff member ok button
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_376_02
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

@TRS_376_03
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx Intrabank Single Transfer Mode of Payment A/C
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_376_03
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And change the mode of payment to cash in transaction maintenance
#And enter the credit branch code in main credit transaction
#And enter the currency code in main credit transaction
#And enter the gl code in main credit transaction
#And enter the CIF number in main credit transaction
#And enter the serial number in main credit transaction
#And click on ok buton in staff member ok button
And enter the currency code
And enter the amount for debit from the account
And enter the debit brach code in main credit transaction
And enter the debit gl code in main credit transaction 
And enter the debit CIF number in main credit transaction
And enter the debit serial number in main credit transaction
And click on ok buton in staff member ok button
Then verify system should show the validation for multiple CIf in transactionn maintenance


@TRS_377_01
Scenario: In transaction type setting the parameters check the forbit multiple CIF and set the mode of payment normal behaviour
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_377_01
And click on transaction type feature
And click on update after approve in transcation type
And search the transaction type in update after approve transaction type
And search the type of transaction in transaction type search grid
And select the transaction record in update after approve screen
And check the main account is debit flag in account type screen
And check the forbit multiple CIF flag in transaction type
And select the mode of payment as normal behaviour in transaction type
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
And store the transaction type in transactions excelData base

@TRS_377_02
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - Intrabank - Multi Transfer - Mode of Payment A/C
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_377_02
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
And click on ok buton in staff member ok button
And enter the amount in first grid of account details
And click on add button in acccount details of transaction maintenance
And click on live search in second row of account details
And enter the second account branch code in account details
And search the second gl code in additional account details
And search the second cif number in additional account details
And search the second serial number in additional account details
And select the record for second additional account
And click on ok buton in staff member ok button
And enter the amount in second grid of account details
And click on ok button in additional account details
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_377_02
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And click on approve button
And click on ok button after approve the transaction record
And click on cancel button in debit confirmation
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved

@TRS_377_03
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - Intrabank - Multi Transfer - Mode of Payment A/C
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_377_03
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
Then verify system should show the validation for multiple CIf in transactionn maintenance


@TRS_520_01
Scenario: In transaction type setting the parameters check the hide transaction flag and un check the not be used transaction flag
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_520_01
And click on transaction type feature
And click on update after approve in transcation type
And search the transaction type in update after approve transaction type
And search the type of transaction in transaction type search grid
And select the transaction record in update after approve screen
And check the hide in transcation flag in transaction type screen
And uncheck the not to be used transaction flag in trasaction type screen
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
And store the transaction type in transactions excelData base
@TRS_520_02
Scenario: checking if the system is hiding the transaction type under transaction screen 
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_520_02
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transactio type which is hide in csm Param
Then Verify system should show the validation for hide transaction in transaction maintenance
@TRS_521_01
Scenario: In transaction type setting the parameters check the hide transaction flag and un check the not be used transaction flag
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_521_01
And click on transaction type feature
And click on update after approve in transcation type
And search the transaction type in update after approve transaction type
And search the type of transaction in transaction type search grid
And select the transaction record in update after approve screen
And uncheck the hide in transcation flag in transaction type screen
And check the not to be used transaction flag in trasaction type screen
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
And store the transaction type in transactions excelData base
@TRS_521_02
Scenario: checking if the system is hiding the transaction type under transaction screen 
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID TRS_521_02
And change the system date to given date
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transactio type which is hide in csm Param
Then verify system should show the validation for no access trabsaction type in transaction maintenance screen

@TRS_516_01
Scenario: In transaction type setting the parameters check the hide transaction flag and un check the not be used transaction flag
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID TRS_516_01
And click on transaction type feature
And click on update after approve in transcation type
And search the transaction type in update after approve transaction type
And search the type of transaction in transaction type search grid
And select the transaction record in update after approve screen
And check the automatic approve if user is with in limit flag
And uncheck the not to be used transaction flag in trasaction type screen
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
And store the transaction type in transactions excelData base


@TRS_516_02
Scenario: Checking Cash Deposit Transaction - Interbranch
And get the test data for test case ID TRS_516_02
Given navigate to CSM application and login with valid credentials
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
And click on save button in transaction 
And store the transaction number in transaction excel database
And get the test data for test case ID TRS_516_02
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved