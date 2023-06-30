Feature: Testing the functionalities of Transaction on staff account in CSM Application

@TSA_158_01

Scenario: Check if the User_614 is able to see his account at the level of statement of account- the flag is checked and the account

Given User_614 Navigate to SADS application and login with valid credentials
#And User_614 update test data set id for TSA_158
And User_614 Click on Parameters under SADS application
And User_614 Click on Account Restrictions in Parameters under SADS application
And User_614 Click on Maintenance in Account Restrictions under Parameters
And User_614 Enter the value in Code under Maintenance Screen
And User_614 Enter the value in Description  under Maintenance Screen
And User_614 Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen
And User_614 Click the RootIcon in ApplicationsOROPTs under maintenance secreen
And User_614 Click on RADM application in ApplicationsOROPTs
And User_614 Click on RADM application Checkbox in ApplicationsOROPTs
And User_614 Click on RET application in ApplicationsOROPTs
And User_614 Click on RET application Checkbox in ApplicationsOROPTs
And User_614 Click on RootIcon in Companies OR Branches in maintenance secreen
And User_614 Click on 1 BAJ application in Companies OR Branches
And User_614 Click on  1 BAJ application Checkbox in Companies OR Branches
And User_614 Enter the User_614 ID in User_614ID tab
And User_614 Click on User_614 ID Checkbox under User_614ID tab
And User_614 Click on Add button in Restriction Type under Maintenance Screen
And User_614 Click on Select Icon for GL under Restriction Type
And User_614 Search the GL code in the Restriction Type
And User_614 Enter the GL code in the GL code search popup
And User_614 Click on Searched GL code in search popup
And User_614 Click on Add button in Restriction Type under Maintenance Screen
And User_614 Click on Select Icon for CIF under Restriction Type
And User_614 Click on Account Balance select Tab in Restriction Level
And User_614 Click on Add Button under Restriction Level
And User_614 Click on Search Icon in  CIF NO Under the Restriction Level
And User_614 Enter the CIF No in the Search box
And User_614 Click on Searched CIF No in search popup
And User_614 Click on Save Button under Maintenance Screen
And User_614 Click on Ok Button in Success PopUp Menu
And User_614 Click on Approve under Account Restrictions
And User_614 Enter the Code in Approve Screen
And User_614 Click the Selected code in Approve Screen
And User_614 Click on Approve button in Approve Screen
And User_614 Click on Ok Button in Success PopUp Menu
And User_614 Click on User_614 in Parameters under SADS application
And User_614 Click on Maintenance in User_614 under Parameters
And User_614 Click on Search Button under Maintenance Screen
And User_614 Enter User_614 ID in search under Maintenance Screen
And User_614 Click on Searched ID under Maintenance Screen
#Only using CHRISAG User_614
And User_614 Click on Company Search Button in Employee Details
And User_614 Enter the Company Code in Search Box
And User_614 Double Click on the Company Searched Code in Search Box
And User_614 Click on Branch Search Button in Employee Details
And User_614 Enter the Branch Code in Search Box
And User_614 Double Click on the Branch Searched Code in Search Box
And User_614 Click on Division Search Button in Employee Details
And User_614 Enter the Division Code in Search Box
And User_614 Double Click on the Division Searched Code in Search Box
And User_614 Click on Department Search Button in Employee Details
And User_614 Enter the Department Code in Search Box
And User_614 Double Click on the Department Searched Code in Search Box
#Upto this only using CHRISAG User_614
And User_614 Click on CIF Search Button in Employee Details under Maintenance Screen
And User_614 Enter the CIF No in SearchBox
And User_614 Click the Searched CIF NO in Search Box
And User_614 Check the Physical User_614 CheckBox in Privilege under Maintenance Screen
And User_614 Click on Save Button in Maintenance Screen
And User_614 Click on Ok Button in Success PopUp in User_614

@TSA_158_02

