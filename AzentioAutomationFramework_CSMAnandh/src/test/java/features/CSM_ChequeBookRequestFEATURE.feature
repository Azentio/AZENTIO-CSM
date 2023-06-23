Feature: To test the chequeBook Request feature

@CHB_001_01
Scenario: To verify user can able to un check the Chequebook Advanced Process flag
Given navigate to CSM param application and login with valid credentials
And click on parametters feature in csm Param
And click on system parameters feature
And click on control records sub feature
And click on update after approve in control records
And un check the chequebook advance process in control record
And click on update after approve screen under control records
And click on ok button in save confirmation of control records
And click on ok button for update confirmation in control records
And click on approve feature under control records
And approve the control records feature
And click on ok in approve confirmation in control records
And click on ok button in approve successful pop up in control records
@CHB_001
Scenario: checking if the user is able to create a chequebook - short process (Un chekcing the flag Chequebook Advanced Process)
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_001
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
Then verify record got saved in chequebook maintenance search grid
And store the cheque book reference number in excel data base for test case ID CHB_003
@CHB_003
Scenario: checking if the user is able to create a chequebook - short process (Un chekcing the flag Chequebook Advanced Process)
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_003
And click on cheque request module
And click on approve feature in chequebook feature
And search the cheque request number in approval screen
Then verify cheque record status should be active in approval screen
And select record in cheque approval screen
And click on approve button in chequebook feature
And close the cheque book approval screen
And click on apply to submit feature in chequebook feature
And search the chequebook request number
Then verify chequebook record status should be approved
And select the cheque book record in apply to submit feature
And click on apply to submit button
And click on ok button in signature warning pop up
And close the apply to submit seature
And click on submit feature in chequebook feature
And search the cehquebook request reference number in submit feature
Then verify record status should be applly to submit
And select the cheque book record in feature
And select the record in submit feature
And click on submit button in submit feature
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the submit feature in chequebook
And click on cheque book request maintenance screen
And click onn search button in cheque book request maintenance
And search the cheque book request number in maintenance screen
Then verify chequebook record status should be n submitted status

