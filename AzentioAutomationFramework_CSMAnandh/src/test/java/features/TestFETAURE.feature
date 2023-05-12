Feature: Test
@CHB_112_113_PreReq_01
Scenario: Create chequebook for to be destroyed screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_112_113_Prereq_01
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
@CHB_113_01
Scenario: to verify teller user can able to set the alert for to be destroy to BM user
Given navigate to CSM application and login with valid teller credentials
And get the test data for test case ID CHB_113_01
And click on cheque request module
And click on to be destroyed screen under chequebook request
And search the cheque code in to be destroyed screen
And select the record from to be destroyed suggestion
And click on to be destroy button
Then verify alert will open for teller account for to be destroy
Then verify reject reason remark field should not show for under to be destroy screen under teller account
And sent the to be destroy alert to user branch manager
@CHB_113_02
Scenario: to verify BM user can able to see the alert which was sent by teller for to be destroy
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_113_02
Then verify BM user can able to get Alert for chequebook to cancel record
Then verify teller user record should available in BM user
Then verify reject reason field should be editable under BM user
And enter reject button without entering the reject reason in BM user
Then verify system should show the validation for reject reason mandatoryy in BM user
And enter the rejecct reason in BM user alert
And click in reject button in BM user alert
Then verify record got rejected in BM user


@CHB_112_113_PreReq_01
Scenario: Create chequebook for to be destroyed screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_112_113_Prereq_01
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
@CHB_112_01
Scenario: to verify teller user can able to set the alert for to be destroy to BM user
Given navigate to CSM application and login with valid teller credentials
And get the test data for test case ID CHB_112_01
And click on cheque request module
And click on to be destroyed screen under chequebook request
And search the cheque code in to be destroyed screen
And select the record from to be destroyed suggestion
And click on to be destroy button
Then verify alert will open for teller account for to be destroy
Then verify reject reason remark field should not show for under to be destroy screen under teller account
And sent the to be destroy alert to user branch manager
@CHB_112_02
Scenario: to verify BM user can able to see the alert which was sent by teller for to be destroy
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_112_02
Then verify BM user can able to get Alert for chequebook to cancel record
Then verify teller user record should available in BM user
And check reject reason field should not be visible in BM user alert
And BM user can able to reject the record without entering reject reason


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
@CHB_119_1
Scenario: Check if the system is  validating the value of the "Reason on Rejecting" flag upon rejecting a chequebook underr Approve  screen
Given navigate to CSM application and login with valid teller credentials
And get the test data for test case id CHB_119_1
And click on to cancel feature under cheque book request
And search the submitted record under to cancel screen
And click on to cancel button
Then verify alert will open for the BM user to sent approval
Then verify reason remark field should not show
Then verify system should sent the alert to BM user for chequebook to cancel approval
@CHB_119_2
Scenario: Check if the system is  validating the value of the "Reason on Rejecting" flag upon rejecting a chequebook underr Approve  screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case id CHB_119_2
Then verify BM user can able to get Alert for chequebook to cancel record
Then verify teller user record should available in BM user
Then verify reject reason field should be editable under BM user
And enter reject button without entering the reject reason in BM user
Then verify system should show the validation for reject reason mandatoryy in BM user
And enter the rejecct reason in BM user alert
And click in reject button in BM user alert
Then verify record got rejected in BM user
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
@CHB_120_1
Scenario: Check if the system is  validating the value of the "Reason on Rejecting" flag upon rejecting a chequebook underr Approve  screen
Given navigate to CSM application and login with valid teller credentials
And get the test data for test case id CHB_120_1
And click on to cancel feature under cheque book request
And search the submitted record under to cancel screen
And click on to cancel button
Then verify alert will open for the BM user to sent approval
Then verify reason remark field should not show
Then verify system should sent the alert to BM user for chequebook to cancel approval
@CHB_120_2
Scenario: Check if the system is  validating the value of the "Reason on Rejecting" flag upon rejecting a chequebook underr Approve  screen
Given navigate to CSM application and login with valid credentials
And get the test data for test case ID CHB_120_2
Then verify BM user can able to get Alert for chequebook to cancel record
Then verify teller user record should available in BM user
And check reject reason field should not be visible in BM user alert
And BM user can able to reject the record without entering reject reason

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
Then verify BM user can able to get Alert for chequebook to cancel record
Then verify teller user record should available in BM user
And check reject reason field should not be visible in BM user alert
And BM user can able to reject the record without entering reject reason
