Feature: To verify the functionality of transaction on staff account
@TSA_016
Scenario: Checking if all the new profiles are created as “Active” in the branches set in the “Destination Branch” after populating
Given user login as csm params application 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click populate user submenu
And user click maintenance under populate user submenu
And user click and enter the value in code under maintenance screen
And user click and enter the value in brief description field under maintenance screen
And user click and enter the value in long description field under maintenance screen
And user click and enter the value in brief description arabic field under maintenance screen
And user click and enter the value in long description arabic field under maintenance screen
And user click and enter the value in user code field 
And user click add icon in destination branches
And user click and enter the value in branch code field
And user click and enter the value in new user template field 
And user click save button under populate user
And user click confirm message ok button
And user click success message ok button
And user click approve screen under populate user 
And user click and enter the value in cheque code under approve screen
And user click approve button
And user click populate screen
And user click and enter the value in cheque code under populate screen
And user click populate button 
And user logout from the csm params application
#And user navigate to login as csm params application
#And user click and enter the value in branch code in csm params application login 
#And user validate the status in maintenance under user submenu 

@TSA_017
Scenario: Checking if the user being populated  is logged out from CSM to be populated
Given user login as csm params application 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click populate user submenu
And user click maintenance under populate user submenu
And user click and enter the value in code under maintenance screen
And user click and enter the value in brief description field under maintenance screen
And user click and enter the value in long description field under maintenance screen
And user click and enter the value in brief description arabic field under maintenance screen
And user click and enter the value in long description arabic field under maintenance screen
And user click and enter the value in user code field 
And user click add icon in destination branches
And user click and enter the value in branch code field
And user click and enter the value in new user template field 
And user click the check box suspend user in logged in branch under maintenance screen
And user click save button under populate user
And user click confirm message ok button
And user click success message ok button
And user click approve screen under populate user 
And user click and enter the value in cheque code under approve screen
And user click approve button
And user click populate screen
And user click and enter the value in cheque code under populate screen
And user click populate button 
#Then user validate the popup the user is logged in to CSM

@TSA_018
Scenario: 