@CHB_055_01
Scenario: To check the allow auto approve flag and uncheck Allow Auto Submit and Auto submit upon Approval in chequebook maintenance
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_055_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And check the allow auto approve flag in chequebook
And uncheck the allow auto submit flag in chequebook
And uncheck the allow auto submit upon aproval in chequebook
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
Then verify allow auto approve flag should checked
Then verify allow auto submit and allow auto submit upon approval flag
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_055
@CHB_055
Scenario: checking if the user is able to create a chequebook - short process (Un chekcing the flag Chequebook Advanced Process)
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_055
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
Then verify chequebook record status should be approved
And update the test data for test case ID CHB_055
And close the chequebook request maintenance screen
And get the test data for test case ID CHB_055
And click on apply to submit feature in chequebook feature
And search the chequebook request number
Then verify chequebook record status should be approved
And select the cheque book record in apply to submit feature
And click on apply to submit button
And click on ok button in signature warning pop up
And close the apply to submit seature
And click on submit feature in chequebook feature
And search the cehquebook request reference number in submit feature
Then verify record status should be applly to submit
And select the cheque book record in feature
And select the record in submit feature
And click on submit button in submit feature
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the submit feature in chequebook
And click on cheque book request maintenance screen
And click onn search button in cheque book request maintenance
And search the cheque book request number in maintenance screen
Then verify chequebook record status should be n submitted status
@CHB_057_01
Scenario: To check the allow auto approve flag and uncheck Allow Auto Submit and Auto submit upon Approval in chequebook maintenance
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_057_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the allow auto approve flag in chequebook
And uncheck the allow auto submit flag in chequebook
And check the allow auto submit upon aproval in chequebook
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_057
@CHB_057
Scenario: checking if the user is able to create a chequebook - short process (Un chekcing the flag Chequebook Advanced Process)
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_057
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
And update the test data for test case ID CHB_057
And close the chequebook request maintenance screen
And get the test data for test case ID CHB_057
And click on approve feature in chequebook feature
And search the cheque request number in approval screen
Then verify cheque record status should be active in approval screen
And select record in cheque approval screen
And click on approve button in chequebook feature
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the cheque book approval screen
And click on cheque book request maintenance screen
And click onn search button in cheque book request maintenance
And search the cheque book request number in maintenance screen
Then verify chequebook record status should be n submitted status
@CHB_058_01
Scenario: To check the allow auto approve flag and uncheck Allow Auto Submit and Auto submit upon Approval in chequebook maintenance
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_058_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the allow auto approve flag in chequebook
And check the allow auto submit flag in chequebook
And check the allow auto submit upon aproval in chequebook
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_058
@CHB_058
Scenario: checking if the user is able to create a chequebook - short process (Un chekcing the flag Chequebook Advanced Process)
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_058
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
And update the test data for test case ID CHB_058
And close the chequebook request maintenance screen
And get the test data for test case ID CHB_058
And click on approve feature in chequebook feature
And search the cheque request number in approval screen
Then verify cheque record status should be active in approval screen
And select record in cheque approval screen
And click on approve button in chequebook feature
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the cheque book approval screen
And click on cheque book request maintenance screen
And click onn search button in cheque book request maintenance
And search the cheque book request number in maintenance screen
Then verify chequebook record status should be n submitted status
@CHB_059_01
Scenario: To check the allow auto approve flag and uncheck Allow Auto Submit and Auto submit upon Approval in chequebook maintenance
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_059_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the allow auto approve flag in chequebook
And check the allow auto submit flag in chequebook
And uncheck the allow auto submit upon aproval in chequebook
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_059
@CHB_059
Scenario: checking if the user is able to create a chequebook - short process (Un chekcing the flag Chequebook Advanced Process)
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_059
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
And update the test data for test case ID CHB_059
And close the chequebook request maintenance screen
And get the test data for test case ID CHB_059
And click on approve feature in chequebook feature
And search the cheque request number in approval screen
Then verify cheque record status should be active in approval screen
And select record in cheque approval screen
And click on approve button in chequebook feature
And close the cheque book approval screen
And click on apply to submit feature in chequebook feature
And search the chequebook request number
Then verify chequebook record status should be approved
And select the cheque book record in apply to submit feature
And click on apply to submit button
And click on ok button in signature warning pop up
And close the apply to submit seature
#And click on submit feature in chequebook feature
#And search the cehquebook request reference number in submit feature
#Then verify record status should be applly to submit
#And select the cheque book record in feature
#And select the record in submit feature
#And click on submit button in submit feature
#And click on ok button in suspense account waring pop up
#And click on ok button in signature warning pop up
#And close the submit feature in chequebook
And click on cheque book request maintenance screen
And click onn search button in cheque book request maintenance
And search the cheque book request number in maintenance screen
Then verify chequebook record status should be n submitted status
@CHB_060_01
Scenario: To un check the allow auto approve flag and uncheck Allow Auto Submit and Auto submit upon Approval in chequebook maintenance
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_060_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the allow auto approve flag in chequebook
And uncheck the allow auto submit flag in chequebook
And uncheck the allow auto submit upon aproval in chequebook
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_060
@CHB_060
Scenario: Checking for Currenct System Behavior/ Allow Auto Approve unchecked/ Allow Auto Submit unchecked/ Auto Submit upon Approval unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_060
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
And update the test data for test case ID CHB_060
And close the chequebook request maintenance screen
And get the test data for test case ID CHB_060
And click on approve feature in chequebook feature
And search the cheque request number in approval screen
Then verify cheque record status should be active in approval screen
And select record in cheque approval screen
And click on approve button in chequebook feature
And close the cheque book approval screen
And click on apply to submit feature in chequebook feature
And search the chequebook request number
Then verify chequebook record status should be approved
And select the cheque book record in apply to submit feature
And click on apply to submit button
And click on ok button in signature warning pop up
And close the apply to submit seature
And click on submit feature in chequebook feature
And search the cehquebook request reference number in submit feature
Then verify record status should be applly to submit
And select the cheque book record in feature
And select the record in submit feature
And click on submit button in submit feature
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the submit feature in chequebook
And click on cheque book request maintenance screen
And click onn search button in cheque book request maintenance
And search the cheque book request number in maintenance screen
Then verify chequebook record status should be n submitted status
@CHB_062_01
Scenario: To un check the allow to amend from numbe flag in chequebook
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_062_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the allow to amend from number flag in chequebook
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_062
@CHB_062
Scenario: Checking for Currenct System Behavior/ Allow Auto Approve unchecked/ Allow Auto Submit unchecked/ Auto Submit upon Approval unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_062
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
Then verify cehquebook from number field should be non editabe and read only mode
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
Then verify record got saved in chequebook maintenance search grid
@CHB_063_01
Scenario: To un check the allow to amend from numbe flag in chequebook
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_063_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the diable cheque number generation flag
And check the allow to amend from number flag in chequebook
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_063
@CHB_063
Scenario: Checking for Currenct System Behavior/ Allow Auto Approve unchecked/ Allow Auto Submit unchecked/ Auto Submit upon Approval unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_063
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
Then verify cehquebook from number field should be editable
And enter the from number in cheque from number
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
Then verify record got saved in chequebook maintenance search grid

