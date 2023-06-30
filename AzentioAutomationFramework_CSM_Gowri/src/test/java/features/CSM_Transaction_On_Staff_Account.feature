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
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
#Then user click and enter the value for branch code in currency account
And user click the transaction maintenance type icon
And user click and enter the value for currency code in curency account 
And user click the transaction maintenance type icon
And user click and enter the value for GL code in currency account
And user click the transaction maintenance type icon
And user click and enter the value for CIF code in currency account
And user click the transaction maintenance type icon
And user click and enter the value for serial number in currency account
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value
And user click the transaction maintenance type icon 
And user click amount field and enter the value
#And user click the transaction maintenance type icon
Then user validate the stopper message popup  

@TRS_079
Scenario: Checking Cash Deposit Transaction - CurrencyDeposit Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
Given user login as csm core application
And user update test data set id for TRS_079
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
And user enter the branch code value in credit account details
And user click the transaction maintenance type icon
And user enter the currency value in credit account details
And user click the transaction maintenance type icon
And user enter the GL code in credit account details
And user click the transaction maintenance type icon
And user enter the CIF code in credit account details
And user click the transaction maintenance type icon
And user enter the serial number in credit account details
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value 
And user click amount field and enter the value
And user click save button in transactions menu
And User Click Ok Button in Information PopUp menu
#And user get transaction no from success popup
Then user navigate to approve submenu
And user click refresh icon in approve submenu
And user retrieve the created record in approve submenu
And user click approve button in approve submenu
Then validate the popup transaction record was sucessfully approved

@TRS_080
Scenario: Checking Cash Depsoit Transaction - Currency Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
Given user login as csm core application
And user update test data set id for TRS_080
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
And user enter the branch code value in credit account details
And user click the transaction maintenance type icon
And user enter the currency value in credit account details
And user click the transaction maintenance type icon
And user enter the GL code in credit account details
And user click the transaction maintenance type icon
And user enter the CIF code in credit account details
And user click the transaction maintenance type icon
And user enter the serial number in credit account details
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value 
And user click amount field and enter the value
And user click the transaction maintenance type icon
Then user validate the cannot proceed stopper message popup under transactions

@TRS_077
Scenario: Checking Cash Deposit Transaction - CurrencyDeposit Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
Given user login as csm core application
And user update test data set id for TRS_077
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
And user enter the branch code value in credit account details
And user click the transaction maintenance type icon
And user enter the currency value in credit account details
And user click the transaction maintenance type icon
And user enter the GL code in credit account details
And user click the transaction maintenance type icon
And user enter the CIF code in credit account details
And user click the transaction maintenance type icon
And user enter the serial number in credit account details
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value 
Then user enter the GL code 
And user click the transaction maintenance type icon 
And user enter the cif code
And user click the transaction maintenance type icon
And user enter the serial no in credit account details
And user click the transaction maintenance type icon
And user click amount field and enter the value
And user click save button in transactions menu
And User Click Ok Button in Information PopUp menu
Then user navigate to approve submenu
And user click refresh icon in approve submenu
And user retrieve the created record in approve submenu
And user click approve button in approve submenu

#pre-requesties
@TRS_078_01
Scenario: Checking Cash Withdrawal Transaction - Currency Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
Given user login as csm params application 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click limits button
And user click add icon 
And user enter account currency value under limits
And user enter transaction value under limits
And user enter withdrawal limit under limits
Then user verify the warn user if limit exceeds flag unchecked
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id
And user retrieve the selected user id
Then user click approve button 
And user click confirm ok button
Then user click success message ok button

#pre-requesties
@TRS_079_02
Scenario: Checking Cash Deposit Transaction - CurrencyDeposit Limit Defined - Warn User if Limit Exceeds Checked - Amount < Limit
Given user login as csm params application 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click limits button
And user click add icon 
And user enter account currency value under limits
And user enter transaction value under limits
And user enter deposit limit under limits
Then user verify the warn user if limit exceeds flag checked
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id
And user retrieve the selected user id
Then user click approve button 
And user click confirm ok button
Then user click success message ok button
 	
