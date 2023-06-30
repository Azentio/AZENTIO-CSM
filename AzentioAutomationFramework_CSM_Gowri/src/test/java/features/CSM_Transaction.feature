Feature: To verify the functionality of CSM transactions
@TRS_387
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - Intrabank - Single Transfer - Mode of Payment A/C
Given user_615 login as csm core application
And user_615 update test data set id for TRS_387
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
Then user_615 select the mode of payment under transactions
And user_615 enter the branch code value in debit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value
And user_615 check if the  value is entered or not
And user_615 enter the branch code value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code value in credit account details 
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code value in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 enter the serial no value in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 click save button in transactions menu
#And user Get the Transaction No in Success PopUp Menu
And User_615 Click Ok Button in Information PopUp menu
Then user_615 navigate to approve submenu
And user_615 click refresh icon in approve submenu
And user_615 retrieve the created record in approve submenu
And user_615 click approve button in approve submenu
Then user_615 verify the successfully approved message popup in approve submenu

@TRS_384
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - International - Single Transfer - Mode of Payment Cash
Given user_615 login as csm core application
And user_615 update test data set id for TRS_387
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
Then user_615 select the mode of payment under transactions
And user_615 enter the branch code value in debit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value
And user_615 check if the  value is entered or not
And user_615 enter the branch code value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code value in credit account details 
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code value in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 enter the serial no value in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 click save button in transactions menu
#And user Get the Transaction No in Success PopUp Menu
And User_615 Click Ok Button in Information PopUp menu
Then user_615 navigate to approve submenu
And user_615 click refresh icon in approve submenu
And user_615 retrieve the created record in approve submenu
And user_615 click approve button in approve submenu
Then user_615 verify the successfully approved message popup in approve submenu

@TRS_385
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - International  - Multi Transfer - Mode of Payment A/C
Given user_615 login as csm core application
And user_615 update test data set id for TRS_387
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
Then user_615 select the mode of payment under transactions
And user_615 enter the branch code value in debit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value
And user_615 check if the  value is entered or not
And user_615 enter the branch code value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code value in credit account details 
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code value in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 enter the serial no value in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 click save button in transactions menu
#And user Get the Transaction No in Success PopUp Menu
And User_615 Click Ok Button in Information PopUp menu
Then user_615 navigate to approve submenu
And user_615 click refresh icon in approve submenu
And user_615 retrieve the created record in approve submenu
And user_615 click approve button in approve submenu
Then user_615 verify the successfully approved message popup in approve submenu

@TRS_386
Scenario: Check if the system accept multiple CIF whenever creating Transfer Trx - International - Multi Transfer - Mode of Payment Cash
Given user_615 login as csm core application
And user_615 update test data set id for TRS_387
And User_615 Click on Date to Change the Current Date
And User_615 Enter the Date in User Running Date
And User_615 Click on Use Button in Change Running Date Popup
And User Click Ok Button for confirmation PopUp for Company Holiday
And User_615 Click Ok Button in Information PopUp menu
And User_615 Click on Close Button in Change Running Date Popup
And user_615 click the transactions in menu options
And user_615 click the maintenance in transactions 
And user_615 click and enter the value in trx type under transactions 
And user_615 click the transaction maintenance type icon
Then user_615 select the mode of payment under transactions
And user_615 enter the branch code value in debit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the currency value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the serial number in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 click currency field and enter the value
And user_615 click the transaction maintenance type icon
And user_615 click amount field and enter the value
And user_615 check if the  value is entered or not
And user_615 enter the branch code value in credit account details
And user_615 click the transaction maintenance type icon
And user_615 enter the GL code value in credit account details 
And user_615 click the transaction maintenance type icon
And user_615 enter the CIF code value in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 enter the serial no value in credit account details
And user_615 click the transaction maintenance type icon
And User_615 Click Ok Button in Information PopUp menu
And user_615 click save button in transactions menu
#And user Get the Transaction No in Success PopUp Menu
And User_615 Click Ok Button in Information PopUp menu
Then user_615 navigate to approve submenu
And user_615 click refresh icon in approve submenu
And user_615 retrieve the created record in approve submenu
And user_615 click approve button in approve submenu
Then user_615 verify the successfully approved message popup in approve submenu

@TRS_305
Scenario: Functional Testing - To Account Debited - No Future Value Date - No Charges - Account Sign Credit -  Overdrawn/ Transfer Main Credit - Base/ Base - Min SO exists