@CHB_064_01
Scenario: To un check the allow to amend from numbe flag in chequebook
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_064_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the Cheque paper number amendable on request flag
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_064
@CHB_064
Scenario: Checking for Currenct System Behavior/ Allow Auto Approve unchecked/ Allow Auto Submit unchecked/ Auto Submit upon Approval unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_064
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
Then verify number of paper input box should be not editable and read only
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
Then verify record got saved in chequebook maintenance search grid


@CHB_065_01
Scenario: To un check the allow to amend from numbe flag in chequebook
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_065_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And check the cheque paper number amendable on request flag in chequebook 
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_065
@CHB_065
Scenario: Checking for Currenct System Behavior/ Allow Auto Approve unchecked/ Allow Auto Submit unchecked/ Auto Submit upon Approval unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_065
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
Then verify number of papers field should be editable and amendable in chequebook request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
Then verify record got saved in chequebook maintenance search grid
@CHB_066_01
Scenario: To un check the allow to amend from numbe flag in chequebook
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_066_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the diable cheque number generation flag 
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_066
@CHB_066
Scenario: Checking for Currenct System Behavior/ Allow Auto Approve unchecked/ Allow Auto Submit unchecked/ Auto Submit upon Approval unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_066
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
Then verify cheque from number and to number field should be automaticaled field by the system
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
Then verify record got saved in chequebook maintenance search grid

@CHB_067_01
Scenario: To un check the allow to amend from numbe flag in chequebook
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_067_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And check the diable cheque number generation flag
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_067
@CHB_067
Scenario: Checking for Currenct System Behavior/ Allow Auto Approve unchecked/ Allow Auto Submit unchecked/ Auto Submit upon Approval unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_067
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
Then verify cheuqe from number and to number field should be diabled and empty field
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
Then verify record got saved in chequebook maintenance search grid


@CHB_074_01
Scenario: To un check the allow to amend from numbe flag in chequebook
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_074_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the diable cheque number generation flag
And check the Reuse Cancelled Reversed Deleted Chq Nbr flag in chequebook screen
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_074

