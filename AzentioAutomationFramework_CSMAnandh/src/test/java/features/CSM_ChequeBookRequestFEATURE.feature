Feature: To test the chequeBook Request feature
@CHB_081
Scenario: Checking if system is defaulting new sequence under From Number and To Number with Cancelled sequences if Reuse Cancelled/ Reversed/ Deleted Chq Nbr flag is unchecked
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_081
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the chque code in cheque book request
And get the cheque from number and store it in excel data base
And get the cheque to number and store it in excel data base
And enter the account branch code in cheque book request
And enter the acount currency code in cheque book request
And enter the gl code in cheque book request
And enter the CIF code in cheque book request
And enter the serial number in cheque book request
And click on charges in chque book request
And click on save button in cheque book request
And click on ok button in signature warning pop up
And close the cheuqebook request maintenance screen
And click on to cancel feature under cheuqe book request feture
And search for currency code in to cancel feature
And search for gl in to cancel feature
And search for CIF number in to cancel feature
And search for serial number in to cancel feature
And store the request number in excel database
And select the record from suggestion of cheque book to cancel
And click on to cancel button
And click on approve cancel feature
And search for request number under approve cancel feature
And select the record in approve cancel feature
And click on cancel button under approve cancel
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the chque code in cheque book request
Then verify system should generate new sequence in from number and to number

@CHB_119_120_121_Prereq_01
Scenario: To create the cheque book for approv screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_119_120_121_Prereq_01
And click on cheque request module
And click on cheque book request maintenance screen
And enter the number of cheque book in cheque book request
And enter the chque code in cheque book request
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
And enter the chque code in cheque book request
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
And enter the chque code in cheque book request
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
And enter the chque code in cheque book request
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
And enter the chque code in cheque book request
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
And enter the chque code in cheque book request
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
Scenario: Contraol record pre requisites
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
Scenario: Contraol record pre requisites unCheck the reject reason mandatory and check the reason on reject
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
Scenario: Contraol record pre requisites unCheck the reject reason mandatory and check the reason on reject
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