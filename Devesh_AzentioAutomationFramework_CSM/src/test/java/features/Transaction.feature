Feature: Testing the functionality of Transaction
@TRS_035
Scenario: Checking Multi Transfer (Main Credit) Transaction - FC/ FC Same
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking Multi Transfer Main Credit Transaction fc to same fc
Then navigate to transaction menu option
Then user should select current system date
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then click on account details button
Then click on add button
Then insert account 2 in the debit account details
Then click on add button
Then insert account 2 in the debit account details in new row
Then click on ok button to save the debit account details
Then click on save button under transaction maintenance screen
Then get the transaction number and store it
Then navigate to approve under transaction
Then select the transaction number to approve
Then click on approve button in transaction approve screen
Then navigate to maintenance screen under transaction
Then click on search button in transaction maintenance screen 
Then select the approved transaction record
Then click on booked entries under  

@TRS_036
Scenario: Checking Cash Deposit Transaction - FC/ FC Different
Given navigate to CSM application and login with valid credentials
Then select data set ID for checking Cash Deposit Transaction fc to different fc 
Then navigate to transaction menu option
Then user should select current system date
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the different foreign currency
Then enter the amount
Then click on save button under transaction maintenance screen
Then get the transaction number and store it
Then navigate to approve under transaction
Then select the transaction number to approve
Then click on approve button in transaction approve screen
Then navigate to maintenance screen under transaction
Then click on search button in transaction maintenance screen
Then select the approved transaction record
Then click on booked entries under 

@TRS_037
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - FC/ FC Different
Given navigate to CSM application and login with valid credentials
Then select data set ID for checking Single Transfer Main Debit Intra Transaction fc to different fc 
Then navigate to transaction menu option
Then user should select current system date
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the debit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then fill the to account details

Then click on ok button to save the debit account details
#Then click on save button under transaction maintenance screen
#Then get the transaction number and store it
#Then navigate to approve under transaction
#Then select the transaction number to approve
#Then click on approve button in transaction approve screen
#Then navigate to maintenance screen under transaction
#Then click on search button in transaction maintenance screen
#Then select the approved transaction record
#Then click on booked entries under 

@TRS_081
Scenario: Checking Cash Deposit Transaction - Currency Deposit Limit Defined 
					- Warn User if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking Cash Deposit Transaction and Warn User if Limit Exceeds Checked
Then navigate to transaction menu option
Then user should select current system date
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then verify the warning message is displaying
Then click on save button under transaction maintenance screen
Then verify the warning message is displaying
Then get the transaction number and store it
Then navigate to approve under transaction
Then select the transaction number to approve
Then click on approve button to approve the cash deposit transaction

@TRS_082
Scenario: Checking Cash Deposit Transaction - Currency Deposit Limit Defined
				 - Warn User if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking Cash Deposit Transaction and Warn User if Limit Exceeds UnChecked
Then navigate to transaction menu option
Then user should select current system date
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then click on save button under transaction maintenance screen
Then get the transaction number and store it
Then navigate to approve under transaction
Then select the transaction number to approve
Then click on approve button in transaction approve screen


@TRS_083
Scenario: Checking Cash Deposit Transaction - Currency Deposit Limit Defined
				 	- Warn User if Limit Exceeds Checked - Override Percentage Defined 10%
				  - Limit < Amount < Limit + Percentage
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking Cash Deposit Transaction and warn user if Limit Exceeds Checked and Override Percentage Defined
Then navigate to transaction menu option
Then user should select current system date
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then verify the warning message is displaying
Then click on save button under transaction maintenance screen
Then verify the warning message is displaying
Then get the transaction number and store it
Then navigate to approve under transaction
Then select the transaction number to approve
Then click on approve button to approve the cash deposit transaction

@TRS_084
Scenario: Checking Cash Deposit Transaction - Currency Deposit Limit Defined
				  - Warn User if Limit Exceeds Checked - Override Percentage Defined 10%
				  - Proceed if Limit Exceeds Checked - Amount > Limit + Percentage
Given navigate to CSM application and login with valid credentials
Then select data set ID for Checking Cash Deposit Transaction and warn and proceed user if Limit Exceeds Checked and Override Percentage Defined
Then navigate to transaction menu option
Then user should select current system date
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then verify the warning message is displaying
Then click on save button under transaction maintenance screen
Then verify the warning message is displaying
Then get the transaction number and store it
Then navigate to approve under transaction
Then select the transaction number to approve
Then click on approve button to approve the cash deposit transaction

@TRS_129
Scenario: Checking Cash Deposit Transaction - Alert Modify
Given navigate to CSM application and login with valid credentials
Then user should select current system date
Then navigate to CSM application and login with Teller user
Then select data set ID for Checking Cash Deposit Transaction and Alert Modify
Then navigate to transaction menu option
Then user should select current system date
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then click on save button under transaction maintenance screen
Then get the transaction number and store it
Then enter the BM user id
Then double click on user id first row
Then switch to the BM user login page
Then Enter the trx no and click on checkbox
Then click on open item in alertbox
Then click on modify button