@CHB_074
Scenario: Checking if system is defaulting new sequence under From Number and To Number with Cancelled sequences if Reuse Cancelled/ Reversed/ Deleted Chq Nbr flag is unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_074
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And get the cheque from number and store it in excel data base
And get the cheque to number and store it in excel data base
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
And update the test data for test case ID CHB_074
And close the chequebook request maintenance screen
And get the test data for test case ID CHB_074
And click on approve feature in chequebook feature
And search the cheque request number in approval screen
Then verify cheque record status should be active in approval screen
And select record in cheque approval screen
And click on approve button in chequebook feature
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the cheque book approval screen
And click on to cancel feature under cheuqe book request feture
And search the chequebook request number in to cancel screen
And select the chequebook record in to cancel record
And click on to cancel button
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the to cancel screen in chequebook request
And click on approve cancel feature
And search for request number under approve cancel feature
And select the record in approve cancel feature
And click on cancel button under approve cancel
And click on ok button in signature warning pop up
And close the cheuqebook approve cancel screeen in chequebook request
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
Then verify system should generate same sequence in from number and to number

@CHB_075_01
Scenario: control record pre requisites
Given navigate to CSM param application and login with valid credentials
And click on parametters feature in csm Param
And click on system parameters feature
And click on control records sub feature
And get the test data for test case ID CHB_075_01
And click on update after approve in control records
And select the cheque based on dropdown to branch
And click on update after approve screen under control records
And click on ok button in save confirmation of control records
And click on ok button for update confirmation in control records
And click on approve feature under control records
And approve the control records feature
And click on ok in approve confirmation in control records
And click on ok button in approve successful pop up in control records
@CHB_075
Scenario: Checking if system is defaulting new sequence under From Number and To Number with Cancelled sequences if Reuse Cancelled/ Reversed/ Deleted Chq Nbr flag is unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_075
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And get the cheque from number and store it in excel data base
And get the cheque to number and store it in excel data base
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
And update the test data for test case ID CHB_075
And close the chequebook request maintenance screen
And get the test data for test case ID CHB_075
And click on cheque book request maintenance screen
And click onn search button in cheque book request maintenance
And search the chequebook request number in mcehquebook request maintenance screeen
And select the record in cheuqebook maintenance screen
And click on delete button in chequebook maintenance screen
And click on ok button in delete confirmationn button
And close the chequebook request maintenance screen
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
Then verify system should generate same sequence in from number and to number
@CHB_081_01
Scenario: To un check the allow to amend from numbe flag in chequebook
Given navigate to CSM param application and login with valid credentials
And click on parameter module
And click on system parameter
And get the test data for test case ID CHB_081_01
And click on cheques feature in CSM Param
And click on chequebook feature in cheques feature
And click on update after approve under chequebook
And search for the chequebook code in cheque update after approve
And select the chequebook record in cheque update after approve
And uncheck the diable cheque number generation flag
And uncheck the Reuse Cancelled Reversed Deleted Chq Nbr flag in chequebook screen
And click on account type currency access button
And search for the record which is already there else update the account type and currency code
And click on update after approve in chequebook feature
And click on ok button in save confirmation popup
And click on ok button in update success popup
And close the chequebook update after approve screen
And click on approve in chequebook feature
And search the chequecode in approve screen of chequebook
And select the record in apporve of chequebook feature
And click on approve button in chequebook feature of cheque
And click on ok button in approve confirmation
And click on ok button in approval success
And update the test data for the test case ID CHB_081 and CHB_082

@CHB_081_02
Scenario: control record pre requisites
Given navigate to CSM param application and login with valid credentials
And click on parametters feature in csm Param
And click on system parameters feature
And click on control records sub feature
And get the test data for test case ID CHB_081_02
And click on update after approve in control records
And select the cheque based on dropdown to account
And click on update after approve screen under control records
And click on ok button in save confirmation of control records
And click on ok button for update confirmation in control records
And click on approve feature under control records
And approve the control records feature
And click on ok in approve confirmation in control records
And click on ok button in approve successful pop up in control records

