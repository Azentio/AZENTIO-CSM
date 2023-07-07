Feature: To check the functionalitites of TransactionStaffAccounts request
@tag
Scenario: duplicate failure
And User_613 click the Transfer Accounts
Then User_613 click the Maintance under Transfer account
And User_613 Select the Transfer type from GL to GL
Then User_613 Enter the value in Cif 
And User_613 Enter the original GL
Then User_613 Enter the Destination GL
And User_613 Enter the Reason field 
Then User_613 click the Set Exception  
And User_613 Select the exception factor in Ranking
Then User_613 Select the value in Set Exception
And User_613 Click the ok button 
Then User_613 click the Retrive button
And User_613 Click the Update After Approve in control record
And User_613 click the No Access privilege 
