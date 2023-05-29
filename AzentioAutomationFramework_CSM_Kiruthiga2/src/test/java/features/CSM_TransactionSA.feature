Feature: Testing the functionalities of Transaction on staff account in CSM Application

@TSA_158_01

Scenario: Check if the user is able to see his account at the level of statement of account- the flag is checked and the account 
					is not related to the user and under the restriction 
Given User Navigate to SADS application and login with valid credentials
#And user update test data set id for TSA_158
And User Click on Parameters under SADS application
And User Click on Account Restrictions in Parameters under SADS application
And User Click on Maintenance in Account Restrictions under Parameters
And User Enter the value in Code under Maintenance Screen
And User Enter the value in Description  under Maintenance Screen
And User Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen
And User Click the RootIcon in ApplicationsOROPTs under maintenance secreen
And User Click on RADM application in ApplicationsOROPTs
And User Click on RADM application Checkbox in ApplicationsOROPTs
And User Click on RET application in ApplicationsOROPTs
And User Click on RET application Checkbox in ApplicationsOROPTs
And User Click on RootIcon in Companies OR Branches in maintenance secreen
And User Click on 1 BAJ application in Companies OR Branches
And User Click on  1 BAJ application Checkbox in Companies OR Branches
And User Enter the User ID in UserID tab
And User Click on User ID Checkbox under UserID tab
And User Click on Add button in Restriction Type under Maintenance Screen
And User Click on Select Icon for GL under Restriction Type
And User Search the GL code in the Restriction Type
And User Enter the GL code in the GL code search popup
And User Click on Searched GL code in search popup
And User Click on Add button in Restriction Type under Maintenance Screen
And User Click on Select Icon for CIF under Restriction Type
And User Click on Account Balance select Tab in Restriction Level
And User Click on Add Button under Restriction Level
And User Click on Search Icon in  CIF NO Under the Restriction Level
And User Enter the CIF No in the Search box
And User Click on Searched CIF No in search popup
And User Click on Save Button under Maintenance Screen
And User Click on Ok Button in Success PopUp Menu
And User Click on Approve under Account Restrictions
And User Enter the Code in Approve Screen
And User Click the Selected code in Approve Screen
And User Click on Approve button in Approve Screen
And User Click on Ok Button in Success PopUp Menu
And User Click on User in Parameters under SADS application
And User Click on Maintenance in User under Parameters
And User Click on Search Button under Maintenance Screen
And User Enter User ID in search under Maintenance Screen
And User Click on Searched ID under Maintenance Screen
#Only using CHRISAG User
And User Click on Company Search Button in Employee Details
And User Enter the Company Code in Search Box
And User Double Click on the Company Searched Code in Search Box
And User Click on Branch Search Button in Employee Details
And User Enter the Branch Code in Search Box
And User Double Click on the Branch Searched Code in Search Box 
And User Click on Division Search Button in Employee Details
And User Enter the Division Code in Search Box
And User Double Click on the Division Searched Code in Search Box
And User Click on Department Search Button in Employee Details
And User Enter the Department Code in Search Box
And User Double Click on the Department Searched Code in Search Box
#Upto this only using CHRISAG User
And User Click on CIF Search Button in Employee Details under Maintenance Screen
And User Enter the CIF No in SearchBox
And User Click the Searched CIF NO in Search Box
And User Check the Physical User CheckBox in Privilege under Maintenance Screen
And User Click on Save Button in Maintenance Screen
And User Click on Ok Button in Success PopUp in User

@TSA_158_02

Scenario: Check if the user is able to see his account at the level of statement of account- the flag is checked and the account 
					is not related to the user and under the restiction 
Given User Navigate to SADS1 application and login with valid credentials
And User Click on Parameter in SADS Application
And User Click on User in Parameters under SADS application
And User Click on Approve in User under Parameters
And User Click on Search Button under Approve Screen
And User Enter User ID in search under Approve Screen
And User Click on Searched ID under Approve Screen
And User Click on Approve button in Approve Screen under Parameter
And User Click Ok button in Success Popup in User Approve

@TSA_158_03

Scenario: Check if the user is able to see his account at the level of statement of account- the flag is checked and the account 
					is not related to the user and under the restiction 
Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User Enter TRX Type in Maintenance Screen
And User Enter the Branch Code in Credit Ac in Maintenance Screen
And User Enter Currency Code in Credit Ac in Maintenance Screen
And User Enter GL Code in Credit Ac in Maintenance Screen
And User Enter CIF Code in Credit Ac in Maintenance Screen
And User Enter Serial in Credit Ac in Maintenance Screen
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen
And User Enter the Amount in Maintenance Screen
And User Click Save Button in Maintenance Screen
And User Get the Transaction No in Success PopUo Menu
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screen
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Queries under CSM application
And User Click on Statement Of Accounts in Queries under CSM application
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Enter the Currency Value in Account under By Trade Date Screen
And User Enter the GL Code in Account under By Trade Date Screen
And User Enter the CIF Code in Account under By Trade Date Screen
And User Enter the Serial in Account under By Trade Date Screen
And User Enter From Date in Periodicity Of Statement under By Trade Date Screen
And User Enter To Date in Periodicity Of Statement under By Trade Date Screen
And User Click Retrieve Button under By Trade Date Screen
Then User Validate If the Statement of Account Displayed as Access Denied
And User Click on Ok Button in Access Denied PopUp Menu