@CHB_081
Scenario: Checking if system is defaulting new sequence under From Number and To Number with Cancelled sequences if Reuse Cancelled/ Reversed/ Deleted Chq Nbr flag is unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_081
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And get the cheque from number and store it in excel data base
And get the cheque to number and store it in excel data base
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
And update the test data for test case ID CHB_081
And close the chequebook request maintenance screen
And get the test data for test case ID CHB_081
And click on approve feature in chequebook feature
And search the cheque request number in approval screen
Then verify cheque record status should be active in approval screen
And select record in cheque approval screen
And click on approve button in chequebook feature
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the cheque book approval screen
And click on to cancel feature under cheuqe book request feture
And search the chequebook request number in to cancel screen
And select the chequebook record in to cancel record
And click on to cancel button
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the to cancel screen in chequebook request
And click on approve cancel feature
And search for request number under approve cancel feature
And select the record in approve cancel feature
And click on cancel button under approve cancel
And click on ok button in signature warning pop up
And close the cheuqebook approve cancel screeen in chequebook request
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
Then verify system should generate new sequence in from number and to number

@CHB_082
Scenario: Checking if system is defaulting new sequence under From Number and To Number with Cancelled sequences if Reuse Cancelled/ Reversed/ Deleted Chq Nbr flag is unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_082
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
#And click on charges in cheque book request
And get the cheque from number and store it in excel data base
And get the cheque to number and store it in excel data base
And click on save button in cheque book request
And click on ok button in signature warning pop up
And click onn search button in cheque book request maintenance
And search the cheque code in cheque maintenance search grid
And search the branch code in cheque maintenance search grid
And search the currency code in cheque maintenance search grid
And search the gl code in cheque maintenance search grid
And search the CIF Number in cheque maintenance search grid
And search the serial number in cheque maintenace search grid
And update the test data for test case ID CHB_082
And close the chequebook request maintenance screen
And get the test data for test case ID CHB_082
And click on approve feature in chequebook feature
And search the cheque request number in approval screen
Then verify cheque record status should be active in approval screen
And select record in cheque approval screen
And click on approve button in chequebook feature
And click on ok button in suspense account waring pop up
And click on ok button in signature warning pop up
And close the cheque book approval screen
And click on to reverse chequebook feature
And search for the chequebook request number in request number in to be reverse screen
And select the record in to be reverse screen
And click on to be reverse button in to be reverse screen
And click on ok button in to be reverse confirmation
And close the to be reverse chequebook screen
And click on reverse chequebook screen
And search for the request nbumber of chequebook in reverse chequebook screen
And select the record in reverse cheque book record
And click on reverse button in reverse cehquebook feature
And click on ok button in reverse confirmation pop up
And close the reverse chequebook feature screen 
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
Then verify system should generate new sequence in from number and to number

