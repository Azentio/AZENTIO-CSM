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
@CW_019
Scenario: Checking the waiver for SO suspend charges
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case CW_19
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
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the credit serial number in transaction
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the amount for deposite in transaction
And give the ending date in transaction of SO
And click on save button in transaction
And click on server response ok button if exist
And get the transaction number which is created now
And close the transaction maintenance tab
And get the test data for test case CW_19
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
And click on ok button after approve the transaction record
And close the transaction approve button
And click on to be stopped screen under transaction module
And search for the approved record in to be stopped search
And select the approved record in to be stopped screen
And close the memo alert in transaction screen
And give the to be stopped reason
And click on to Stop SO button
And close the to be stopped tab
And click on to stop so feature
And search for the transation which was to be stopped
And select the to be stopped transaction SO
And close the memo alert in transaction screen
And click on stop SO button
And update the transaction number in test case CW_020
Then verify system should through the validation for Charge waive for stopped record of SO
@CW_020
Scenario: Checking the waiver for SO reinstate charges
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on reactive standing order in transaction feature
And get the test data for test case CW_020
And search for the suspended record under reactive standing order
And select the suspended standing order in reactive standing order
And close the memo alert in transaction screen
And click on reactive SO in reactive standing order feature
And close the reactive SO feature
And click on approve reactive standing order feature
And search for reactivated SO in search view
And select the reactvated record for approval
And close the memo alert in transaction screen
And click on apply reactive SO button in approve reactive SO
Then verify system should show the validation for charge waiver for reactive SO
@CW_021
Scenario: Checking the waiver for SO amend charges
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case CW_21
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
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the credit serial number in transaction
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the amount for deposite in transaction
And give the ending date in transaction of SO
And click on save button in transaction
And click on server response ok button if exist
And get the transaction number which is created now
And close the transaction maintenance tab
And get the test data for test case CW_21
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
And click on ok button after approve the transaction record
And close the transaction approve tab
And click on amend standing order feature
And search for approved standing order in amend standing order
And select the approved standing order in amend standing order
And close the memo alert in transaction screen
And amend the amount in standing order record
And click on amend SO button in amend standing order
And click on ok button for updation in amend standng order
And close the amend staning order tab
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
Then verify system should show the validatio for charge waiver under approve for amend standing order
And click on ok button after approve the transaction record
@CW_022
Scenario: Checking the waiver for SO close charges
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case CW_22
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
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the credit serial number in transaction
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the amount for deposite in transaction
And give the ending date in transaction of SO
And click on save button in transaction
And click on server response ok button if exist
And get the transaction number which is created now
And close the transaction maintenance tab
And get the test data for test case CW_22
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
And click on ok button after approve the transaction record
And close the transaction approve tab
And click on to be closed standing order feature
And search for approved transaction in to be closed standing order
And select the transaction in to be closed standing order
And close the memo alert in transaction screen
And enter the reason for close the standing order
And click on to close SO button
And close the to be close SO label
And click on close SO feature
And search for To be closed SO Records in close SO
And select the to be closed SO in close SO
And close the memo alert in transaction screen
And click on close SO button
Then verify system should show the validation for charge waiver for clos standing order
@CW_023
Scenario: Checking on the waiver for Cancellation of a transaction charges
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
And get the test data for test case CW_23
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
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the credit serial number in transaction
And click on ok button of dormant account error in transaction screen
And close the memo alert in transaction screen
And enter the amount for deposite in transaction
And give the ending date in transaction of SO
And click on save button in transaction
And click on server response ok button if exist
And get the transaction number which is created now
And close the transaction maintenance tab
And get the test data for test case CW_23
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
And click on ok button after approve the transaction record
And close the transaction approve tab
And click on cancel feature under transaction
And search for approved record under cancel
And select the approved record in cancel feature
And select the cancel reason
And click on cancel button under cancel feature
Then verify system should show the validation for charge waiver in transaction cance
@CW_038
Scenario: Functional Testing - User Has no access to waive charges – Certificate– Approve
Given navigate to CSM application and login with valid credentials
And click on certificate feature
And click on maintenance under certifiate
And enter the certificate type in certificate feature
And enter the CIF number in certificate feature
And enter the number of bills in certificate feature
And enter the total number of bills in certificate feature
And select the active credit account
And select the active debit account
And click on charges button

@CW_040
Scenario: Functional Testing - User has access to waive charges – Passbook– Approve
Given navigate to CSM application and login with valid credentials
And click on passbook feature
And click on mainteance under passbook feature
And get the test data for test case CW_040
And enter the passbook code
And enter the passbook type
And enter the currency code in passbook
And enter the gl code in passbook
And enter the cif number in passbook
And click on ok button in dormant
And click on close in memo screen 
And enter the serial number in passbook
And click on ok button in dormant 
And click on ok button in signature
And click on close in memo screen
Then verify system should deduct the charges by clicking waive charges button
And click on save button in passbook feature
And close the passbooks screen
And click on pass book issue feature
And search for passbook code in passbook issue feature
And select the record from passbook issue suggestion
And click on issue button under passbook issue feature
And close the passbook issue feature
@CW_041
Scenario: Functional Testing - User has no access to waive charges – Passbook– Approve
Given navigate to CSM application and login with valid credentials
And click on passbook feature
And click on mainteance under passbook feature
And get the test data for test case CW_040
And enter the passbook code
And enter the passbook type
And enter the currency code in passbook
And enter the gl code in passbook
And enter the cif number in passbook
And click on ok button in dormant
And click on close in memo screen 
And enter the serial number in passbook
And click on ok button in dormant 
And click on ok button in signature
And click on close in memo screen
Then verify system should deduct the charges by clicking waive charges button
And click on save button in passbook feature
And close the passbooks screen
And click on pass book issue feature
And search for passbook code in passbook issue feature
And select the record from passbook issue suggestion
And click on issue button under passbook issue feature
And close the passbook issue feature