#pre-requesties
@TRS_122_01
Scenario: Checking Cash Depsoit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
Given user login as csm params application
And user update test data set id for TRS_122_01 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click Eco sector button
And user click add icon under Eco sector limit
And user enter eco sector value
And user enter transaction value under Eco sector 
And user enter deposit limit value under Eco sector
Then user verify the warn user if limit exceed flag checked under Eco sector
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button  

@TRS_122
Scenario: Checking Cash Depsoit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
Given user login as csm core application
And user update test data set id for TRS_122
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
#And user enter the branch code value in credit account details
#And user click the transaction maintenance type icon
And user enter the currency value in credit account details
And user click the transaction maintenance type icon
And user enter the GL code in credit account details
And user click the transaction maintenance type icon
And user enter the CIF code in credit account details
And user click the transaction maintenance type icon
And user enter the serial number in credit account details
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value
And user click the transaction maintenance type icon 
And user click amount field and enter the value
And user check if the  value is entered or not
Then user verify the stopper message popup

#post-requesties
@TRS_122_02
Scenario: Checking Cash Depsoit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit
Given user login as csm params application
And user update test data set id for TRS_122_02 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click Eco sector button
And user select the row for delete the record
And user delete the inserted record under Eco sector
And user click confirm ok button 
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button 

#pre-requesties
@TRS_123_01
Scenario: Checking Cash Deposit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Given user login as csm params application
And user update test data set id for TRS_123_01 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click Eco sector button
And user click add icon under Eco sector limit
And user enter eco sector value
And user enter transaction value under Eco sector 
And user enter deposit limit value under Eco sector
Then user verify the warn user if limit exceed flag checked under Eco sector
Then user verify the proceed if limits exceeds flag checked under Eco sector
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button  

@TRS_123
Scenario: Checking Cash Deposit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Given user login as csm core application
And user update test data set id for TRS_123
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
And user enter the currency value in credit account details
And user click the transaction maintenance type icon
And user enter the GL code in credit account details
And user click the transaction maintenance type icon
And user enter the CIF code in credit account details
And user click the transaction maintenance type icon
And user enter the serial number in credit account details
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value
And user click the transaction maintenance type icon
And user click amount field and enter the value
And user check if the  value is entered or not
And user click ok button in warning popup menu
And user click save button in transactions menu
And user click ok button in warning popup menu under transactions
And User Click Ok Button in Information PopUp menu
Then user navigate to approve submenu
And user click refresh icon in approve submenu
And user retrieve the created record in approve submenu
And user click approve button in approve submenu

#post-requesties
@TRS_123_02
Scenario: Checking Cash Deposit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Given user login as csm params application
And user update test data set id for TRS_123_02 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click Eco sector button
And user select the row for delete the record
And user delete the inserted record under Eco sector
And user click confirm ok button 
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button 

#pre-requesties
@TRS_124_01
Scenario: Checking Cash Deposit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
Given user login as csm params application
And user update test data set id for TRS_124_01 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click Eco sector button
And user click add icon under Eco sector limit
And user enter eco sector value
And user enter transaction value under Eco sector 
And user enter deposit limit value under Eco sector
Then user verify the proceed if limits exceeds flag checked under Eco sector
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button  

@TRS_124
Scenario: Checking Cash Deposit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
Given user login as csm core application
And user update test data set id for TRS_124
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
And user enter the currency value in credit account details
And user click the transaction maintenance type icon
And user enter the GL code in credit account details
And user click the transaction maintenance type icon
And user enter the CIF code in credit account details
And user click the transaction maintenance type icon
And user enter the serial number in credit account details
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value
And user click the transaction maintenance type icon
And user click amount field and enter the value
And user check if the  value is entered or not
And user click save button in transactions menu
#And user click ok button in warning popup menu under transactions
And User Click Ok Button in Information PopUp menu
Then user navigate to approve submenu
And user click refresh icon in approve submenu
And user retrieve the created record in approve submenu
And user click approve button in approve submenu
Then user verify the successfully approved message popup in approve submenu