@CHB_119_120_121_Prereq_01
Scenario: To create the cheque book for approv screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_119_120_121_Prereq_01
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And enter the serial number in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And click on save button in cheque book request
And click on ok button in signature warning pop up
And close the chequebook request label
And click on approve feature under chequebook request
And select the record under approval feature
And close the memo alertpop up
And click on approve button in cheque book request approval
And close the approve screen of chequebook request
And click on apply to submit screen under chequebook request screen
And search for request number under apply to submit screen
And select the record under apply to submit screen
And close the memo alertpop up
And click on apply to submit button under apply to submit screen
And close the apply to submit label
And click on submit feature under chequebook request
And search the request number under submit screen
And select the record in submit screen of chequebook request
And close the memo alertpop up
And click on submit button in submit screen
And close the submit screen in chequebook request
@CHB_121_1
Scenario: Check if the system is  validating the value of the "Reason on Rejecting" flag upon rejecting a chequebook underr Approve  screen
Given navigate to CSM application and login with valid teller credentials
And get the test data for test case id CHB_121_1
And click on to cancel feature under cheque book request
And search the submitted record under to cancel screen
And click on to cancel button
Then verify alert will open for the BM user to sent approval
Then verify reason remark field should not show
Then verify system should sent the alert to BM user for chequebook to cancel approval
@CHB_121_2
Scenario: Check if the system is  validating the value of the "Reason on Rejecting" flag upon rejecting a chequebook underr Approve  screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_121_2
@CHB_119_120_121_Prereq_02
Scenario: To create the cheque book for approv screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_119_120_121_Prereq_02
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And enter the serial number in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And click on save button in cheque book request
And click on ok button in signature warning pop up
And close the chequebook request label
And click on approve feature under chequebook request
And select the record under approval feature
And close the memo alertpop up
And click on approve button in cheque book request approval
And close the approve screen of chequebook request
And click on apply to submit screen under chequebook request screen
And search for request number under apply to submit screen
And select the record under apply to submit screen
And close the memo alertpop up
And click on apply to submit button under apply to submit screen
And close the apply to submit label
And click on submit feature under chequebook request
And search the request number under submit screen
And select the record in submit screen of chequebook request
And close the memo alertpop up
And click on submit button in submit screen
And close the submit screen in chequebook request
@CHB_119_120_121_Prereq_03
Scenario: To create the cheque book for approv screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_119_120_121_Prereq_03
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And enter the serial number in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And click on save button in cheque book request
And click on ok button in signature warning pop up
And close the chequebook request label
And click on approve feature under chequebook request
And select the record under approval feature
And close the memo alertpop up
And click on approve button in cheque book request approval
And close the approve screen of chequebook request
And click on apply to submit screen under chequebook request screen
And search for request number under apply to submit screen
And select the record under apply to submit screen
And close the memo alertpop up
And click on apply to submit button under apply to submit screen
And close the apply to submit label
And click on submit feature under chequebook request
And search the request number under submit screen
And select the record in submit screen of chequebook request
And close the memo alertpop up
And click on submit button in submit screen
And close the submit screen in chequebook request

@CHB_123_124_Prereq_01
Scenario: To create the cheque book for approv screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_123_124_Prereq_01
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And enter the serial number in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And click on save button in cheque book request
And click on ok button in signature warning pop up
And close the chequebook request label
And click on approve feature under chequebook request
And select the record under approval feature
And click on approve button in cheque book request approval
And close the approve screen of chequebook request
And click on apply to submit screen under chequebook request screen
And search for request number under apply to submit screen
And select the record under apply to submit screen
And click on apply to submit button under apply to submit screen
And close the apply to submit label
And click on submit feature under chequebook request
And search the request number under submit screen
And select the record in submit screen of chequebook request
And click on submit button in submit screen
And close the submit screen in chequebook request


@CHB_123_124_Prereq_02
Scenario: To create the cheque book for approv screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_123_124_Prereq_01
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And enter the serial number in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And click on save button in cheque book request
And click on ok button in signature warning pop up
And close the chequebook request label
And click on approve feature under chequebook request
And select the record under approval feature
And click on approve button in cheque book request approval
And close the approve screen of chequebook request
And click on apply to submit screen under chequebook request screen
And search for request number under apply to submit screen
And select the record under apply to submit screen
And click on apply to submit button under apply to submit screen
And close the apply to submit label
And click on submit feature under chequebook request
And search the request number under submit screen
And select the record in submit screen of chequebook request
And click on submit button in submit screen
And close the submit screen in chequebook request

@CHB_123_124_Prereq_02
Scenario: To create the cheque book for approv screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_123_124_Prereq_02
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the cheque code in cheque book request
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And enter the serial number in cheque book request
And close the dormant acount pop up
And close the memo alertpop up
And click on save button in cheque book request
And click on ok button in signature warning pop up

@ChequeBookPrerequisites_01
Scenario: control record pre requisites
Given navigate to CSM param application and login with valid credentials
And click on parametters feature in csm Param
And click on system parameters feature
And click on control records sub feature
And click on update after approve in control records
And check the reason on rejecting label in control records
And click on other information tab in control records
And click on record rejection reason in mandatory falg in control records
And click on update after approve screen under control records
And click on ok button in save confirmation of control records
And click on ok button for update confirmation in control records
And click on approve feature under control records
And approve the control records feature
And click on ok in approve confirmation in control records
And click on ok button in approve successful pop up in control records