@TRS_130
Scenario: Checking Cash Deposit Transaction - Alert Approve Local
Given navigate to CSM application and login with Teller user
Then user should select current system date
Then select data set ID for Checking Cash Deposit Transaction and Alert Approve Local
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then click on save button under transaction maintenance screen
Then get the transaction number and store it
Then click on send alert approve button
Then enter the branch manager user name in user information
Then enter the branch manager user password in user information
Then click on submit button in user information
Then click on approve button in approve item alert box
Then verify the current status of local approve by branch manager is approved

@TRS_131
Scenario: Checking Cash Deposit Transaction - Alert Reject Local
Given navigate to CSM application and login with Teller user
Then user should select current system date
Then select data set ID for Checking Cash Deposit Transaction and Alert Reject Local
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then click on save button under transaction maintenance screen
Then get the transaction number and store it
Then click on send alert approve button
Then enter the branch manager user name in user information
Then enter the branch manager user password in user information
Then click on submit button in user information
Then select the reject reason from dropdown
Then click on reject button in approve item alert box
Then verify the current status of local approve by branch manager is rejected

@TRS_132
Scenario: Checking Cash Deposit Transaction - Alert Modify Local
Given navigate to CSM application and login with Teller user
Then user should select current system date
Then select data set ID for Checking Cash Deposit Transaction and Alert Modify Local
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the credit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then click on save button under transaction maintenance screen
Then get the transaction number and store it
Then click on send alert approve button
Then enter the branch manager user name in user information
Then enter the branch manager user password in user information
Then click on submit button in user information
Then enter the modify reason in the textarea
Then click on modify button in approve item alert box

@TRS_163
Scenario: Checking Single Transfer (Main Debit) Intra Transaction
				 - Deduct Charges from Debit Account
				 - Modify flags not checked on Trx Type, but checked on Charge Code
Given navigate to CSM application and login with Teller user
Then user should select current system date
Then select data set ID for test case TRS163
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the debit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then fill the to account details
Then select the cash deduct option from charges details
Then click on charges button
Then amend charge amount from 10 to 5
Then verify the stopper message must display
#Then click on save button under transaction maintenance screen
#Then get the transaction number and store it

@TRS_164
Scenario: Checking Single Transfer (Main Debit) Intra Transaction
 					- Deduct Charges from Debit Account
  				- Clear flags not checked on Trx Type, but checked on Charge Code
Given navigate to CSM application and login with Teller user
Then user should select current system date
Then select data set ID for test case TRS164
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the debit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then fill the to account details
Then select the cash deduct option from charges details
Then click on waive charges button
Then verify the stopper message must display

@TRS_165
Scenario: Checking Single Transfer (Main Debit) Intra Transaction
 					- Deduct Charges from Debit Account
  				- Modify flags Checked on Trx Type and checked on Charge Code
Given navigate to CSM application and login with Teller user
Then user should select current system date
Then select data set ID for test case TRS165
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the debit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then fill the to account details
Then select the cash deduct option from charges details
Then click on charges button
Then amend charge amount from 10 to 5
#Then click on save button under transaction maintenance screen
#Then get the transaction number and store it
#Then navigate to maintenance screen under transaction
#Then click on search button in transaction maintenance screen 
#Then select the approved transaction record
#Then click on booked entries under 

@TRS_166
Scenario: Checking Single Transfer (Main Debit) Intra Transaction
 					- Deduct Charges from Debit Account
  				- Modify flags Checked on Trx Type and checked on Charge Code
Given navigate to CSM application and login with Teller user
Then user should select current system date
Then select data set ID for test case TRS166
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the debit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then fill the to account details
Then click on waive charges button
Then click on save button under transaction maintenance screen
Then get the transaction number and store it
Then navigate to maintenance screen under transaction
Then click on search button in transaction maintenance screen 
Then select the approved transaction record
Then click on booked entries under

@TRS_167
Scenario: Checking Single Transfer (Main Debit) Intra Transaction
 					- Deduct Charges from Debit Account - CIF Charges - Specific Used - Account
Given navigate to CSM application and login with Teller user
Then user should select current system date
Then select data set ID for test case TRS167
Then navigate to transaction menu option
Then navigate to maintenance screen under transaction
Then select the transaction type
Then fill the debit account details
Then enter the card no
Then enter the foreign currency
Then enter the amount
Then fill the to account details
Then click on save button under transaction maintenance screen
Then get the transaction number and store it
Then navigate to approve under transaction
Then select the transaction number to approve
Then click on approve button in transaction approve screen
Then navigate to maintenance screen under transaction
Then click on search button in transaction maintenance screen 
Then select the approved transaction record
Then click on booked entries under