#post-requesties
@TRS_124_02
Scenario: Checking Cash Deposit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
Given user login as csm params application
And user update test data set id for TRS_124_02 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click Eco sector button
And user select the row for delete the record
And user delete the inserted record under Eco sector
And user click confirm ok button 
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button
 
#pre-requesties
@TRS_125_01
Scenario: Checking Cash Depsoit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit - Specifc vs. General
Given user login as csm params application
And user update test data set id for TRS_125_01 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click Eco sector button
And user click add icon under Eco sector limit
And user enter eco sector value
And user enter transaction value under Eco sector 
And user enter deposit limit value under Eco sector
Then user verify the warn user if limit exceed flag checked under Eco sector
And user click add icon under Eco sector limit
And user enter eco sector value
And user enter transaction type under Eco sector 
And user enter deposit limit value in Eco sector
Then user verify the warn user if limit exceed flag checked under Eco sector
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button  

@TRS_125
Scenario: Checking Cash Depsoit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit - Specifc vs. General
Given user login as csm core application
And user update test data set id for TRS_125
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
And user enter the currency value in credit account details
And user click the transaction maintenance type icon
And user enter the GL code in credit account details
And user click the transaction maintenance type icon
And user enter the CIF code in credit account details
And user click the transaction maintenance type icon
And user enter the serial number in credit account details
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value
And user click the transaction maintenance type icon
And user click amount field and enter the value
And user check if the  value is entered or not
Then validate the stopper message popup

#post-requesties
@TRS_125_02
Scenario: Checking Cash Depsoit Transaction - Eco Sector Deposit Limit Defined - Warn User if Limit Exceeds Checked - Amount > Limit - Specifc vs. General
Given user login as csm params application
And user update test data set id for TRS_125_02 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click Eco sector button
And user select the row for delete the record
And user delete the inserted record under Eco sector
And user click confirm ok button 
And user select the another row to delete the record
And user delete the inserted record under Eco sector
And user click confirm ok button
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button

#pre-requesties
@TRS_126_01
Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked/ Force Overdraw checked - Overdraw Limit Exceeded Alert Checked
Given user login as csm params application
And user update test data set id for TRS_126_01 
And user click parameters menu
And user click system parameters submenu
And user click the transationtype submenu under systemparameters
And user click the updateafterapprove menu under transationtype
And user Enter the code in inputfield on updateafterapprove screen under transactiontype
And User double click the record under updateafterapprove screen
And User unCheck the ProceedOnInsufficientFund chequebox
And user check the Force overdrawn
And User click UpdateAfterApprove button on updateafterapprove field
And user click the save ok button
And user click the confirm ok
And user click the approve in user screen
And user click and send the values in user id under Approve screen
And user double click the user id in approve screen
And user click the approve box
And user click the save ok button
And user click the confirm ok
And user click the AccountParameter submenu under Parameters
And user click the AccountType under AccountParameters
And user click the UPA field under AccountTypes
And user Enter the TypeCode in UPA field
And user double click the TypeCode in UPA field
And user click the Instructions in AccountTypes
And user uncheck with AllowAccess checkBox under Instructions
And user click UPA Button
And user click the confirm ok
And user click the sucesss ok
And user click the Approve field under AccountTypes
And user Enter the TypeCode in Approve Field
And user double click the Typecode in Approve field
And user click the Approve button
And user click the save ok button