@CHB_122
Scenario: Check if the system is  validating the value of the "Reason on Rejecting" flag upon rejecting a chequebook underr Approve  screen
Given navigate to CSM application and login with valid credentials
And click on cheque request module
And click on approve feature uder cheque book request
And select one active record from the list in approve screen
And click on reject button in cheque book approve screen
Then verify system should show the validation for reject reason
And enter the reject reason in approve screen
And click on reject button in cheque book approve screen
And verify server got loaded in approve screen
And close the approve screen in cheque book request
And click on cheque book request maintenance screen
And click on search button in chequebook request maintenence
And search the request number in cheque book maintenance search
Then verify system is showing the right status of the cheque book
@ChequeBookPrerequisites_02
Scenario: control record pre requisites unCheck the reject reason mandatory and check the reason on reject
Given navigate to CSM param application and login with valid credentials
And click on parametters feature in csm Param
And click on system parameters feature
And click on control records sub feature
And click on update after approve in control records
And check the reason on rejecting label in control records
And click on other information tab in control records
And uncheck the reject reason is mandatory field in conntrol records
And click on update after approve screen under control records
And click on ok button in save confirmation of control records
And click on ok button for update confirmation in control records
And click on approve feature under control records
And approve the control records feature
And click on ok in approve confirmation in control records
And click on ok button in approve successful pop up in control records
@CHB_123
Scenario: Check if the system is  validating the value of the Reason on Rejecting flag upon unchecking the Records rejection reason is mandatory flag and  rejecting a chequebook underr Approve Cancel screen
Given navigate to CSM application and login with valid credentials
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on cheque request module
And click on approve feature uder cheque book request
And get the test data for test case ID CHB_123
And select one active record from the list in approve screen
And close the memo Alert in cheque book approval screen
And click on reject button in cheque book approve screen
Then verify system should show the validation for reject reason
And enter the reject reason in approve screen
And click on reject button in cheque book approve screen
And verify server got loaded in approve screen
And close the approve screen in cheque book request
And click on cheque book request maintenance screen
And get the test data for test case ID CHB_123
And click on search button in chequebook request maintenence
And search the request number in cheque book maintenance search
Then verify system is showing the right status of the cheque book
@ChequeBookPrerequisites_03
Scenario: control record pre requisites unCheck the reject reason mandatory and check the reason on reject
Given navigate to CSM param application and login with valid credentials
And click on parametters feature in csm Param
And click on system parameters feature
And click on control records sub feature
And click on update after approve in control records
And uncheck the reason on rejecting label in control records
And click on other information tab in control records
And click on record rejection reason in mandatory falg in control records
And click on update after approve screen under control records
And click on ok button in save confirmation of control records
And click on ok button for update confirmation in control records
And click on approve feature under control records
And approve the control records feature
And click on ok in approve confirmation in control records
And click on ok button in approve successful pop up in control records
@CHB_124
Scenario: Check if the system is  validating the value of the Reason on Rejecting flag upon unchecking the Records rejection reason is mandatory flag and  rejecting a chequebook underr Approve Cancel screen
Given navigate to CSM application and login with valid credentials
And click on tech option
And click on clear cache option
Then verify system shows success pop up for clearing the cache
And click on cheque request module
And click on approve feature uder cheque book request
And get the test data for test case ID CHB_124
And select one active record from the list in approve screen
And close the memo Alert in cheque book approval screen
And click on reject button in cheque book approve screen
Then verify system should not show the reason remark field
Then verify system should not show the validation to user for fill the reason
And verify server got loaded in approve screen
And close the approve screen in cheque book request
And click on cheque book request maintenance screen
And get the test data for test case ID CHB_124
And click on search button in chequebook request maintenence
And search the request number in cheque book maintenance search
Then verify system is showing the right status of the cheque book