Feature: To Test the charge waiver feature
@CW_001
Scenario: Checking on “Original charges amount” new field under Transaction level in CSM
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case CW_001
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the serial number for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the currency code
And click on charge button
Then verify original charge amount field should get shows with disable status
@CW_002
Scenario: Checking on the waiver for the chequebook product
Given navigate to CSM application and login with valid credentials
And click on cheque request module
And click on cheque book request maintenance screen
And get the test data for CW_002
And enter the number of cheque book in cheque book request
And enter the chque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
And click on charges in chque book request
And click on save button in cheque book request
Then validate system should show the validation for charges have waiveds
@CW_003
Scenario: Checking on the waiver when using a transaction type within the defined transaction types
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case CW_003
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the serial number for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the currency code
And click on charge button
Then verify original charge amount field should get shows with disable status
And enter the amount for deposite in transaction
Then verify system should show the validation for charge waiver in transaction screen
And click on save button in transaction 
And get the transaction number which is created now
And get the test data for test case CW_003
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And close the memo alert in transaction screen
And click on charge button
Then verify system should not deduct the charges for the transaction
@CW_004
Scenario: Checking on the waiver when using a transaction type not included in the defined transaction types
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case CW_04
And enter the transaction type code in transaction
And enter the debit branch code in tranaction
And enter the debit currency code in tranaction
And enter the debit GL code in transaction
And enter the debit CIF code in transaction
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the debit serial number in transaction
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the currency code
And enter the credit branch code in transaction
And enter the credit gl code in transaction
And enter the credit CIF number in transaction
And enter the credit serial number in transaction
And click on charge button
And enter the amount for deposite in transaction
Then verify system should not show the validation for charge waiver
And click on save button in transaction
And get the transaction number which is created now
And get the test data for test case CW_04
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And close the memo alert in transaction screen
And click on charge button
And check system should deduct the charges for the transaction
@CW_005
Scenario: Checking on the waiver when doing a transaction less than From date  
Given navigate to CSM application and login with valid credentials
And get the test data for test case CW_005
And change the system date to less waiver date which is configured
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the serial number for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the currency code
And click on charge button
Then verify system should not show the validation for charge waiver
And enter the amount for deposite in transaction
Then verify system should not show the validation for charge waiver
And click on save button in transaction 
And get the transaction number which is created now
And get the test data for test case CW_005
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And close the memo alert in transaction screen
And click on charge button
Then verify system should not deduct the charges for the transaction
@CW_006
Scenario: Checking on the waiver when doing a transaction greater than To date  
Given navigate to CSM application and login with valid credentials
And get the test data for test case CW_006
And change the system date to high waiver date which is configured
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the serial number for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the currency code
And click on charge button
Then verify system should not show the validation for charge waiver
And enter the amount for deposite in transaction
Then verify system should not show the validation for charge waiver
And click on save button in transaction 
And get the transaction number which is created now
And get the test data for test case CW_006
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And close the memo alert in transaction screen
And click on charge button
Then verify system should not deduct the charges for the transaction
@CW_007
Scenario: Checking on the waiver when doing a transaction in between 'From' and 'To' date
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case CW_007
And enter the transaction type code in transaction
And enter the branch code for cash deposite
And enter the currency code for cash deposite
And enter the gl code for cash deposite
And enter the CIF code for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the serial number for cash deposite
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the currency code
And click on charge button
Then verify original charge amount field should get shows with disable status
And enter the amount for deposite in transaction
Then verify system should show the validation for charge waiver in transaction screen
And click on save button in transaction 
And get the transaction number which is created now
And get the test data for test case CW_007
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
And click on ok button after approve the transaction record
And close the transaction tab
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the approved trsnaction number in transaction maintenenace screen
Then verify transaction status should show as approved
And open the approved transaction record
And close the memo alert in transaction screen
And click on charge button
Then verify system should not deduct the charges for the transaction