@TSA_159_01

Scenario: Check if the user is able to see his account at the level of statement of account- the flag is checked and the account 
					is not related to the user and  not under the restiction
Given User Navigate to SADS application and login with valid credentials
And User Click on User in Parameters under SADS application
And User Click on Maintenance in User under Parameters
And User Click on Search Button under Maintenance Screen
And User Enter User ID in search under Maintenance Screen
And User Click on Searched ID under Maintenance Screen
#Only using CHRISAG User
And User Click on Company Search Button in Employee Details
And User Enter the Company Code in Search Box
And User Double Click on the Company Searched Code in Search Box
And User Click on Branch Search Button in Employee Details
And User Enter the Branch Code in Search Box
And User Double Click on the Branch Searched Code in Search Box 
And User Click on Division Search Button in Employee Details
And User Enter the Division Code in Search Box
And User Double Click on the Division Searched Code in Search Box
And User Click on Department Search Button in Employee Details
And User Enter the Department Code in Search Box
And User Double Click on the Department Searched Code in Search Box
#Upto this only using CHRISAG User
And User Click on CIF Search Button in Employee Details under Maintenance Screen
And User Enter the CIF No in SearchBox
And User Click the Searched CIF NO in Search Box
And User Check the Physical User CheckBox in Privilege under Maintenance Screen
And User Click on Save Button in Maintenance Screen
And User Click on Ok Button in Success PopUp in User


@TSA_159_02

Scenario: Check if the user is able to see his account at the level of statement of account- the flag is checked and the account 
					is not related to the user and  not under the restiction
Given User Navigate to SADS1 application and login with valid credentials
And User Click on Parameter in SADS Application
And User Click on User in Parameters under SADS application
And User Click on Approve in User under Parameters
And User Click on Search Button under Approve Screen
And User Enter User ID in search under Approve Screen
And User Click on Searched ID under Approve Screen
And User Click on Approve button in Approve Screen under Parameter
And User Click Ok button in Success Popup in User Approve

@TSA_159_03

Scenario: Check if the user is able to see his account at the level of statement of account- the flag is checked and the account 
					is not related to the user and  not under the restiction
Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User Enter TRX Type in Maintenance Screen
And User Enter the Branch Code in Credit Ac in Maintenance Screen
And User Enter Currency Code in Credit Ac in Maintenance Screen
And User Enter GL Code in Credit Ac in Maintenance Screen
And User Enter CIF Code in Credit Ac in Maintenance Screen
And User Enter Serial in Credit Ac in Maintenance Screen
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen
And User Enter the Amount in Maintenance Screen
And User Click Save Button in Maintenance Screen
And User Get the Transaction No in Success PopUo Menu
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screen
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Queries under CSM application
And User Click on Statement Of Accounts in Queries under CSM application
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Enter the Currency Value in Account under By Trade Date Screen
And User Enter the GL Code in Account under By Trade Date Screen
And User Enter the CIF Code in Account under By Trade Date Screen
And User Enter the Serial in Account under By Trade Date Screen
And User Enter From Date in Periodicity Of Statement under By Trade Date Screen
And User Enter To Date in Periodicity Of Statement under By Trade Date Screen
And User Click Retrieve Button under By Trade Date Screen
And User Click Retrieve Button under By Trade Date Screen
Then User Validate If the Statement of Account is Displayed
 
@TRS_008

Scenario: Transactions -> Maintenance screen -  No access to Economic sector.
#For this test case we have to create an account based on Eco Sector 
#In User we remove that Eco Sector and do to transaction
Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User Enter TRX Type in Maintenance Screen
And User Enter the Branch Code in Credit Ac in Maintenance Screen
And User Enter Currency Code in Credit Ac in Maintenance Screen
And User Enter GL Code in Credit Ac in Maintenance Screen
And User Enter CIF Code in Credit Ac in Maintenance Screen
And User Click Close Button in View Memo Popup menu
And User Enter Serial in Credit Ac in Maintenance Screen
Then User Validate User Does Not have Access On this TRX type 377 For the Economic Sector 4 Of This CIF
And User Click Ok Button in Cannot Proceed PopUp Menu

@TRS_009

