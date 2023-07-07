Feature: Checking the functionalities of transaction

  @TRS_170
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Charges - General (CIF2)-Account
    Given navigate to CSM application and login with valid credentials
    And User_612 update test data set id for TRS_170
    And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
   And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    And User_612 Click on Transactions under CSM application
    And User_612 Click on Maintenance under Transactions
    And User_612 Enter TRX Type in Maintenance Screen
    And User_612 Enter the Branch Code in debit Ac in Maintenance Screen
    And User_612 Enter Currency Code in debit Ac in Maintenance Screen
    And User_612 Enter GL Code in debit Ac in Maintenance Screen
    And User_612 Enter CIF Code in debit Ac in Maintenance Screen
    And User_612 Enter Serial in debit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Currency in Maintenance Screen
    And User_612 Enter the Amount in Maintenance Screen
    And user_612 check if the  value is entered or not
    And User_612 Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User_612 Enter Currency Code in Credit Ac in Maintenance Screen
    And User_612 Enter GL Code in Credit Ac in Maintenance Screen
    And User_612 Enter CIF Code in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter Serial in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Save Button in Maintenance Screen
    And User_612 Get the Transaction No in Success PopUp Menu for170
    And User_612 Click Ok Button in Success PopUp Menu
    And User_612 Click on Approve Screen under Transactions
    And User_612 Enter the Transaction No in Approve Screen
    And User_612 Double Click on the Transaction No
    And User_612 Click on Approve Button for approve the Transaction
    And User_612 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_612 Click on Maintenance under Transactions
    And User_612 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_612 Click on Search Button in Maintenance Screen
    And User_612 Enter the Transaction No in Search Box
    And User_612 Double Click on the Searched Transaction No in Search Box
    And User_612 Click on Booked Entries in Maintenance Screen

  @TRS_171_01
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Charges - Specific VsGeneral - Account
    Given navigate to CSM application and login with valid credentials
    And user_612 update test data set id for TRS_171_01
And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
   And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
     And User_612 Click on Transactions under CSM application
    And User_612 Click on Maintenance under Transactions
    And User_612 Enter TRX Type in Maintenance Screen
    And User_612 Enter the Branch Code in debit Ac in Maintenance Screen
    And User_612 Enter Currency Code in debit Ac in Maintenance Screen
    And User_612 Enter GL Code in debit Ac in Maintenance Screen
    And User_612 Enter CIF Code in debit Ac in Maintenance Screen
    And User_612 Enter Serial in debit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Currency in Maintenance Screen
    And User_612 Enter the Amount in Maintenance Screen
    And user_612 check if the  value is entered or not
    And User_612 Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User_612 Enter Currency Code in Credit Ac in Maintenance Screen
    And User_612 Enter GL Code in Credit Ac in Maintenance Screen
    And User_612 Enter CIF Code in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter Serial in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Save Button in Maintenance Screen
    And User_612 Get the Transaction No in Success PopUp Menu for171_01
    And User_612 Click Ok Button in Success PopUp Menu
    And User_612 Click on Approve Screen under Transactions
    And User_612 Enter the Transaction No in Approve Screen
    And User_612 Double Click on the Transaction No
    And User_612 Click on Approve Button for approve the Transaction
    And User_612 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_612 Click on Maintenance under Transactions
    And User_612 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_612 Click on Search Button in Maintenance Screen
    And User_612 Enter the Transaction No in Search Box
    And User_612 Double Click on the Searched Transaction No in Search Box
    And User_612 Click on Booked Entries in Maintenance Screen

  @TRS_171_02
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Debit Account - CIF Charges - Specific VsGeneral - Account
    Given navigate to CSM application and login with valid credentials
    And user_612 update test data set id for TRS_171_02
   And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
   And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    And User_612 Click on Transactions under CSM application
    And User_612 Click on Maintenance under Transactions
    And User_612 Enter TRX Type in Maintenance Screen
    And User_612 Enter the Branch Code in debit Ac in Maintenance Screen
    And User_612 Enter Currency Code in debit Ac in Maintenance Screen
    And User_612 Enter GL Code in debit Ac in Maintenance Screen
    And User_612 Enter CIF Code in debit Ac in Maintenance Screen
    And User_612 Enter Serial in debit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Currency in Maintenance Screen
    And User_612 Enter the Amount in Maintenance Screen
    And user_612 check if the  value is entered or not
    And User_612 Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User_612 Enter Currency Code in Credit Ac in Maintenance Screen
    And User_612 Enter GL Code in Credit Ac in Maintenance Screen
    And User_612 Enter CIF Code in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter Serial in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Save Button in Maintenance Screen
    And User_612 Get the Transaction No in Success PopUp Menu for171_02
    And User_612 Click Ok Button in Success PopUp Menu
    And User_612 Click on Approve Screen under Transactions
    And User_612 Enter the Transaction No in Approve Screen
    And User_612 Double Click on the Transaction No
    And User_612 Click on Approve Button for approve the Transaction
    And User_612 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_612 Click on Maintenance under Transactions
    And User_612 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_612 Click on Search Button in Maintenance Screen
    And User_612 Enter the Transaction No in Search Box
    And User_612 Double Click on the Searched Transaction No in Search Box
    And User_612 Click on Booked Entries in Maintenance Screen

  @TRS_172
  Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Credit Account - CIF Charges - Specific Used - Cash
    Given navigate to CSM application and login with valid credentials
    And user_612 update test data set id for TRS_172
    And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
   And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    And User_612 Click on Transactions under CSM application
    And User_612 Click on Maintenance under Transactions
    And User_612 Enter TRX Type in Maintenance Screen
    And User_612 Click a mode of payment in under Transaction
    And User_612 Enter a value currency  in mode of payment
    And User_612 Double the existing data in mode of payment
    And User_612 Enter the Branch Code in debit Ac in Maintenance Screen
    And User_612 Enter Currency Code in debit Ac in Maintenance Screen
    And User_612 Enter GL Code in debit Ac in Maintenance Screen
    And User_612 Enter CIF Code in debit Ac in Maintenance Screen
    And User_612 Enter Serial in debit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Currency in Maintenance Screen
    And User_612 Enter the Amount in Maintenance Screen
    And user_612 check if the  value is entered or not
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User_612 Enter Currency Code in Credit Ac in Maintenance Screen
    And User_612 Enter GL Code in Credit Ac in Maintenance Screen
    And User_612 Enter CIF Code in Credit Ac in Maintenance Screen
    #And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter Serial in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Save Button in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
     # And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Get the Transaction No in Success PopUp Menu for172
    And User_612 Click Ok Button in Success PopUp Menu
    And User_612 Click on Approve Screen under Transactions
    And User_612 Enter the Transaction No in Approve Screen
    And User_612 Double Click on the Transaction No
    #it show some popup error
    And User_612 Click on Approve Button for approve the Transaction
    And User_612 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_612 Click on Maintenance under Transactions
    And User_612 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_612 Click on Search Button in Maintenance Screen
    And User_612 Enter the Transaction No in Search Box
    And User_612 Double Click on the Searched Transaction No in Search Box
    And User_612 Click on Booked Entries in Maintenance Screen
    
    