@TRS_126
Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund unchecked/ Allow Overdraw unchecked/ Force Overdraw checked - Overdraw Limit Exceeded Alert Checked
Given user login as csm core application
And user update test data set id for TRS_126
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
And user enter the currency value in credit account details
And user click the transaction maintenance type icon
And user enter the GL code in credit account details
And user click the transaction maintenance type icon
And user enter the CIF code in credit account details
And user click the transaction maintenance type icon
And user enter the serial number in credit account details
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value
And user click the transaction maintenance type icon
And user enter GL code
And user click the transaction maintenance type icon
And user enter CIF code
And user click the transaction maintenance type icon
And user enter serial no
And user click the transaction maintenance type icon
And user click amount field and enter the value
And user check if the  value is entered or not
And user click save button in transactions menu
#And user click ok button in warning popup menu under transactions
And User Click Ok Button in Information PopUp menu
Then user navigate to approve submenu
And user click refresh icon in approve submenu
And user retrieve the created record in approve submenu
And user click approve button in approve submenu
Then user verify the successfully approved message popup in approve submenu

#pre-requesties
@TRS_109_01
Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
Given user login as csm params application
And user update test data set id for TRS_109_01 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click priority button
And user click add icon in priority 
And user enter priority value
And user enter transaction value under Eco sector
And user enter withdrawal limit value 
Then user verify the proceed if limits exceeds flag checked under priority
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button  

@TRS_109
Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
Given user login as csm core application
And user update test data set id for TRS_109
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And user click the transactions in menu options
And user click the maintenance in transactions 
And user click and enter the value in trx type under transactions 
And user click the transaction maintenance type icon
And user enter the currency value in credit account details
And user click the transaction maintenance type icon
And user enter the GL code in credit account details
And user click the transaction maintenance type icon
And user enter the CIF code in credit account details
And user click the transaction maintenance type icon
And user enter the serial number in credit account details
And user click the transaction maintenance type icon
And User Click Ok Button in Information PopUp menu
And user click currency field and enter the value
And user click the transaction maintenance type icon
And user click amount field and enter the value
And user check if the  value is entered or not
And user click save button in transactions menu
#And user click ok button in warning popup menu under transactions
And User Click Ok Button in Information PopUp menu
Then user navigate to approve submenu
And user click refresh icon in approve submenu
And user retrieve the created record in approve submenu
And user click approve button in approve submenu
Then user verify the successfully approved message popup in approve submenu

#post-requesties
@TRS_109_02
Scenario: Checking Cash Withdrawal Transaction - Priority Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
Given user login as csm params application
And user update test data set id for TRS_109_02 
And user click parameters menu
And user click system parameters submenu
And user click user submenu
And user click update after approve 
And user enter the value in user id
And user retrieve the selected user id
Then user click priority button
And user select the row for delete the record
And user delete the inserted record under priority
And user click confirm ok button 
And user click ok button under limits
And user click update after approve button
And user click confirm ok button
Then user click success message ok button
And user click approve screen
And user enter the value in user id under approve screen
And user retrieve the selected user id under approve screen
Then user click approve button 
And user click confirm ok button
Then user click success message ok button

@TRS_141_01
Scenario: Checking Cash Withdrawal Transaction - Currency Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit - User Limit Excceed Alert flag
Given user login as csm core application
And user_615 update test data set id for TRS_141_01 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup

@TRS_141
Scenario: Checking Cash Withdrawal Transaction - Currency Withdrawal Limit Defined - Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit - User Limit Excceed Alert flag
Given user login as csm core application 
And user_615 update test data set id for TRS_141 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 close the view memo
#And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 enter GL code
And user_615 click the transaction maintenance type icon
And user_615 enter CIF code
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 enter serial no
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value
And user_615 check if the  value is entered or not
And user_615 click save button in transactions menu
And User_615 Click Ok Button in Information PopUp menu
And user_615 verify the alert popup
And user_615 select the BM user
Then user_615 send the alert to branch manager
And user_615 approve the transaction