Scenario: Transactions -> Maintenance screen -  No access to Currency.
#For this test case we have to create an account using different currency other than 840 
#In User we remove the currency in Balance and Limit and than add the currency in Account and configure 
Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User Enter TRX Type in Maintenance Screen
And User Enter the Branch Code in Credit Ac in Maintenance Screen
And User Enter Currency Code in Credit Ac in Maintenance Screen
And User Enter GL Code in Credit Ac in Maintenance Screen
And User Enter CIF Code in Credit Ac in Maintenance Screen
#And User Click Close Button in View Memo Popup menu
And User Enter Serial in Credit Ac in Maintenance Screen
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen
And User Enter the Amount under Maintenance Screen
Then User Validate User does not have rights to trade with selected Currency 144
And User Click Ok Button in CannotProceed Popup Menu

@TRS_010
Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates
Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User Enter TRX Type in Maintenance Screen
And User Enter the Branch Code in Credit Ac in Maintenance Screen
And User Enter Currency Code in Credit Ac in Maintenance Screen
And User Enter GL Code in Credit Ac in Maintenance Screen
And User Enter CIF Code in Credit Ac in Maintenance Screen
And User Enter Serial in Credit Ac in Maintenance Screen
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen
And User Enter the Amount in Maintenance Screen
And User Click Save Button in Maintenance Screen
And User Get the Transaction No in Success PopUo Menu
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screen
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Maintenance under Transactions
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User Click on Search Button in Maintenance Screen
And User Enter the Transaction No in Search Box
And User Double Click on the Searched Transaction No in Search Box
And User Click on Booked Entries in Maintenance Screen
#Check Booked Entries
And User Click on Queries under CSM application
And User Click on Statement Of Accounts in Queries under CSM application
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Enter the Currency Value in Account under By Trade Date Screen
And User Enter the GL Code in Account under By Trade Date Screen
And User Enter the CIF Code in Account under By Trade Date Screen
And User Enter the Serial in Account under By Trade Date Screen
And User Enter From Date in Periodicity Of Statement under By Trade Date Screen
And User Enter To Date in Periodicity Of Statement under By Trade Date Screen
And User Click Retrieve Button under By Trade Date Screen
#Get OP No value in excel data
And User Enter the Op No in By Trade Date Screen
Then User Validate the Credit Amount in By Trade Date Screen

@TRS_011
Scenario: Checking Cash Withdrawal Transaction - Booked Entries + Balance Updates
Given User Navigate to CSM application and login with valid credentials
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popup
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popup
And User Click on Technical Details Icon
And User Click Clear Cache in Technical Details Icon
And User Click Ok Button Under Information PopUp Menu
And User Click on Transactions under CSM application
And User Click on Maintenance under Transactions
And User Enter Withdrawal TRX Type in Maintenance Screen
#And User Enter the Branch Code in Debit Ac in Maintenance Screen
And User Enter Currency Code in Debit Ac in Maintenance Screen
And User Enter GL Code in Debit Ac in Maintenance Screen
And User Enter CIF Code in Debit Ac in Maintenance Screen
And User Enter Serial in Debit Ac in Maintenance Screen
And User Click Ok Button in Warning PopUp Menu
And User Enter the Currency in Maintenance Screen
And User Enter the Amount for Debit in Maintenance Screen
And User Click Save Button in Maintenance Screen
And User Get the Transaction No in Success PopUo Menu
And User Click Ok Button in Success PopUp Menu
And User Click on Approve Screen under Transactions
And User Enter the Transaction No in Approve Screen
And User Double Click on the Transaction No
And User Click on Approve Button for approve the Transaction
And User Click on Ok Button in Success PopUp Menu for Approve Transcation
And User Click on Maintenance under Transactions
And User Click Ok Button in Warning PopUp to go back to Maintenance
And User Click on Search Button in Maintenance Screen
And User Enter the Transaction No in Search Box
And User Double Click on the Searched Transaction No in Search Box
And User Click on Booked Entries in Maintenance Screen
#Check Booked Entries
And User Click on Queries under CSM application
And User Click on Statement Of Accounts in Queries under CSM application
And User Click on By Trade Date under Statement Of Accounts Sub Menu
And User Enter the Currency Value in Account under By Trade Date Screen
And User Enter the GL Code in Account under By Trade Date Screen
And User Enter the CIF Code in Account under By Trade Date Screen
And User Enter the Serial in Account under By Trade Date Screen
And User Enter From Date in Periodicity Of Statement under By Trade Date Screen
And User Enter To Date in Periodicity Of Statement under By Trade Date Screen
And User Click Retrieve Button under By Trade Date Screen
#Get OP No value in excel data
And User Enter the Op No in By Trade Date Screen
Then User Validate the Debit Amount in By Trade Date Screen












