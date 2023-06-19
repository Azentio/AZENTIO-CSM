Feature: To Test the charge waiver feature
@CW_001
Scenario: Checking on “Original charges amount” new field under Transaction level in CSM
And get the test data for test case CW_001
Given navigate to CSM application and login with valid credentials
And change the system date within excemption date
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
And get the test data for test case CW_003
Given navigate to CSM application and login with valid credentials
And change the system date within excemption date
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
And get the test data for test case CW_04
Given navigate to CSM application and login with valid credentials
And click on Transaction module
And click on maintenance scree under transaction module
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
And check system should deduct the charges for the transaction
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
And check system should deduct the charges for the transaction
@CW_007
Scenario: Checking on the waiver when doing a transaction in between 'From' and 'To' date
And get the test data for test case CW_007
Given navigate to CSM application and login with valid credentials
And change the system date within excemption date
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
And get the test data for test case CW_19
Given navigate to CSM application and login with valid credentials
And change the system date within excemption date
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the debit branch code in tranaction
And enter the debit currency code in tranaction
And enter the debit GL code in transaction
And enter the debit CIF code in transaction
And enter the debit serial number in transaction
And click on ok buton in staff member ok button
And enter the currency code
And enter the credit branch code in transaction
And enter the credit gl code in transaction
And enter the credit CIF number in transaction
And enter the credit serial number in transaction
And click on ok buton in staff member ok button
And close the memo alert in transaction screen
And enter the amount for deposite in transaction
Then verify system should show the validation for charge waiver in transaction screen
And give the ending date in transaction of SO
And click on save button in transaction
And click on server response ok button if exist
Then verify system should show the validation for charge waiver in transaction screen
And get the transaction number which is created now
And close the transaction maintenance tab
And get the test data for test case CW_19
#And click on approve feature under transaction feature
#And search the transaction number under transaction approve feature
#And select the suggested record from the transaction approve
#And close the memo alert in transaction screen
#And click on approve button
#And click on ok button after approve the transaction record
#And close the transaction approve button
And click on to be stopped screen under transaction module
And search for the approved record in to be stopped search
And select the approved record in to be stopped screen
And close the memo alert in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
And give the to be stopped reason
And click on to Stop SO button
Then verify system should show the validation for charge waiver in transaction screen
And close the to be stopped tab
And click on to stop so feature
And search for the transation which was to be stopped
And select the to be stopped transaction SO
And close the memo alert in transaction screen
And click on stop SO button
And update the transaction number in test case CW_020