@TRS_142_01
Scenario: Checking Cash Deposit Transaction - CIF is below Minimum Age Alert flag
Given user login as csm core application
And user_615 update test data set id for TRS_142_01 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup

@TRS_142
Scenario: Checking Cash Deposit Transaction - CIF is below Minimum Age Alert flag
Given user login as csm core application 
And user_615 update test data set id for TRS_142 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 close the view memo
#And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 enter GL code
And user_615 click the transaction maintenance type icon
And user_615 enter CIF code
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 enter serial no
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value
And user_615 check if the  value is entered or not
And user_615 click save button in transactions menu
And User_615 Click Ok Button in Information PopUp menu
And user_615 verify the alert popup
And user_615 select the BM user
Then user_615 send the alert to branch manager
And user_615 approve the transaction

@TRS_143_01
Scenario: Checking Cash Deposit Transaction - Account with Link Management Alert flag
Given user login as csm core application
And user_615 update test data set id for TRS_143 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup

@TRS_143
Scenario: Checking Cash Deposit Transaction - Account with Link Management Alert flag
Given user login as csm core application 
And user_615 update test data set id for TRS_143 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 close the view memo
#And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 enter GL code
And user_615 click the transaction maintenance type icon
And user_615 enter CIF code
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 enter serial no
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value
And user_615 check if the  value is entered or not
And user_615 click save button in transactions menu
And User_615 Click Ok Button in Information PopUp menu
And user_615 verify the alert popup
And user_615 select the BM user
Then user_615 send the alert to branch manager
And user_615 approve the transaction

@TRS_144_01
Scenario: Checking Cash Deposit Transaction - CV/FC - Exchange Rate Changed Alert flag
Given user login as csm core application
And user_615 update test data set id for TRS_144 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup

@TRS_144
Scenario: Checking Cash Deposit Transaction - CV/FC - Exchange Rate Changed Alert flag
Given user login as csm core application 
And user_615 update test data set id for TRS_144 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 close the view memo
#And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 enter GL code
And user_615 click the transaction maintenance type icon
And user_615 enter CIF code
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 enter serial no
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value
And user_615 check if the  value is entered or not
And user_615 click save button in transactions menu
And User_615 Click Ok Button in Information PopUp menu
And user_615 verify the alert popup
And user_615 select the BM user
Then user_615 send the alert to branch manager
And user_615 approve the transaction

@TRS_145_01
Scenario: Checking Cash Deposit Transaction - Cancel Transaction Alert flag
Given user login as csm core application
And user_615 update test data set id for TRS_145_01
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup

@TRS_145
Scenario: Checking Cash Deposit Transaction - Cancel Transaction Alert flag
Given user login as csm core application 
And user_615 update test data set id for TRS_145 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 close the view memo
#And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 enter GL code
And user_615 click the transaction maintenance type icon
And user_615 enter CIF code
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 enter serial no
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value 
And user_615 check if the  value is entered or not
And user_615 click save button in transactions menu
And User_615 Click Ok Button in Information PopUp menu
And user_615 verify the alert popup
And user_615 select the BM user
Then user_615 send the alert to branch manager
And user_615 approve the transaction

@TRS_146_01
Scenario: Checking Cash Deposit Transaction - Reverse Transaction Alert flag
Given user login as csm core application
And user_615 update test data set id for TRS_146_01
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup

@TRS_146
Scenario: Checking Cash Deposit Transaction - Reverse Transaction Alert flag
Given user login as csm core application 
And user_615 update test data set id for TRS_146 
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 close the view memo
#And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 enter GL code
And user_615 click the transaction maintenance type icon
And user_615 enter CIF code
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 enter serial no
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 close the view memo
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value
And user_615 check if the  value is entered or not
And user_615 click save button in transactions menu
And User_615 Click Ok Button in Information PopUp menu
And user_615 verify the alert popup
And user_615 select the BM user
Then user_615 send the alert to branch manager
And user_615 approve the transaction






