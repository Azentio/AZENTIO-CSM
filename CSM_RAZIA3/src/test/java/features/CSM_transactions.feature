Feature: Checking the functionalities of transaction

  @TRS_029
  Scenario: Checking Multi Transfer (Main Credit) Transaction - CV/FC
    Given Navigate to CSM application and login with valid credentials
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
    #And user update test data set id for TRS_029
    And User Enter TRX Type in Maintenance Screen
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Click the Account Details in Maintenance Screen
    And User Click Add button in AccountDetails
    And User Enter the Branch in AccountDetails
    And User Enter the Gl in AccountDetails
    And user Enetr the cif in AccountDetails
    And User Enter the Serial in AccountDetails
    And User Enter the Amount in AccountDetails
    And User give some Msg Instruction1 in AccountDetails
    And User give some Msg Instruction2 in AccountDetails
    And User Click the ok button in AccountDetails
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

  @TRS_030
  Scenario: Checking Cash Deposit Transaction - FC/ CV
    Given navigate to CSM application and login with valid credentials
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

  @TRS_031
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - FC/CV
    Given navigate to CSM application and login with valid credentials
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
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

  @TRS_032
  Scenario: Checking Multi Transfer (Main Credit) Transaction - FC/CV
    Given navigate to CSM application and login with valid credentials
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
    And User Click the Account Details in Maintenance Screen
    And User Click Add button in AccountDetails
    And User Enter the Branch in AccountDetails
    And User Enter the Gl in AccountDetails
    And user Enetr the cif in AccountDetails
    And User Enter the Serial in AccountDetails
    And User Enter the Amount in AccountDetails
    And User give some Msg Instruction1 in AccountDetails
    And User give some Msg Instruction2 in AccountDetails
    And User Click the ok button in AccountDetails
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

  @TRS_033
  Scenario: Checking Cash Deposit Transaction - FC/ FC Same
    Given navigate to CSM application and login with valid credentials
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
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

  @TRS_034
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction  FC/ FC Same
    Given navigate to CSM application and login with valid credentials
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    And User Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User Enter Currency Code in Credit Ac in Maintenance Screen
    And User Enter GL Code in Credit Ac in Maintenance Screen
    And User Enter CIF Code in Credit Ac in Maintenance Screen
    And User Enter Serial in Credit Ac in Maintenance Screen
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
    
    
@TRS_071   
Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined - Warn User if Limit Exceeds Checked Amount < Limit

 Given navigate to CSM application and login with valid credentials
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
     And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
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
    

    
    

  @TRS_072
  Scenario: Checking Cash Withdrawal Transaction- Currency Withdrawal Limit Defined -Warn User if Limit Exceeds Checked  Amount > Limit
    Given navigate to CSM application and login with valid credentials
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
    And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
    And User Click Ok Button in Warning PopUp Menu
    And User Enter the Currency in Maintenance Screen
    And User Enter the Amount in Maintenance Screen
    
 
  @TRS_73_01
  Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined and Warn User if Limit Exceeds Checked and Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSMparam application and login with valid credentials
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
    And user click the update after approve screen
    And user click and send the values in user id under update after approve screen
    And user double click the user id
    And User click the Limit button  in update after approve screen
    And user  click add button under Limits
    And user enter the value of currency in Limits
    And User enter the Transaction type in Limits
    And User enter value with WdLimit in Limits
    And User check the with warnuserlimit in Limit
    And User check the proceediflimit in Limit
    And user click the ok button under limit
    And user click the update after approve button
    And user click the save ok button
    And user click the ok
    And user click the approve in user screen
    And user click and send the values in user id under Approve screen
    And user double click the user id in approve screen
    And user click the approve box
    And user click the save ok button
    And user click the ok
    
    @TRS_73_02 
    Scenario: Checking Cash Withdrawal Transaction Currency Withdrawal Limit Defined and Warn User if Limit Exceeds Checked and Proceed if Limit Exceeds Checked - Amount > Limit
    Given navigate to CSM application and login with valid credentials
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
     And User Enter the Branch Code in debit Ac in Maintenance Screen
    And User Enter Currency Code in debit Ac in Maintenance Screen
    And User Enter GL Code in debit Ac in Maintenance Screen
    And User Enter CIF Code in debit Ac in Maintenance Screen
    And User Enter Serial in debit Ac in Maintenance Screen
    And User Click Ok Button in Warning PopUp Menu
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
   
  #param
   @TRS_069
   Scenario: Checking Cash Withdrawal Transaction - Proceed on Insufficient Fund unchecked And Allow Overdraw unchecked And Force Overdraw checked
    Given navigate to CSMparam application and login with valid credentials
    And user click the parameters menu
    And user click the system parameters submenu
    And user click the User screen in system parameters
     And user click the transationtype submenu under systemparameters
    And user click the updateafterapprove menu under transationtype
   # And user Enter the code in inputfield on updateafterapprove screen under transactiontype for TRS_063
    And User double click the record under updateafterapprove screen
    And User Check the ProceedOnInsufficientFund chequebox
    And user chek the Force overdrawn
    And user click UpdateAfterApprove Button
    And user click the save ok button
    And user click the ok
    And user click Approve field under TransactionType
    And user Enter the code in Approve field
    And user double click the code on Approve field
    And user click Approve Button
    And user click the save ok button
    And user click the ok
       And user click the AccountParameter submenu under Parameters
    And user click the AccountType under AccountParameters
    And user click the UPA field under AccountTypes
    And user Enter the TypeCode in UPA field
    And user double click the TypeCode in UPA field
    And user click the Instructions in AccountTypes
    And user deal with AllowAccess checkBox under Instructions
    And user click UPA Button
    And user click the save ok button
    And user click the ok
    And user click the Approve field under AccountTypes
    And user Enter the TypeCode in Approve Field
    And user double click the Typecode in Approve field
    And user click the Approve button
    And user click the save ok button
    And user click the ok

   
    
    
    