@CW_020
Scenario: Checking the waiver for SO reinstate charges
And get the test data for test case CW_020
Given navigate to CSM application and login with valid credentials
And change the system date within excemption date
And click on Transaction module
And click on reactive standing order in transaction feature
And search for the suspended record under reactive standing order
And select the suspended standing order in reactive standing order
And close the memo alert in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
And click on reactive SO in reactive standing order feature
Then verify system should show the validation for charge waiver in transaction screen
And close the reactive SO feature
And click on approve reactive standing order feature
And search for reactivated SO in search view
And select the reactvated record for approval
And close the memo alert in transaction screen
And click on apply reactive SO button in approve reactive SO
And close the reactivate SO screen under transactions
And click on to be stopped screen under transaction module
And search for the approved record in to be stopped search
And select the approved record in to be stopped screen
And close the memo alert in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
And give the to be stopped reason
And click on to Stop SO button
Then verify system should show the validation for charge waiver in transaction screen
And close the to be stopped tab
And click on to stop so feature
And search for the transation which was to be stopped
And select the to be stopped transaction SO
And close the memo alert in transaction screen
And click on stop SO button
@CW_021
Scenario: Checking the waiver for SO amend charges
And get the test data for test case CW_21
Given navigate to CSM application and login with valid credentials
And change the system date within excemption date
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the debit branch code in tranaction
And enter the debit currency code in tranaction
And enter the debit GL code in transaction
And enter the debit CIF code in transaction
And close the memo alert in transaction screen
And enter the debit serial number in transaction
And click on ok buton in staff member ok button
And close the memo alert in transaction screen
And enter the currency code
And enter the credit branch code in transaction
And enter the credit gl code in transaction
And enter the credit CIF number in transaction
And close the memo alert in transaction screen
And enter the credit serial number in transaction
And click on ok buton in staff member ok button
And close the memo alert in transaction screen
And enter the amount for deposite in transaction
Then verify system should show the validation for charge waiver in transaction screen
And give the ending date in transaction of SO
And click on save button in transaction
And click on server response ok button if exist
Then verify system should show the validation for charge waiver in transaction screen
And get the transaction number which is created now
And close the transaction maintenance tab
And get the test data for test case CW_21
#And click on approve feature under transaction feature
#And search the transaction number under transaction approve feature
#And select the suggested record from the transaction approve
#And close the memo alert in transaction screen
#And click on approve button
#And click on ok button after approve the transaction record
#And close the transaction approve tab
And click on amend standing order feature
And search for approved standing order in amend standing order
And select the approved standing order in amend standing order
And close the memo alert in transaction screen
And amend the amount in standing order record
Then verify system should show the validation for charge waiver in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
And click on amend SO button in amend standing order
And click on ok button for updation in amend standng order
Then verify system should show the validation for charge waiver in transaction screen
And close the amend staning order tab
And click on approve feature under transaction feature
And search the transaction number under transaction approve feature
And select the suggested record from the transaction approve
And close the memo alert in transaction screen
And click on approve button
Then verify system should show the validation for charge waiver in transaction screen
And get the transaction number which is created now
And close the transaction approve screen
And get the test data for test case CW_21
And click on to be stopped screen under transaction module
And search for the approved record in to be stopped search
And select the approved record in to be stopped screen
And close the memo alert in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
And give the to be stopped reason
And click on to Stop SO button
Then verify system should show the validation for charge waiver in transaction screen
And close the to be stopped tab
And click on to stop so feature
And search for the transation which was to be stopped
And select the to be stopped transaction SO
And close the memo alert in transaction screen
And click on stop SO button
@CW_022
Scenario: Checking the waiver for SO close charges
And get the test data for test case CW_22
Given navigate to CSM application and login with valid credentials
And change the system date within excemption date
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the debit branch code in tranaction
And enter the debit currency code in tranaction
And enter the debit GL code in transaction
And enter the debit CIF code in transaction
And close the memo alert in transaction screen
And enter the debit serial number in transaction
And click on ok buton in staff member ok button
And close the memo alert in transaction screen
And enter the currency code
And enter the credit branch code in transaction
And enter the credit gl code in transaction
And enter the credit CIF number in transaction
And close the memo alert in transaction screen
And enter the credit serial number in transaction
And click on ok buton in staff member ok button
And close the memo alert in transaction screen
And enter the amount for deposite in transaction
Then verify system should show the validation for charge waiver in transaction screen
And give the ending date in transaction of SO
And click on save button in transaction
And click on server response ok button if exist
Then verify system should show the validation for charge waiver in transaction screen
And get the transaction number which is created now
And close the transaction maintenance tab
And get the test data for test case CW_22
#And click on approve feature under transaction feature
#And search the transaction number under transaction approve feature
#And select the suggested record from the transaction approve
#And close the memo alert in transaction screen
#And click on approve button
#And click on ok button after approve the transaction record
#And close the transaction approve tab
And click on to be closed standing order feature
And search for approved transaction in to be closed standing order
And select the transaction in to be closed standing order
Then verify system should show the validation for charge waiver in transaction screen
Then verify system should show the validation for charge waiver in transaction screen
And close the memo alert in transaction screen
And enter the reason for close the standing order
And click on to close SO button
Then verify system should show the validation for charge waiver in transaction screen
And close the to be close SO label
And click on close SO feature
And search for To be closed SO Records in close SO
And select the to be closed SO in close SO
And close the memo alert in transaction screen
And click on close SO button
@CW_023
Scenario: Checking on the waiver for Cancellation of a transaction charges
And get the test data for test case CW_23
Given navigate to CSM application and login with valid credentials
And change the system date within excemption date
And click on Transaction module
And click on maintenance scree under transaction module
And enter the transaction type code in transaction
And enter the debit branch code in tranaction
And enter the debit currency code in tranaction
And enter the debit GL code in transaction
And enter the debit CIF code in transaction
And close the memo alert in transaction screen
And enter the debit serial number in transaction
And click on ok buton in staff member ok button
And close the memo alert in transaction screen
And enter the currency code
And enter the credit branch code in transaction
And enter the credit gl code in transaction
And enter the credit CIF number in transaction
And close the memo alert in transaction screen
And enter the credit serial number in transaction
And click on ok buton in staff member ok button
And close the memo alert in transaction screen
And enter the amount for deposite in transaction
Then verify system should show the validation for charge waiver in transaction screen
And give the ending date in transaction of SO
And click on save button in transaction
And click on server response ok button if exist
Then verify system should show the validation for charge waiver in transaction screen
And get the transaction number which is created now
And close the transaction maintenance tab
And get the test data for test case CW_23
#And click on approve feature under transaction feature
#And search the transaction number under transaction approve feature
#And select the suggested record from the transaction approve
#And close the memo alert in transaction screen
#And click on approve button
#And click on ok button after approve the transaction record
#And close the transaction approve tab
And click on cancel feature under transaction
And search for approved record under cancel
And select the approved record in cancel feature
And select the cancel reason
And click on cancel button under cancel feature
Then verify system should show the validation for charge waiver in transaction screen
And close the cancell feature under transactions
And click the approve cancel feature in transactions
And search the transaction number in approve cancel feature
And select the transaction record in approve cancel feature
And click on approve cancel button in approve cancel feature
Then verify system should show the validation for charge waiver in transaction screen
#Start

