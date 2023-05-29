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
#And user randomly click in destination branches
And user click and enter the value in branch field
And user randomly click in destination branches
#And user click search icon 
#And user click branch code under destination branches
#And user enter the value in branch code and doubleclick the branch code
#And user click and enter the value in branch code field
And user click and enter the value in new user template field 
And user click save button under populate user
And user click confirm message ok button
And user click success message ok button
And user click approve screen under populate user 
And user click and enter the value in cheque code under approve screen
And user click approve button
And user click confirm message ok button
And user click success message ok button
And user click populate screen
And user click and enter the value in cheque code under populate screen
And user click populate button
And user click confirm message ok button
And user click success message ok button 
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
Scenario: Checking if all the teller details and privileges are populated
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
And user logout from the csm params application
And user login as csm params application
#Then user click and enter the populated branch code while login
#And user click parameters menu
#And user click system parameters submenu
#And user click user submenu
#And user click maintenance under user submenu
#And user retrieve the populated user id
#And user click accounts option
#Then user validate the populated account details in destination branch
 
@TSA_019
Scenario: Checking if the system is checking on the accounts defined in the “Accounts” button and is automatically creating, for the same currency and transaction types defined, the same account number but with related profile branch codes
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
And user logout from the csm params application
And user login as csm params application
#Then user click and enter the populated branch code while login
#And user click parameters menu
#And user click system parameters submenu
#And user click user submenu
#And user click maintenance under user submenu
#And user retrieve the populated user id
#And user click accounts option
#Then user should validate the populated branch code in account details

@TSA_020
Scenario: Checking if the account is already created under Internal Accounts-Maintenance Screen in iMAL*CSM Admin, the system creates a new account of the same GL but with a new SL Number
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
And user click confirm message ok button
And user click success message ok button
And user click populate screen
And user click and enter the value in cheque code under populate screen
And user click populate button
And user click confirm message ok button
And user click success message ok button
And user logout from the csm params application
And user login as csm params application
And user logout from the csm params application
And user login as csm params application
#Then user click and enter the populated branch code while login
#And user click parameters menu
#And user click system parameters submenu
#And user click user submenu
#And user click maintenance under user submenu
#And user retrieve the populated user id
#And user click accounts option
#Then user should validate the populated serial number in account details

@TSA_021
Scenario: Checking if the Date Opened for the populated user under the User maintenance screen is the day the population has been made
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
And user click confirm message ok button
And user click success message ok button
And user click populate screen
And user click and enter the value in cheque code under populate screen
And user click populate button
And user click confirm message ok button
And user click success message ok button
And user logout from the csm params application
And user login as csm params application
And user logout from the csm params application
And user login as csm params application
#Then user click and enter the populated branch code while login
#And user click parameters menu
#And user click system parameters submenu
#And user click user submenu
#And user click maintenance under user submenu
#And user retrieve the populated user id
#And user click status bar
#Then user should validate the same as the populated date 

@TRS_041
Scenario: Checking Cash Deposit Transaction - Interbranch
Given user login as csm core application
And user update test data set id for TRS_041
And user click the transactions in menu options
And user click the maintenance in transactions 
And user enter the value in transactions type
And user click the transaction maintenance type icon
Then user enter the value for branch code in currency account
And user click the transaction maintenance type icon
And user enter the value for currency code in curency account 
And user click the transaction maintenance type icon
And user enter the value for GL code in currency account
And user click the transaction maintenance type icon
And user enter the value for CIF code in currency account
And user click the transaction maintenance type icon
And user enter the value for serial number in currency account
And user click currency field and enter the value 
And user click amount field and enter the value 
And user click value date field and enter the value 
Then user click save button 
#And user verify the transaction number 
And user click approve screen
And user click search icon in approve screen
And user click transaction number and enter the value
And user retrieve the record under approve screen
Then user click approve button
And user click the maintenance in transactions
And user enter the value in transactions type 
And user click search icon in maintenance screen
And user click transaction number and enter the value 
And user retrieve the record in maintenance screen under transactions
Then user click the booked entries
#And user verify the transactions details

@TRS_042
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Interbranch
Given user login as csm core application
And user update test data set id for TRS_042
And user click the transactions in menu options
And user click the maintenance in transactions 
And user enter the value in transactions type
And user click the transaction maintenance type icon
And user click and enter the value in debit account branch code under maintenance
And user click and enter the value in debit account currency under maintenance
And user click and enter the value in debit account gl code under maintenance
And user click and enter the value in debit account cif code under maintenance
And user click and enter the value in debit account serial number under maintenance

@TRS_078
Scenario: Checking Cash Withdrawal Transaction - Currency Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
Given user login as csm core application
And user update test data set id for TRS_078
And user click the transactions in menu options
And user click the maintenance in transactions 
And user enter the value in transactions type
And user click the transaction maintenance type icon
Then user enter the value for branch code in currency account
And user click the transaction maintenance type icon
And user enter the value for currency code in curency account 
And user click the transaction maintenance type icon
And user enter the value for GL code in currency account
And user click the transaction maintenance type icon
And user enter the value for CIF code in currency account
And user click the transaction maintenance type icon
And user enter the value for serial number in currency account
And user click currency field and enter the value 
And user click amount field and enter the value
And user validate the stopper message popup  




















