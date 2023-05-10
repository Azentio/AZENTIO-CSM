Feature: To verify the functionality of chequebook under receive from provider
@CHB_012
Scenario: checking if the created chequebook is reflected under send to provider screen
Given user login as csm application
And user click the chequebook request screen
And user click the send to/receive from provider button
And user click the send to provider
And user search chequebook code in send to provider screen
And user click the check box under send to provider
Then user click the proceed button under send to provider
And user click the maintenance screen under chequebook request
And user click search icon under maintenance
And user enter the cheque code under maintenance screen
Then user validate the send to provider status record present in the maintenance screen under chequebook request
@CHB_013
Scenario: checking if the created chequebook is reflected under receive from provider screen 
Given user login as csm core application
And user click the chequebook request screen
And user click the send to/receive from provider button
And user click the receive from provider
And user select the batch no under receive from provider
And user click the check box under receive from provider
Then user click the proceed button under receive from provider
And user click the maintenance screen under chequebook request
And user click search icon under maintenance
And user enter the cheque code under maintenance screen
Then user validate the status record present in the maintenance screen under chequebook request
@CHB_008
Scenario: checking if the user is abel to reactivate a chequebook  - short process
Given user login as csm core application
And user click the chequebook request screen
And user click the to reactivate screen
And user click the cheque code under to reactivate screen
And user click the to reactivate button
And user click the reactivate screen
And user enter the chequebook code under reactivate screen
And user click the reactivate button under reactivate screen
And user click the maintenance screen under chequebook request
And user enter the chequebook code under maintenance screen
Then user verify the status approved present in the maintenace screen
@CHB_009
Scenario: checking if the user is abel to reverse a chequebook - short process
Given user login as csm core application
And user click the chequebook request screen
And user click the to be reversed chequebook screen
And user click the checkbook code in to be reversed chequebook screen
And user enter the value in chequebook code
And user click the to be reversed button
Then user click the ok button to validate the confiem message popup 
And user click the reverse chequebook screen
And user click the chequebook code in reverse chequebook screen
And user enter the value in chequebook code under reverse chequebook screen
And user click the reverse button under reverse chequebook screen
And user click the maintenance screen under chequebook request
And user enter the cheque code for reverse chequebook
Then user validate the status record present in the maintenance screen for reverse chequebook
@CHB_010
Scenario: checking if the user is able to create a chequebook - long process
Given user login as csm core application
And user click the chequebook request screen
And user click the maintenance screen under chequebook request
#And User Update the test data id for CHB_010
And User Enter the Number of Cheque Books
And User Cheque Code in Cheque book Maintenance Screen
And User Enter the Branch Code in Cheque book Maintenance Screen
And User Enter the Currency Code in Cheque book Maintenance Screen
And User Enter the GL Code in Cheque book Maintenance Screen
And User Enter the CIF Code in Cheque book Maintenance Screen
And User Enter the Serial No in Cheque book Maintenance Screen
And User Click Save button in Cheque book Maintenance Screen
And User click ok button for no signatures and no finger print pop up warning Message  
And user click search icon under maintenance
And User Validate Cheque book created
And User Store the newly created Cheque book code
@CHB_011
Scenario: checking if the user is able to approve a record under chequebook request  - long process
Given user login as csm core application
And user click the chequebook request screen
And User Click Approve Sub Menu
#And User Update the test data id for CHB_011
And User Search Cheque Book Code in Approve Screen
And User Select Cheque Book Code in Approve Screen
And User Click Approve button in Approve Screen
And User Click Ok button in Warning pop up Message in Approve Screen
And user click the maintenance screen under chequebook request
And user click search icon under maintenance
And User Search Approved chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Approved chequebook record in Cheque book Request Maintenance Screen
@CHB_047
Scenario: Check if the Collected By ID field is not amendable at the level of “Chequebook Request – Submit screen
Given user login as csm core application
And user click the chequebook request screen
And user click the submit screen
#And user click the search icon in submit screen 
And user click the cheque code in submit screen
And user enter the value in cheque code under submit screen
Then user retrieve the record which was created checkbook
And user click to maximize the request information menu
Then user validate to check the collected by id field
@CHB_048
Scenario: Checking for Currenct System Behavior/ "Allow Auto Approve" Checked/ "Allow Auto Submit" Checked/ "Auto Submit upon Approval" Checked
Given user login as csm core application
And user click the chequebook request screen
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
And user click the 	save button under chequebook request
And user click the search icon in maintenance screen
And user click the cheque code in maintenance screen
And user enter the value in cheque code in maintenance screen
Then user validate the status submitted
@CHB_052
Scenario: Checking for Currenct System Behavior/ "Allow Auto Approve" Checked/ "Allow Auto Submit" unchecked/ "Auto Submit upon Approval" Checked
Given user login as csm core application
#And user update test data set id for CHB_052
And user click the chequebook request screen
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
And user click the 	save button under chequebook request
And user click the search icon in maintenance screen
And user click the cheque code in maintenance screen
And user enter the value in cheque code in maintenance screen
Then user validate the status submitted
@CHB_053
Scenario: Checking for Currenct System Behavior/ "Allow Auto Approve" Checked/ "Allow Auto Submit" UnChecked/ "Auto Submit upon Approval" Checked - CIF Product
Given user login as csm core application
And user click the front office management screen
And user click the maintenance screen under front office management
And user click the search icon in maintenance screen
And user click the status in maintenance screen
And user enter the value in status 
And user click the cif products in front office maintenance screen
And user click the account brief name 
And user enter the value in account brief name
And user click the checkbox chequebook
And user click the save button in front office management
@CHB_049
Scenario: Checking for Currenct System Behavior/ "Allow Auto Approve" Checked/ "Allow Auto Submit" Checked/ "Auto Submit upon Approval" unchecked
Given user login as csm core application
And user click the chequebook request screen
And user click the apply to submit screen under checkbook request 
And user click the search icon in apply to submit screen
And user click the check code icon in apply to submit screen
And user enter the value in check code 
And user retrieve the approved record in apply to submit screen
And user click the apply to submit button in apply to submit screen
And user click the maintenance screen under chequebook request
And user click the search icon in maintenance screen
And user click the cheque code in maintenance screen
And user enter the value in cheque code in maintenance screen
Then user validate the status submitted
@CHB_078
Scenario: Checking if system is defaulting new sequence under From Number and To Number for a new account with Deleted sequences if "Reuse Cancelled/ Reversed/ Deleted Chq Nbr" flag is unchecked
Given user login as csm core application
And user click the maintenance screen under chequebook request 
And user click the number of chequebooks button
And user enter the value in number of chequebooks
And user click the cheque code 
And user enter the value in cheque code under chequebook request screen
And user click the chequebook request/maintenance icon
And user click the from number 
And user click the to number
Then user validate to check the disable of from number and to number
@CHB_050
Scenario: Checking for Currenct System Behavior/ "Allow Auto Approve" Checked/ "Allow Auto Submit" Checked/ "Auto Submit upon Approval" unchecked - Alert flag Checked
Given user login as csm core application
And user click the apply to submit screen under checkbook request
And user click the check code icon in apply to submit screen
And user enter the value in check code 
And user retrieve the approved record in apply to submit screen
And user click the apply to submit button in apply to submit screen
And system generate the alert message
And user click the approve button in apply to submit screen
And user click the username
And user enter the value in username
And user click the password
And user enter the value in password
And user click the submit button in user information
Then user validate the chequebook details to approve the record
@CHB_082
Scenario: Checking if system is defaulting new sequence under From Number and To Number with Reversed sequences if "Reuse Cancelled/ Reversed/ Deleted Chq Nbr" flag is unchecked
Given user login as csm core application
And user update test data set id for CHB_082
And user click the chequebook request screen
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
And user click the 	save button under chequebook request
And User Click Approve Sub Menu
And User Search Cheque Book Code in Approve Screen
And User Select Cheque Book Code in Approve Screen
And User Click Approve button in Approve Screen
And User Click Ok button in Warning pop up Message in Approve Screen
And user click the to be reversed chequebook screen
And user click the checkbook code in to be reversed chequebook screen
And user enter the value in chequebook code
And user click the to be reversed button
Then user click the ok button to validate the confiem message popup 
And user click the reverse chequebook screen
And user click the chequebook code in reverse chequebook screen
And user enter the value in chequebook code under reverse chequebook screen
And user click the reverse button under reverse chequebook screen
And user validate the confirm message in reverse chequebook submenu
And user click the ok button in reverse chequebook submenu
And user click the maintenance screen under chequebook request
And user click the search icon in maintenance screen
And user click the cheque code in maintenance screen
And user enter the value in cheque code in maintenance screen
Then user validate the new sequence from number and to number in maintenance screen
@CHB_083
Scenario: Checking if system is defaulting Reversed sequences under From Number and To Number for a new account if "Reuse Cancelled/ Reversed/ Deleted Chq Nbr" flag is checked
Given user login as csm core application
And user update test data set id for CHB_083
And user click the chequebook request screen
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
And user click the 	save button under chequebook request
And User Click Approve Sub Menu
And User Search Cheque Book Code in Approve Screen
And User Select Cheque Book Code in Approve Screen
And User Click Approve button in Approve Screen
And User Click Ok button in Warning pop up Message in Approve Screen
And user click the to be reversed chequebook screen
And user click the checkbook code in to be reversed chequebook screen
And user enter the value in chequebook code
And user click the to be reversed button
Then user click the ok button to validate the confiem message popup 
And user click the reverse chequebook screen
And user click the chequebook code in reverse chequebook screen
And user enter the value in chequebook code under reverse chequebook screen
And user click the reverse button under reverse chequebook screen
And user validate the confirm message in reverse chequebook submenu
And user click the ok button in reverse chequebook submenu
And user click the maintenance screen under chequebook request
And user click the search icon in maintenance screen
And user click the cheque code in maintenance screen
And user enter the value in cheque code in maintenance screen
Then user validate the default same sequence in from number and to number in maintenance screen 
@CHB_084
Scenario: Checking if system is defaulting Reversed sequences under From Number and To Number if "Reuse Cancelled/ Reversed/ Deleted Chq Nbr" flag is checked
Given user login as csm core application
And user update test data set id for CHB_084
And user click the chequebook request screen
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
And user click the 	save button under chequebook request
And User Click Approve Sub Menu
And User Search Cheque Book Code in Approve Screen
And User Select Cheque Book Code in Approve Screen
And User Click Approve button in Approve Screen
And User Click Ok button in Warning pop up Message in Approve Screen
And user click the to be reversed chequebook screen
And user click the checkbook code in to be reversed chequebook screen
And user enter the value in chequebook code
And user click the to be reversed button
Then user click the ok button to validate the confiem message popup 
And user click the reverse chequebook screen
And user click the chequebook code in reverse chequebook screen
And user enter the value in chequebook code under reverse chequebook screen
And user click the reverse button under reverse chequebook screen
And user validate the confirm message in reverse chequebook submenu
And user click the ok button in reverse chequebook submenu
And user click the maintenance screen under chequebook request
And user click the search icon in maintenance screen
And user click the cheque code in maintenance screen
And user enter the value in cheque code in maintenance screen
Then user validate the default reversed sequences in from number and to number in maintenance screen
@CHB_085
Scenario: Checking if the user is able to modify From Number and To Number fields with Cancelled sequences
Given user login as csm core application
And user update test data set id for CHB_085
And user click the chequebook request screen
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
And user click the 	save button under chequebook request
And User Click Approve Sub Menu
And User Search Cheque Book Code in Approve Screen
And User Select Cheque Book Code in Approve Screen
And User Click Approve button in Approve Screen
And User Click Ok button in Warning pop up Message in Approve Screen
And user click to cancel screen submenu
And user click the cheque code in to cancel screen
And user enter the value in cheque code
And user retrieve the created chequebook record in to cancel screen
And user click the cancel reason button to fill the reason in to cancel screen
And user click to cancel button 
And user navigate to click the approve cancel screen
And user click the cheque code in approve cancel screen
And user enter the value in cheque code 
And user retrieve the cancelled record in approve screen
And user click the cancel button in approve screen
And user click the maintenance screen under chequebook request
And user click the cheque code in maintenance screen
And user enter the value in cheque code in maintenance screen
Then user validate to modify the from number and to number 
@CHB_086
Scenario: Checking if the user is able to modify From Number and To Number fields with Deleted sequences
Given user login as csm core application
And user update test data set id for CHB_086
And user click the chequebook request screen

@CHB_141
Scenario: Check if the system is  validating the value of the "Reason on Rejecting" flag as unchecked upon unchecking the "Records rejection reason is mandatory" flag and  rejecting a chequebook underr Reject Destroy screen
Given user login as csm core application
And user update test data set id for CHB_141
And user click the chequebook request screen
And user click to be destroyed screen
And user retrieve the approved chequebook record in to be destroyed screen
Then user click to destroy button
And system force to user to fill the reason in to be destroyed screen
Then user click to destroy button
And user navigate to click the approve destroyed screen
And user click the cheque code in approve destroyed screen
And user retrieve the to be destroyed record in approve destroyed screen
Then user click the reject button in approve destroyed screen











 