@CW_038_01
Scenario: To check the allow user to modify and clear flag and allow to modify
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CW_038_01
And user 076 click on charges featre
And user 076 click on maintenance of charges feature
And user 076 click on update after approve feature in maintenance of charges feature
And user 076 search for teh charge code in update after approve screen
And user 076 select the charge record in update after approve screen
And user 076 check the flag alow user to modify and clear falg under update after approve screen
And user 076 check the flag allow user to modify flah user update after approve screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And user 076 close the charges update after approve feature
And click on appprove feature under charges maintenance feature
And search for the charge code charge maintenance approval screen
And select the charge record in approval screen of charge maintenance
And click on approve button in charge code feature
And click on ok button in approve confirmation
And click on ok button in approval success
@CW_038_02
Scenario: To check the flag Allow user to clear chargeflag under transaction type
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CW_038_02
And click on transaction type feature
And click on update after approve in transcation type
And search the deposite transaction number in update after approve
And select the transaction record in update after approve screen
And check the flag allow user to modify and clear charge flag under transaction Type
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

@CW_038
Scenario: Functional Testing - User has access to waive charges – Certificate– Approve
Given navigate to CSM application and login with valid credentials
And click on certificate feature
And click on maintenance under certifiate
And get the test data for test case CW_038
And enter the certificate type in certificate feature
And enter the CIF number in certificate feature
And enter the number of bills in certificate feature
And enter the total number of bills in certificate feature
And select the active credit account
And select the active debit account
And click on save button in certificate feature
And close the certificate maintenance screen
@CW_038_03
Scenario: To verify user can able to approve and system should not allow user to waive the charges
Given navigate to CSM application and login with valid credentials
And click on certificate feature
And get the test data for test case CW_039_03
And click on approve feature under certificate
And search for CIF number to retrive the certificate record in approve stage
And select the suggested record from certificate approve screen
Then verify user can able to waive the charges for the certificate
And click on approve button in certificate approve stage

#ENd



@CW_039_01
Scenario: To un check the allow user to modify and clear flag and allow to modify
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CW_039_01
And user 076 click on charges featre
And user 076 click on maintenance of charges feature
And user 076 click on update after approve feature in maintenance of charges feature
And user 076 search for teh charge code in update after approve screen
And user 076 select the charge record in update after approve screen
And user 076 uncheck the flag alow user to modify and clear falg under update after approve screen
And user 076 uncheck the flag allow user to modify flah user update after approve screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And user 076 close the charges update after approve feature
And click on appprove feature under charges maintenance feature
And search for the charge code charge maintenance approval screen
And select the charge record in approval screen of charge maintenance
And click on approve button in charge code feature
And click on ok button in approve confirmation
And click on ok button in approval success
@CW_039_02
Scenario: To uncheck the flag Allow user to clear chargeflag under transaction type
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CW_039_02
And click on transaction type feature
And click on update after approve in transcation type
And search the deposite transaction number in update after approve
And select the transaction record in update after approve screen
And uncheck the flag allow user to modify and clear charge flag under transaction Type
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

