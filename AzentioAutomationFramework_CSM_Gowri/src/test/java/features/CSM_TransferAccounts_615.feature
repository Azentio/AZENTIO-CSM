Feature: To verify the functionality of CSM transactions
@TA_038
Scenario: Creating batch record when Resident exception is defined/ From GL to GL
Given user_615 login as csm core application
And user_615 update test data set id for TA_038
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click transfer accounts menu options
And user-615 click maintenance under transfer accounts menu options
Then user_615 select the transfer type under maintenance screen
And user_615 enter the value in reason field
And user_615 click the ranges definition By Cif
And user_615 enter the value in cif field
And user_615 enter the value in original GL
And user_615 enter the value in destination GL
Then user_615 click set exceptions button
And user_615 click add icon under reason tab
And user_615 click exception factor 
Then user_615 select the resident value under dropdown 
And user_615 enter the exception value under reason tab
And user_615 click ok button
And user_615 click retrieve button
Then user_615 verify the accounts will be shown successfully 

@TA_039
Scenario: Creating batch record when Non resident exception is defined/ From GL to GL
Given user_615 login as csm core application
And user_615 update test data set id for TA_039
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click transfer accounts menu options
And user-615 click maintenance under transfer accounts menu options
Then user_615 select the transfer type under maintenance screen
And user_615 enter the value in reason field
And user_615 click the ranges definition By Cif
And user_615 enter the value in cif field
And user_615 enter the value in original GL
And user_615 enter the value in destination GL
Then user_615 click set exceptions button
And user_615 click add icon under reason tab
And user_615 click exception factor 
Then user_615 select the resident value under dropdown 
And user_615 enter the exception value under reason tab
And user_615 click ok button
And user_615 click retrieve button
Then user_615 verify the accounts will be shown sucessfully under maintenance screen

@TA_040
Scenario: Creating batch record when Account currency exception is defined/ From GL to GL
Given user_615 login as csm core application
And user_615 update test data set id for TA_040
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click transfer accounts menu options
And user-615 click maintenance under transfer accounts menu options
Then user_615 select the transfer type under maintenance screen
And user_615 enter the value in reason field
And user_615 click the ranges definition By Cif
And user_615 enter the value in cif field
And user_615 enter the value in original GL
And user_615 enter the value in destination GL
Then user_615 click set exceptions button
And user_615 click add icon under reason tab
And user_615 click exception factor 
Then user_615 select the resident value under dropdown 
And user_615 enter the exception value under reason tab
And user_615 click ok button
And user_615 click retrieve button
Then user_615 validate the accounts will be shown sucessfully under maintenance screen

@TA_041
Scenario: Approving batch record when some accounts are not checked / From branch to branch
Given user_615 login as csm core application
And user_615 update test data set id for TA_041
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click transfer accounts menu options
And user-615 click maintenance under transfer accounts menu options
Then user_615 select the transfer type under maintenance screen
And user_615 enter the value in reason field
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in branch code field under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in currency code field under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in GL code field under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in Cif code field under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in serial no under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in branch code under to account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in currency field under to account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in GL field under to account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in cif field under to account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in serial no under to account
And user_615 randomly click the transfer accounts maintenance tab
Then user_615 enter the value in destination branch field
And user_615 randomly click the transfer accounts maintenance tab
And user_615 click retrieve button
Then user_615 click save button
And user_615 navigate to click the approve submenu
And user_615 enter the value in from GL input field
And user_615 retrieve the saved record under approve submenu
Then user_615 click approve button 

@TA_042
Scenario: Account transfer / From branch to branch
Given user_615 login as csm core application
And user_615 update test data set id for TA_042
And user_615 click transfer accounts menu options
And user-615 click maintenance under transfer accounts menu options
Then user_615 select the transfer type under maintenance screen
And user_615 enter the value in reason field
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in branch code field under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in currency code field under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in GL code field under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in Cif code field under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in serial no under from account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in branch code under to account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in currency field under to account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in GL field under to account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in cif field under to account
And user_615 randomly click the transfer accounts maintenance tab
And user_615 enter the value in serial no under to account
And user_615 randomly click the transfer accounts maintenance tab
Then user_615 enter the value in destination branch field
And user_615 randomly click the transfer accounts maintenance tab
And user_615 click retrieve button
Then user_615 click save button
And user_615 navigate to click the approve submenu
And user_615 enter the value in from GL input field
And user_615 retrieve the saved record under approve submenu
Then user_615 click approve button 
And user_615 navigate to click transfer submenu
And user_615 click and enter the value in batch no
And user_615 retrieve the authorized record under transfer submenu
Then user_615 click transfer button 
And user-615 click maintenance under transfer accounts menu options
And user_615 click search icon under maintenance screen
And user_615 enter the batch no 
Then user_615 validate the status authorized
And user_615 navigate to click the accounts menu options
And user_615 click general accounts
And user_615 click maintenance under general accounts
And user_615 enter the value in GL Code input field under maintenance
Then user_615 verify the closed status









