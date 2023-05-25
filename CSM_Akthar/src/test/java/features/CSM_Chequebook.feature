Feature: To check the functionalitites of chequebook request
@CHB_117
Scenario: Unchecking the flags Reason on Rejecting and Records rejection reason and  rejecting a chequebook under Approve Cancel screen
Given navigate to CSM application and login with valid credentials
Then Click the chequebook request
And Click the To Cancel under chequebook request
Then search and choose the existing data
And click the cancel reason to fill the reason
And Cancel that record by clicking the to cancel button
Then Select the record in the alert box 
And Approve the record by clicking approve button in the alert screen
Then Enter the teller User information 
And Click the submit button under the user information
Then Enter the reason under the teller account
And Reject and validate the record






@CHB_118
Scenario: Checking "Reason on Rejecting" flag upon rejecting a chequebook underr Approve Cancel screen for alert
Given navigate to CSM application and login with valid credentials
Then Click the chequebook request
And Click the To Cancel under chequebook request
Then search and choose the existing data
And click the cancel reason to fill the reason
And Cancel that record by clicking the to cancel button
Then Select the record in the alert box 
And Approve the record by clicking approve button in the alert screen
Then Enter the teller User information 
And Click the submit button under the user information
Then Enter the reason under the teller account
And Reject and validate the record


@CHB_149
Scenario: UnCheck the "Reason on Rejecting"and "Records rejection reason is mandatory" flag reject chequebook Destroy screen
Given navigate to CSM application and login with valid credentials
Then Click the chequebook request
And Click the Approve 
Then search and choose the existing data
And Select the Active existing data
Then Click the Approve button
And Approve the record by clicking approve button in the alert screen
Then Enter the teller User information 
And Click the submit button under the user information
Then Enter the reason under the teller account
And Reject and validate the record

@TSA_152

And user click the maintenance screen under chequebook request
And user click the number of chequebooks button
And user enter the value in number of chequebooks
And user click the cheque code 
And user enter the value in cheque code under chequebook request screen
And user click the chequebook request/maintenance icon
And user click the branch code 
And user enter the value in branch code
And user click the chequebook request/maintenance icon 
And user click the currency code
And user enter the value in currency code
And user click the chequebook request/maintenance icon
And user click the gl code
And user enter the value in gl code
And user click the chequebook request/maintenance icon
And user click the cif code 
And user enter the value in cif code
And user click the chequebook request/maintenance icon
And user click the serial number
And user enter the value in serial number
And user click the chequebook request/maintenance icon
And user click the save button under chequebook request
And User Click Approve Sub Menu
And User Search Cheque Book Code in Approve Screen
And User Select Cheque Book Code in Approve Screen
And User Click Approve button in Approve Screen
And User Click Ok button in Warning pop up Message in Approve Screen

#And user click the to be reversed chequeboo... 
#And user click the to be reversed chequebook screen
#And user click the checkbook code in to be reversed chequebook screen
#And user enter the value in chequebook code
#And user check on the reason field and fill the reason in to be reversed chequebook screen
#And user click the to be reversed button
#Then verify the alert send to the BM user and click the approve button
#And user click and enter the username in BM approval 
#And user click and enter the password in BM approval
#And user click the reverse chequebook screen
#And user click the chequebook code in reverse chequebook screen
#And user enter the value in chequebook code under reverse chequebook screen
#And user click the reject button under reverse chequebook screen
#
#has context menu


@CHB_150
Scenario: Checking if "Approve/Reject Destroy" screen the same as "Approve Destroy"or"Reject Destroy" screens
Given navigate to CSM application and login with valid credentials
Then Click the chequebook request
And   Click the Bulk Destroy 
Then Choose the Existing data from Bulk Destroy
And  Enter the ok in Remarks 
Then Click the To Destroy button 
And  Select the Approve Reject Bulk Destroy
And  Click the Retrive button
Then Same data will Appear in Approve Reject Bulk Destroy


@CHB_151
Scenario: Checking if "Bulk Destroy" screen same as "To be Destroyed" screen with the "Approved" chequebooks
Given navigate to CSM application and login with valid credentials
Then  Click the chequebook request
And   Click the Bulk Destroy 
And   click the Retrive buton
Then  click the Search button
And   Enter the value in search box
And   click the Find button
And   click the To be Destroy
And   enter the value in the code box  
Then  check the same Data will Appear in To be Destroy 
   

#@CHB_152
#Scenario: Checking if "Bulk Destroy" screen is the same as "To be Destroyed" screen with the "In branch" chequebooks
#Given navigate to CSM application and login with valid credentials
#Then  Click the chequebook request
#And   Click the Bulk Destroy 
#And   click the Retrive buton
#Then  click the Search button
#And   enter the value in search box
#And   click the Find button
#And   click the To be Destroy
#And   Enter the value in the code box  
#Then  check the same Data will Appear in To be Destroy 


   

