@CW_039
Scenario: Functional Testing - User has access to waive charges – Certificate– Approve
Given navigate to CSM application and login with valid credentials
And click on certificate feature
And click on maintenance under certifiate
And get the test data for test case CW_039
And enter the certificate type in certificate feature
And enter the CIF number in certificate feature
And enter the number of bills in certificate feature
And enter the total number of bills in certificate feature
And select the active credit account
And select the active debit account
And click on save button in certificate feature
And close the certificate maintenance screen
@CW_039_03
Scenario: To verify user can able to approve and system should not allow user to waive the charges
Given navigate to CSM application and login with valid credentials
And click on certificate feature
And get the test data for test case CW_039_03
And click on approve feature under certificate
And search for CIF number to retrive the certificate record in approve stage
And select the suggested record from certificate approve screen
And click on charges section in certificate approve
Then verify user can not able to waive the charges for the certificate
And click on approve button in certificate approve stage


@CW_040_01
Scenario: To un check the allow user to modify and clear flag and allow to modify
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CW_040_01
And user 076 click on charges featre
And user 076 click on maintenance of charges feature
And user 076 click on update after approve feature in maintenance of charges feature
And user 076 search for teh charge code in update after approve screen
And user 076 select the charge record in update after approve screen
And user 076 check the flag alow user to modify and clear falg under update after approve screen
And user 076 check the flag allow user to modify flah user update after approve screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And user 076 close the charges update after approve feature
And click on appprove feature under charges maintenance feature
And search for the charge code charge maintenance approval screen
And select the charge record in approval screen of charge maintenance
And click on approve button in charge code feature
And click on ok button in approve confirmation
And click on ok button in approval success
@CW_040_02
Scenario: To uncheck the flag Allow user to clear chargeflag under transaction type
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CW_040_02
And click on transaction type feature
And click on update after approve in transcation type
And search the deposite transaction number in update after approve
And select the transaction record in update after approve screen
And check the flag allow user to modify and clear charge flag under transaction Type
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
And click on save button in passbook feature
And close the passbooks screen
And click on pass book issue feature
And search for passbook code in passbook issue feature
And select the record from passbook issue suggestion
Then verify system should not deduct the charges by clicking waive charges button
And click on issue button under passbook issue feature
And close the passbook issue feature
And click on close passbook feature
And search for the passbook record in close passbook feature
And select the passbook record in close passbook feature
And click on close button in passbook close
And click on ok button in confirmation pop up


@CW_041_01
Scenario: To un check the allow user to modify and clear flag and allow to modify
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CW_041_01
And user 076 click on charges featre
And user 076 click on maintenance of charges feature
And user 076 click on update after approve feature in maintenance of charges feature
And user 076 search for teh charge code in update after approve screen
And user 076 select the charge record in update after approve screen
And user 076 uncheck the flag alow user to modify and clear falg under update after approve screen
And user 076 uncheck the flag allow user to modify flah user update after approve screen
And click on update after approve button
And click on ok button in update confirmation
And click on ok button in saved successfully in user screen
And user 076 close the charges update after approve feature
And click on appprove feature under charges maintenance feature
And search for the charge code charge maintenance approval screen
And select the charge record in approval screen of charge maintenance
And click on approve button in charge code feature
And click on ok button in approve confirmation
And click on ok button in approval success
@CW_041_02
Scenario: To uncheck the flag Allow user to clear chargeflag under transaction type
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CW_041_02
And click on transaction type feature
And click on update after approve in transcation type
And search the deposite transaction number in update after approve
And select the transaction record in update after approve screen
And uncheck the flag allow user to modify and clear charge flag under transaction Type
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

@CW_041
Scenario: Functional Testing - User has no access to waive charges – Passbook– Approve
Given navigate to CSM application and login with valid credentials
And click on passbook feature
And click on mainteance under passbook feature
And get the test data for test case CW_041
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
And click on save button in passbook feature
And close the passbooks screen
And click on pass book issue feature
And search for passbook code in passbook issue feature
And select the record from passbook issue suggestion
Then verify system  dont allow user to clear the charges by clicking on waive charge button
And click on issue button under passbook issue feature without clear charge
And close the passbook issue feature
And click on close passbook feature
And search for the passbook record in close passbook feature
And select the passbook record in close passbook feature
And click on close button in passbook close
And click on ok button in confirmation pop up