@TRS_173
Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Credit Account - CIF Charges - Specific NOT Used - Cash
     Given navigate to CSM application and login with valid credentials 
    And user_612 update test data set id for TRS_173
    And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
   And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    And User_612 Click on Transactions under CSM application
    And User_612 Click on Maintenance under Transactions
    And User_612 Enter TRX Type in Maintenance Screen
    And User_612 Click a mode of payment in under Transaction
    And User_612 Enter a value currency  in mode of payment
    And User_612 Double the existing data in mode of payment
    And User_612 Enter the Branch Code in debit Ac in Maintenance Screen
    And User_612 Enter Currency Code in debit Ac in Maintenance Screen
    And User_612 Enter GL Code in debit Ac in Maintenance Screen
    And User_612 Enter CIF Code in debit Ac in Maintenance Screen
    And User_612 Enter Serial in debit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Currency in Maintenance Screen
    And User_612 Enter the Amount in Maintenance Screen
    And user_612 check if the  value is entered or not
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User_612 Enter Currency Code in Credit Ac in Maintenance Screen
    And User_612 Enter GL Code in Credit Ac in Maintenance Screen
    And User_612 Enter CIF Code in Credit Ac in Maintenance Screen
    #And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter Serial in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Save Button in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Get the Transaction No in Success PopUp Menu for173
    And User_612 Click Ok Button in Success PopUp Menu
    And User_612 Click on Approve Screen under Transactions
    And User_612 Enter the Transaction No in Approve Screen
    And User_612 Double Click on the Transaction No
    #it show some popup error
    And User_612 Click on Approve Button for approve the Transaction
    And User_612 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_612 Click on Maintenance under Transactions
    And User_612 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_612 Click on Search Button in Maintenance Screen
    And User_612 Enter the Transaction No in Search Box
    And User_612 Double Click on the Searched Transaction No in Search Box
    And User_612 Click on Booked Entries in Maintenance Screen

    
 @TRS_174   
    Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Credit Account - CIF Charges - General (CIF1) - Cash
    Given navigate to CSM application and login with valid credentials
    And user_612 update test data set id for TRS_174
    And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
   And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    And User_612 Click on Transactions under CSM application
    And User_612 Click on Maintenance under Transactions
    And User_612 Enter TRX Type in Maintenance Screen
    And User_612 Click a mode of payment in under Transaction
    And User_612 Enter a value currency  in mode of payment
    And User_612 Double the existing data in mode of payment
    And User_612 Enter the Branch Code in debit Ac in Maintenance Screen
    And User_612 Enter Currency Code in debit Ac in Maintenance Screen
    And User_612 Enter GL Code in debit Ac in Maintenance Screen
    And User_612 Enter CIF Code in debit Ac in Maintenance Screen
    And User_612 Enter Serial in debit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Currency in Maintenance Screen
    And User_612 Enter the Amount in Maintenance Screen
    And user_612 check if the  value is entered or not
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User_612 Enter Currency Code in Credit Ac in Maintenance Screen
    And User_612 Enter GL Code in Credit Ac in Maintenance Screen
    And User_612 Enter CIF Code in Credit Ac in Maintenance Screen
    #And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter Serial in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Save Button in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
     #And User_612 Click Ok Button in Warning PopUp Menu for175
        And User_612 Get the Transaction No in Success PopUp Menu for174
    And User_612 Click Ok Button in Success PopUp Menu
    And User_612 Click on Approve Screen under Transactions
    And User_612 Enter the Transaction No in Approve Screen
    And User_612 Double Click on the Transaction No
    #it show some popup error
    And User_612 Click on Approve Button for approve the Transaction
    And User_612 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_612 Click on Maintenance under Transactions
    And User_612 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_612 Click on Search Button in Maintenance Screen
    And User_612 Enter the Transaction No in Search Box
    And User_612 Double Click on the Searched Transaction No in Search Box
    And User_612 Click on Booked Entries in Maintenance Screen
    
    @TRS_175
    Scenario: Checking Single Transfer (Main Debit) Intra Transaction - Deduct Charges from Credit Account - CIF Charges - General (CIF2) Cash
    Given navigate to CSM application and login with valid credentials
    And user_612 update test data set id for TRS_175
   And User_612 Click on Date to Change the Current Date
    And User_612 Enter the Date in User Running Date
    And User_612 Click on Use Button in Change Running Date Popup
    And User Click Ok Button for confirmation PopUp for Company Holiday
    And User_612 Click Ok Button in Information PopUp menu
    And User_612 Click on Close Button in Change Running Date Popup
   And User_612 Click on Technical Details Icon
    And User_612 Click Clear Cache in Technical Details Icon
    And User_612 Click Ok Button Under Information PopUp Menu
    And User_612 Click on Transactions under CSM application
    And User_612 Click on Maintenance under Transactions
    And User_612 Enter TRX Type in Maintenance Screen
    And User_612 Click a mode of payment in under Transaction
    And User_612 Enter a value currency  in mode of payment
    And User_612 Double the existing data in mode of payment
    And User_612 Enter the Branch Code in debit Ac in Maintenance Screen
    And User_612 Enter Currency Code in debit Ac in Maintenance Screen
    And User_612 Enter GL Code in debit Ac in Maintenance Screen
    And User_612 Enter CIF Code in debit Ac in Maintenance Screen
    And User_612 Enter Serial in debit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Currency in Maintenance Screen
    And User_612 Enter the Amount in Maintenance Screen
    And user_612 check if the  value is entered or not
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter the Branch Code in Credit Ac in Maintenance Screen
    #And User_612 Enter Currency Code in Credit Ac in Maintenance Screen
    And User_612 Enter GL Code in Credit Ac in Maintenance Screen
    And User_612 Enter CIF Code in Credit Ac in Maintenance Screen
    #And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Enter Serial in Credit Ac in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu
    And User_612 Click Save Button in Maintenance Screen
    And User_612 Click Ok Button in Warning PopUp Menu for175
    And User_612 Get the Transaction No in Success PopUp Menu for175
    And User_612 Click Ok Button in Success PopUp Menu
    And User_612 Click on Approve Screen under Transactions
    And User_612 Enter the Transaction No in Approve Screen
    And User_612 Double Click on the Transaction No
    #it show some popup error
    And User_612 Click on Approve Button for approve the Transaction
    And User_612 Click on Ok Button in Success PopUp Menu for Approve Transcation
    And User_612 Click on Maintenance under Transactions
    And User_612 Click Ok Button in Warning PopUp to go back to Maintenance
    And User_612 Click on Search Button in Maintenance Screen
    And User_612 Enter the Transaction No in Search Box
    And User_612 Double Click on the Searched Transaction No in Search Box
    And User_612 Click on Booked Entries in Maintenance Screen
    

