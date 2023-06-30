Feature: Checking the functionality of transactions

  @TRS_008
  Scenario: Transactions -> Maintenance screen -  No access to Economic sector.
    #For this test case we have to create an account based on Eco Sector
    #In User_614 we remove that Eco Sector and do to transaction
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
    And User_614 Enter TRX Type in Maintenance Screen for TRS_008
    And User_614 Enter the Branch Code in Credit Ac in Maintenance Screen
    And User_614 Enter Currency Code in Credit Ac in Maintenance Screen
    And User_614 Enter GL Code in Credit Ac in Maintenance Screen for TRS_008
    And User_614 Enter CIF Code in Credit Ac in Maintenance Screen for TRS_008
    #And User_614 Click Close Button in View Memo Popup menu
    And User_614 Enter Serial in Credit Ac in Maintenance Screen
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_010
    And User_614 Enter the Amount under Maintenance Screen
    Then User_614 Validate User_614 Does Not have Access On this TRX type 377 For the Economic Sector 4 Of This CIF
    And User_614 Click Ok Button in Cannot Proceed PopUp Menu

  @TRS_009
  Scenario: Transactions -> Maintenance screen -  No access to Currency.
    #For this test case we have to create an account using different currency other than 840
    #In User_614 we remove the currency in Balance and Limit and than add the currency in Account and configure
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
    #And User_614 Click Close Button in View Memo Popup menu
    And User_614 Enter Serial in Credit Ac in Maintenance Screen
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen
    And User_614 Enter the Amount under Maintenance Screen
    Then User_614 Validate User_614 does not have rights to trade with selected Currency 144
    And User_614 Click Ok Button in CannotProceed Popup Menu

  @TRS_010
  Scenario: Checking Cash Deposit Transaction - Booked Entries + Balance Updates
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
    And User_614 Enter the Currency in Maintenance Screen for TRS_010
    And User_614 Enter the Amount in Maintenance Screen
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  #Check Booked Entries
  #And User_614 Click on Queries under CSM application
  #And User_614 Click on Statement Of Accounts in Queries under CSM application
  #And User_614 Click on By Trade Date under Statement Of Accounts Sub Menu
  #And User_614 Enter the Currency Value in Account under By Trade Date Screen
  #And User_614 Enter the GL Code in Account under By Trade Date Screen
  #And User_614 Enter the CIF Code in Account under By Trade Date Screen
  #And User_614 Enter the Serial in Account under By Trade Date Screen
  #And User_614 Enter From Date in Periodicity Of Statement under By Trade Date Screen
  #And User_614 Enter To Date in Periodicity Of Statement under By Trade Date Screen
  #And User_614 Click Retrieve Button under By Trade Date Screen
  #Get OP No value in excel data
  #And User_614 Enter the Op No in By Trade Date Screen
  #Then User_614 Validate the Credit Amount in By Trade Date Screen
  @TRS_011
  Scenario: Checking Cash Withdrawal Transaction - Booked Entries + Balance Updates
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
    And User_614 Enter Withdrawal TRX Type in Maintenance Screen
    #And User_614 Enter the Branch Code in Debit Ac in Maintenance Screen
    And User_614 Enter Currency Code in Debit Ac in Maintenance Screen
    And User_614 Enter GL Code in Debit Ac in Maintenance Screen
    And User_614 Enter CIF Code in Debit Ac in Maintenance Screen
    And User_614 Enter Serial in Debit Ac in Maintenance Screen
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen
    And User_614 Enter the Amount for Debit in Maintenance Screen
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menu
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screen
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Box
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  #Check Booked Entries
  #And User_614 Click on Queries under CSM application
  #And User_614 Click on Statement Of Accounts in Queries under CSM application
  #And User_614 Click on By Trade Date under Statement Of Accounts Sub Menu
  #And User_614 Enter the Currency Value in Account under By Trade Date Screen
  #And User_614 Enter the GL Code in Account under By Trade Date Screen
  #And User_614 Enter the CIF Code in Account under By Trade Date Screen
  #And User_614 Enter the Serial in Account under By Trade Date Screen
  #And User_614 Enter From Date in Periodicity Of Statement under By Trade Date Screen
  #And User_614 Enter To Date in Periodicity Of Statement under By Trade Date Screen
  #And User_614 Click Retrieve Button under By Trade Date Screen
  #Get OP No value in excel data
  #And User_614 Enter the Op No in By Trade Date Screen
  #Then User_614 Validate the Debit Amount in By Trade Date Screen
  @TRS_012
  Scenario: Transactions -> Checking Single transfer(Main Debt) - Intraday + Booked Enteries + Balance updates
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
    And User_614 enters the transaction type
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_098 and TRS_103

    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_010
    And User_614 Enter the Amount for Debit in Maintenance Screen
    And User_614 Enter the Branch Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    #And User_614 Enter Currency Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Serial in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screen
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Box
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  #Check Booked Entries
  #And User_614 Click on Queries under CSM application
  #And User_614 Click on Statement Of Accounts in Queries under CSM application
  #And User_614 Click on By Trade Date under Statement Of Accounts Sub Menu
  #And User_614 Enter the GL Code in Account under By Trade Date Screens
  #And User_614 Enter From Date in Periodicity Of Statement under By Trade Date Screen
  #And User_614 Enter To Date in Periodicity Of Statement under By Trade Date Screen
  #And User_614 Click Retrieve Button under By Trade Date Screen
  @TRS_013
  Scenario: Transactions -> Checking Single Transfer (Main Credit) Intra Transaction - Booked Entries + Balance Updates
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
    And User_614 enters the Main credit transaction type
    And User_614 enters the GL code for debit account
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_010
    And User_614 Enter the Amount for Debit in Maintenance Screen
    #And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 enters the GL code for credit account
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  #Check Booked Entries
  #And User_614 Click on Queries under CSM application
  #And User_614 Click on Statement Of Accounts in Queries under CSM application
  #And User_614 Click on By Trade Date under Statement Of Accounts Sub Menu
  #And User_614 Enter the GL Code in Account under By Trade Date Screens
  #And User_614 Enter From Date in Periodicity Of Statement under By Trade Date Screen
  #And User_614 Enter To Date in Periodicity Of Statement under By Trade Date Screen
  #And User_614 Click Retrieve Button under By Trade Date Screen
  #Get OP No value in excel data
  #And User_614 Enter the Op No in By Trade Date Screen
  #Then User_614 Validate the Debit Amount in By Trade Date Screen
  #And User_614 Click on By Trade Date under Statement Of Accounts Sub Menu
  #And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
  #And User_614 enters the GL code for the second account
  #And User_614 Click Retrieve Button under By Trade Date Screen

  @TRS_051
  Scenario: Transactions -> Checking Multi Transfer (Main Credit) Transaction - Interbranch
    Given User_614 Navigate to CSM application and login with valid credentials
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User_614 Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the Multi Transfer Main Credit Transaction Interbranch transaction type
    And User_614 Enter the Branch Code in Credit Ac in Maintenance Screen for TRS_0051
    And User_614 Enter Currency Code in Credit Ac in Maintenance Screen for TRS_0051
    And User_614 Enter GL Code in Credit Ac in Maintenance Screen for TRS_0051
    And User_614 Enter CIF Code in Credit Ac in Maintenance Screen for TRS_0051
    And User_614 Enter Serial in Credit Ac in Maintenance Screen for TRS_0051
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_0051
    And User_614 Enter the Amount in Maintenance Screen for TRS_0051
    And User_614 click on the account details button
    And User_614 clicks on the plus icon to add the account details
    And User_614 double clicks on the branch code in Ac1 in add account details
    And User_614 Enter the Branch Code in Debit Ac1 in Maintenance Screen for TRS_0051
    #And User_614 Enter Currency Code in Debit Ac1 in Maintenance Screen for TRS_0051
    And User_614 Enter GL Code in Debit Ac1 in Maintenance Screen for TRS_0051
    And User_614 Enter CIF Code in Debit Ac1 in Maintenance Screen for TRS_0051
    And User_614 Enter Serial in Debit Ac1 in Maintenance Screen for TRS_0051
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the debit amount for Ac1 for TRS_0051
    And User_614 clicks on the plus icon to add the account details
    And User_614 double clicks on the branch code in Ac2 in add account details
    And User_614 double clicks on the branch code in Ac2 in add account details
    And User_614 Enter the Branch Code in Debit Ac2 in Maintenance Screen for TRS_0051
    #And User_614 Enter Currency Code in Debit Ac2 in Maintenance Screen for TRS_0051
    And User_614 Enter GL Code in Debit Ac2 in Maintenance Screen for TRS_0051
    And User_614 Enter CIF Code in Debit Ac2 in Maintenance Screen for TRS_0051
    And User_614 Enter Serial in Debit Ac2 in Maintenance Screen for TRS_0051
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the debit amount for Ac2 for TRS_0051
    And User_614 clicks on the ok button after adding the debit account details
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  @TRS_052_01
  Scenario: Checking Cash Deposit Transaction - Interbranch - Prerequisites ( Enable Multi Branch flag - Check )
    Given User_614 Navigate to CSMParam application and login with valid credentials
    And User_614 Click on Parameters under CSMParam Application
    And User_614 Click on System Parameters under Parameters Main Menu
    And User_614 Click on Transaction Type under System Parameters Sub Menu
    And User_614 Click on Update After Approve in Transaction Type under System Parameters Sub Menu
    And User_614 Enter the Trx Type in Code under Update After Approve Screen
    And Use Double Click on the Searched Code in Update After Approve Screen
    And User_614 Check the Enable Multi Branch flag in Update After Approve Screen
    And User_614 Click on Update After Approve button in Update After Approve Screen
    And User_614 Click Ok Button in Confirm PopUp Menu in Update After Approve Screen
    And User_614 Click Ok Button in Success PopUp Menu in Update After Approve Screen
    And User_614 Click on Approve under Transaction Type
    And User_614 Enter the Trx Type in Code under Approve Screen
    And User_614 Double Click on the Searched Code in Approve Screen
    And User_614 Click on Approve Button in Approve Screen under System Parameters
    And User_614 Click on Ok Button in Confirm PopUp under Approve Screen
    And User_614 Click on Ok Button in Success PopUp under Approve Screen

  @TRS_052_02
  Scenario: Checking Cash Deposit Transaction - Interbranch
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
    And User_614 Enter the Currency in Maintenance Screen
    And User_614 Enter the Value Date in Maintenance Screen
    And User_614 Enter the Amount in Maintenance Screen
    #And User_614 Enter the Amount under Maintenance Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menu
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screen
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    Then User_614 Validate the Stopper Message in Cannot Proceed PopUp Menu
    And User_614 Click Ok Button in Cannot Proceed PopUp Menu in Maintenance

  @TRS_052_03
  Scenario: Checking Cash Deposit Transaction - Interbranch - Prerequisites ( Enable Multi Branch flag - UnCheck )
    Given User_614 Navigate to CSMParam application and login with valid credentials
    And User_614 Click on Parameters under CSMParam Application
    And User_614 Click on System Parameters under Parameters Main Menu
    And User_614 Click on Transaction Type under System Parameters Sub Menu
    And User_614 Click on Update After Approve in Transaction Type under System Parameters Sub Menu
    And User_614 Enter the Trx Type in Code under Update After Approve Screen
    And Use Double Click on the Searched Code in Update After Approve Screen
    And User_614 Uncheck the Enable Multi Branch flag in Update After Approve Screen
    And User_614 Click on Update After Approve button in Update After Approve Screen
    And User_614 Click Ok Button in Confirm PopUp Menu in Update After Approve Screen
    And User_614 Click Ok Button in Success PopUp Menu in Update After Approve Screen
    And User_614 Click on Approve under Transaction Type
    And User_614 Enter the Trx Type in Code under Approve Screen
    And User_614 Double Click on the Searched Code in Approve Screen
    And User_614 Click on Approve Button in Approve Screen under System Parameters
    And User_614 Click on Ok Button in Confirm PopUp under Approve Screen
    And User_614 Click on Ok Button in Success PopUp under Approve Screen

  @TRS_053_01
  Scenario: Checking Cash Deposit Transaction - Interbranch
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
    #And User_614 Enter the Branch Code in Credit Ac in Maintenance Screen
    And User_614 Enter Currency Code in Credit Ac in Maintenance Screen
    And User_614 Enter GL Code in Credit Ac in Maintenance Screen
    And User_614 Enter CIF Code in Credit Ac in Maintenance Screen
    And User_614 Enter Serial in Credit Ac in Maintenance Screen
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen
    And User_614 Enter the Value Date in Maintenance Screen
    And User_614 Enter the Amount in Maintenance Screen
    #And User_614 Enter the Amount under Maintenance Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menu
    And User_614 Click Ok Button in Success PopUp Menu

  @TRS_053_02
  Scenario: Checking Cash Deposit Transaction - Interbranch - Prerequisites ( Allow Back dated Value Date flag  and Allow Post dated Value Date flag - UCheck )
    Given User_614 Navigate to CSMParam application and login with valid credentials
    And User_614 Click on Parameters under CSMParam Application
    And User_614 Click on System Parameters under Parameters Main Menu
    And User_614 Click on Transaction Type under System Parameters Sub Menu
    And User_614 Click on Update After Approve in Transaction Type under System Parameters Sub Menu
    And User_614 Enter the Trx Type in Code under Update After Approve Screen
    And Use Double Click on the Searched Code in Update After Approve Screen
    And User_614 UnCheck the Allow Back dated Value Date flag in Update After Approve Screen
    And User_614 UnCheck the Allow Post dated Value Date flag in Update After Approve Screen
    And User_614 Click on Update After Approve button in Update After Approve Screen
    And User_614 Click Ok Button in Confirm PopUp Menu in Update After Approve Screen
    And User_614 Click Ok Button in Success PopUp Menu in Update After Approve Screen
    And User_614 Click on Approve under Transaction Type
    And User_614 Enter the Trx Type in Code under Approve Screen
    And User_614 Double Click on the Searched Code in Approve Screen
    And User_614 Click on Approve Button in Approve Screen under System Parameters
    And User_614 Click on Ok Button in Confirm PopUp under Approve Screen
    And User_614 Click on Ok Button in Success PopUp under Approve Screen

  @TRS_053_03
  Scenario: Checking Cash Deposit Transaction - Interbranch
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
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Box
    And User_614 Double Click on the Searched Transaction No in Search Box
    Then User_614 Validate if the Value Date field is Disable

  @TRS_053_04
  Scenario: Checking Cash Deposit Transaction - Interbranch - Prerequisites ( Allow Back dated Value Date flag  and Allow Post dated Value Date flag - Check )
    Given User_614 Navigate to CSMParam application and login with valid credentials
    And User_614 Click on Parameters under CSMParam Application
    And User_614 Click on System Parameters under Parameters Main Menu
    And User_614 Click on Transaction Type under System Parameters Sub Menu
    And User_614 Click on Update After Approve in Transaction Type under System Parameters Sub Menu
    And User_614 Enter the Trx Type in Code under Update After Approve Screen
    And Use Double Click on the Searched Code in Update After Approve Screen
    And User_614 Check the Allow Back dated Value Date flag in Update After Approve Screen
    And User_614 Check the Allow Post dated Value Date flag in Update After Approve Screen
    And User_614 Click on Update After Approve button in Update After Approve Screen
    And User_614 Click Ok Button in Confirm PopUp Menu in Update After Approve Screen
    And User_614 Click Ok Button in Success PopUp Menu in Update After Approve Screen
    And User_614 Click on Approve under Transaction Type
    And User_614 Enter the Trx Type in Code under Approve Screen
    And User_614 Double Click on the Searched Code in Approve Screen
    And User_614 Click on Approve Button in Approve Screen under System Parameters
    And User_614 Click on Ok Button in Confirm PopUp under Approve Screen
    And User_614 Click on Ok Button in Success PopUp under Approve Screen

  @TRS_054
  Scenario: Transactions -> Checking Cash Deposit Transaction - Booked Entries + Balance Updates
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
    And User_614 enters the transaction type for deposit account with AC CY and Trx CY must be same
    And User_614 enters the GL code for credit account for deposit account with AC CY and Trx CY must be same
    And User_614 validate the currency code for the transaction currency and the account currency
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Amount for Debit in Maintenance Screen
    And User_614 Click Save Button in Maintenance Screens
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation

  @TRS_055
  Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Booked Entries + Balance Updates
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
    And User_614 enters the transaction type for main debt account with AC CY and Trx CY must be same
    And User_614 enters the GL code for debit account
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 validate the currency code for the transaction currency and the account currency
    And User_614 Enter the Amount for Debit in Maintenance Screen
    And User_614 enters the GL code for credit account
    And User_614 Click Save Button in Maintenance Screens
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen
    #Check Booked Entries
    #And User_614 Click on Queries under CSM application
    #And User_614 Click on Statement Of Accounts in Queries under CSM application
    #And User_614 Click on By Trade Date under Statement Of Accounts Sub Menu
    #And User_614 Enter the GL Code in Account under By Trade Date Screens
    #And User_614 Enter From Date in Periodicity Of Statement under By Trade Date Screen
    #And User_614 Enter To Date in Periodicity Of Statement under By Trade Date Screen
    #And User_614 Click Retrieve Button under By Trade Date Screen
    #Get OP No value in excel data
    #And User_614 Enter the Op No in By Trade Date Screen
    #Then User_614 Validate the Debit Amount in By Trade Date Screen
    #And User_614 Click on By Trade Date under Statement Of Accounts Sub Menu
    #And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    #And User_614 enters the GL code for the second account
    #And User_614 Click Retrieve Button under By Trade Date Screen

  @TRS_056
  Scenario: Transactions -> Checking Cash Deposit Transaction - Booked Entries + Balance Updates
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
    And User_614 enters the transaction type for deposit account with AC CY equal to Trx CY
    And User_614 enters the GL code for credit account for deposit account with AC CY equal to Trx CY
    And User_614 validate the currency code for the transaction currency and the account currency
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Amount for Debit in Maintenance Screen
    And User_614 Click Save Button in Maintenance Screens
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation

  @TRS_098
  Scenario: Transactions -> Checking Cash Withdrawal Transaction - CIF Type Withdrawal Limit Defined - Warn User_614 if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User_614 Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_098
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter the Amount in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Click Ok Button in Warning PopUp Menus
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click Ok Button in Warning PopUp Menus
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation

  @TRS_099
  Scenario: Transactions -> Checking Cash Withdrawal Transaction - CIF Type Withdrawal Limit Defined - Warn User_614 if Limit Exceeds UnChecked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User_614 Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_099
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_099
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_099
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_099
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_099
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_099
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_099
    And User_614 Enter the Amount in Maintenance Screen for TRS_099
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation

  @TRS_100
  Scenario: Transactions -> Checking Cash Withdrawal Transaction - CIF Type Withdrawal Limit Defined - Warn User_614 if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User_614 Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_100
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_100
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_100
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_100
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_100
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_100
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_100
    And User_614 Enter the Amount in Maintenance Screen for TRS_100
    And User_614 Click Ok Button in Warning PopUp Menu

  @TRS_101
  Scenario: Transactions -> Checking Cash Deposit Transaction - CIF Type Deposit Limit Defined - Warn User_614 if Limit Exceeds Checked - Amount < Limit
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User_614 Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_101
    #And User_614 Enter the Branch Code in Credit Ac in Maintenance Screen for TRS_101
    And User_614 Enter Currency Code in Credit Ac in Maintenance Screen for TRS_101
    And User_614 Enter GL Code in Credit Ac in Maintenance Screen for TRS_101
    And User_614 Enter CIF Code in Credit Ac in Maintenance Screen for TRS_101
    And User_614 Enter Serial in Credit Ac in Maintenance Screen for TRS_101
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_101
    And User_614 Enter the Amount in Maintenance Screen for TRS_101
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation

  @TRS_102
  Scenario: Transactions -> Checking Cash Depsoit Transaction - CIF Type Deposit Limit Defined - Warn User_614 if Limit Exceeds Checked - Amount > Limit
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User_614 Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_102
    #And User_614 Enter the Branch Code in Credit Ac in Maintenance Screen for TRS_102
    And User_614 Enter Currency Code in Credit Ac in Maintenance Screen for TRS_102
    And User_614 Enter GL Code in Credit Ac in Maintenance Screen for TRS_102
    And User_614 Enter CIF Code in Credit Ac in Maintenance Screen for TRS_102
    And User_614 Enter Serial in Credit Ac in Maintenance Screen for TRS_102
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_102
    And User_614 Enter the Amount in Maintenance Screen for TRS_102
    And User_614 Click Ok Button in Warning PopUp Menu

  @TRS_103
  Scenario: Transactions -> Checking Cash Deposit Transaction - CIF Type Deposit Limit Defined - Warn User_614 if Limit Exceeds Checked - Proceed if Limit Exceeds Checked - Amount > Limit
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User_614 Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_103
    #And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Enter the Amount in Maintenance Screen for TRS_098 and TRS_103
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Click Ok Button in Warning PopUp Menus
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click Ok Button in Warning PopUp Menus
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation

  @TRS_182
  Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Charges - Specific Used - Account - Cancel
    #CSM Params ----->
    Given User_614 Navigate to CSM params application and login with valid credentialsVimal
    #And User_614 Click on Date to Change the Current Date
    #And User_614 Enters the Date in User Running Date
    #And User_614 Click on Use Button in Change Running Date Popup
    #And User_614 Click Ok Button in Information PopUp menu
    #And User_614 Click on Close Button in Change Running Date Popup
    #And User_614 Click on Technical Details Icon
    #And User_614 Click Clear Cache in Technical Details Icon
    #And User_614 Click Ok Button Under Information PopUp Menu
    #CSM Admin ----->
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_182
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    #And User_614 Enter the Currency in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Amount in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Branch Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    #And User_614 Enter Currency Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Serial in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  @TRS_183
  Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - Account Charges - Specific Used - Account
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_183
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Amount in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Branch Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    #And User_614 Enter Currency Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Serial in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  @TRS_184
  Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - Account Charges - Specific NOT Used - Account
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_184
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_184
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Amount in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Branch Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    #And User_614 Enter Currency Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_184
    And User_614 Enter Serial in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  @TRS_185
  Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - GL Charges - Specific Used - Account
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_185
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Amount in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Branch Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    #And User_614 Enter Currency Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Serial in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  @TRS_186
  Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - GL Charges - Specific NOT Used - Account
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_186
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_186
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_186
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Amount in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Branch Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    #And User_614 Enter Currency Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_186
    And User_614 Enter Serial in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen

  @TRS_187
  Scenario: Transactions -> Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - GL Charges - General (CIF1) - Account
    Given User_614 Navigate to CSM application and login with valid credentialsVimal
    And User_614 Click on Date to Change the Current Date
    And User_614 Enters the Date in User Running Date
    And User_614 Click on Use Button in Change Running Date Popup
    And User_614 Click Ok Button in Information PopUp menu
    And User_614 Click on Close Button in Change Running Date Popup
    And User_614 Click on Technical Details Icon
    And User_614 Click Clear Cache in Technical Details Icon
    And User_614 Click Ok Button Under Information PopUp Menu
    And User_614 Click on Transactions under CSM application
    And User_614 Click on Maintenance under Transactions
    And User_614 enters the transaction type for TRS_187
    And User_614 Enter the Branch Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Currency Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Serial in debit Ac in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Enter the Currency in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Amount in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter the Branch Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    #And User_614 Enter Currency Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter GL Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter CIF Code in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Enter Serial in credit Ac2 in Maintenance Screen for TRS_182 and TRS_187
    And User_614 Click Ok Button in Warning PopUp Menu
    And User_614 Click Save Button in Maintenance Screen
    And User_614 Get the Transaction No in Success PopUo Menus
    And User_614 Click Ok Button in Success PopUp Menu
    And User_614 Click on Approve Screen under Transactions
    And User_614 Enter the Transaction No in Approve Screens
    And User_614 Double Click on the Transaction No
    And User_614 Click on Approve Button for approve the Transaction
    And User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_614 Click on Maintenance under Transactions
    And User_614 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_614 Click on Search Button in Maintenance Screen
    And User_614 Enter the Transaction No in Search Boxs
    And User_614 Double Click on the Searched Transaction No in Search Box
    And User_614 Click on Booked Entries in Maintenance Screen
