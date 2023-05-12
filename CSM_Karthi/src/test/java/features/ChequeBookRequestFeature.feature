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