Scenario: Check if the User_614 is able to see his account at the level of statement of account- the flag is checked and the account

Given User_614 Navigate to SADS1 application and login with valid credentials
And User_614 Click on Parameter in SADS Application
And User_614 Click on User_614 in Parameters under SADS application
And User_614 Click on Approve in User_614 under Parameters
And User_614 Click on Search Button under Approve Screen
And User_614 Enter User_614 ID in search under Approve Screen
And User_614 Click on Searched ID under Approve Screen
And User_614 Click on Approve button in Approve Screen under Parameter
And User_614 Click Ok button in Success Popup in User_614 Approve

@TSA_158_03

Scenario: Check if the User_614 is able to see his account at the level of statement of account- the flag is checked and the account

Given User_614 Navigate to CSM application and login with valid credentials
And User_614 Click on Date to Change the Current Date
And User_614 Enter the Date in User_614 Running Date
And User_614 Click on Use Button in Change Running Date Popup
And User_614 Click Ok Button in Information PopUp menu
And User_614 Click on Close Button in Change Running Date Popup
And User_614 Click on Technical Details Icon
And User_614 Click Clear Cache in Technical Details Icon
And User_614 Click Ok Button Under Information PopUp Menu
And User_614 Click on Transactions under CSM application
And User_614 Click on Maintenance under Transactions
And User_614 Enter TRX Type in Maintenance Screen
And User_614 Enter the Branch Code in Credit Ac in Maintenance Screen
And User_614 Enter Currency Code in Credit Ac in Maintenance Screen
And User_614 Enter GL Code in Credit Ac in Maintenance Screen
And User_614 Enter CIF Code in Credit Ac in Maintenance Screen
And User_614 Enter Serial in Credit Ac in Maintenance Screen
And User_614 Click Ok Button in Warning PopUp Menu
And User_614 Enter the Currency in Maintenance Screen
And User_614 Enter the Amount in Maintenance Screen
And User_614 Click Save Button in Maintenance Screen
And User_614 Get the Transaction No in Success PopUo Menu
And User_614 Click Ok Button in Success PopUp Menu
And User_614 Click on Approve Screen under Transactions
And User_614 Enter the Transaction No in Approve Screen
And User_614 Double Click on the Transaction No
And User_614 Click on Approve Button for approve the Transaction
And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
And User_614 Click on Queries under CSM application
And User_614 Click on Statement Of Accounts in Queries under CSM application
And User_614 Click on By Trade Date under Statement Of Accounts Sub Menu
And User_614 Enter the Currency Value in Account under By Trade Date Screen
And User_614 Enter the GL Code in Account under By Trade Date Screen
And User_614 Enter the CIF Code in Account under By Trade Date Screen
And User_614 Enter the Serial in Account under By Trade Date Screen
And User_614 Enter From Date in Periodicity Of Statement under By Trade Date Screen
And User_614 Enter To Date in Periodicity Of Statement under By Trade Date Screen
And User_614 Click Retrieve Button under By Trade Date Screen
Then User_614 Validate If the Statement of Account Displayed as Access Denied
And User_614 Click on Ok Button in Access Denied PopUp Menu

@TSA_159_01

Scenario: Check if the User_614 is able to see his account at the level of statement of account- the flag is checked and the account

Given User_614 Navigate to SADS application and login with valid credentials
And User_614 Click on User_614 in Parameters under SADS application
And User_614 Click on Maintenance in User_614 under Parameters
And User_614 Click on Search Button under Maintenance Screen
And User_614 Enter User_614 ID in search under Maintenance Screen
And User_614 Click on Searched ID under Maintenance Screen
#Only using CHRISAG User_614
And User_614 Click on Company Search Button in Employee Details
And User_614 Enter the Company Code in Search Box
And User_614 Double Click on the Company Searched Code in Search Box
And User_614 Click on Branch Search Button in Employee Details
And User_614 Enter the Branch Code in Search Box
And User_614 Double Click on the Branch Searched Code in Search Box
And User_614 Click on Division Search Button in Employee Details
And User_614 Enter the Division Code in Search Box
And User_614 Double Click on the Division Searched Code in Search Box
And User_614 Click on Department Search Button in Employee Details
And User_614 Enter the Department Code in Search Box
And User_614 Double Click on the Department Searched Code in Search Box
#Upto this only using CHRISAG User_614
And User_614 Click on CIF Search Button in Employee Details under Maintenance Screen
And User_614 Enter the CIF No in SearchBox
And User_614 Click the Searched CIF NO in Search Box
And User_614 Check the Physical User_614 CheckBox in Privilege under Maintenance Screen
And User_614 Click on Save Button in Maintenance Screen
And User_614 Click on Ok Button in Success PopUp in User_614


@TSA_159_02

Scenario: Check if the User_614 is able to see his account at the level of statement of account- the flag is checked and the account

Given User_614 Navigate to SADS1 application and login with valid credentials
And User_614 Click on Parameter in SADS Application
And User_614 Click on User_614 in Parameters under SADS application
And User_614 Click on Approve in User_614 under Parameters
And User_614 Click on Search Button under Approve Screen
And User_614 Enter User_614 ID in search under Approve Screen
And User_614 Click on Searched ID under Approve Screen
And User_614 Click on Approve button in Approve Screen under Parameter
And User_614 Click Ok button in Success Popup in User_614 Approve

@TSA_159_03

Scenario: Check if the User_614 is able to see his account at the level of statement of account- the flag is checked and the account

Given User_614 Navigate to CSM application and login with valid credentials
And User_614 Click on Date to Change the Current Date
And User_614 Enter the Date in User_614 Running Date
And User_614 Click on Use Button in Change Running Date Popup
And User_614 Click Ok Button in Information PopUp menu
And User_614 Click on Close Button in Change Running Date Popup
And User_614 Click on Technical Details Icon
And User_614 Click Clear Cache in Technical Details Icon
And User_614 Click Ok Button Under Information PopUp Menu
And User_614 Click on Transactions under CSM application
And User_614 Click on Maintenance under Transactions
And User_614 Enter TRX Type in Maintenance Screen
And User_614 Enter the Branch Code in Credit Ac in Maintenance Screen
And User_614 Enter Currency Code in Credit Ac in Maintenance Screen
And User_614 Enter GL Code in Credit Ac in Maintenance Screen
And User_614 Enter CIF Code in Credit Ac in Maintenance Screen
And User_614 Enter Serial in Credit Ac in Maintenance Screen
And User_614 Click Ok Button in Warning PopUp Menu
And User_614 Enter the Currency in Maintenance Screen
And User_614 Enter the Amount in Maintenance Screen
And User_614 Click Save Button in Maintenance Screen
And User_614 Get the Transaction No in Success PopUo Menu
And User_614 Click Ok Button in Success PopUp Menu
And User_614 Click on Approve Screen under Transactions
And User_614 Enter the Transaction No in Approve Screen
And User_614 Double Click on the Transaction No
And User_614 Click on Approve Button for approve the Transaction
And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
And User_614 Click on Queries under CSM application
And User_614 Click on Statement Of Accounts in Queries under CSM application
And User_614 Click on By Trade Date under Statement Of Accounts Sub Menu
And User_614 Enter the Currency Value in Account under By Trade Date Screen
And User_614 Enter the GL Code in Account under By Trade Date Screen
And User_614 Enter the CIF Code in Account under By Trade Date Screen
And User_614 Enter the Serial in Account under By Trade Date Screen
And User_614 Enter From Date in Periodicity Of Statement under By Trade Date Screen
And User_614 Enter To Date in Periodicity Of Statement under By Trade Date Screen
And User_614 Click Retrieve Button under By Trade Date Screen
And User_614 Click Retrieve Button under By Trade Date Screen
Then User_614 Validate If the Statement of Account is Displayed
















