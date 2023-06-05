Feature: Checking Multi Transfer Transaction - FC/ FC 

Scenario: Checking Multi Transfer (Main Credit) Transaction - FC/ FC Different
Given: User application login to CSM
Then User navigate to CSM application and login with valid credentials
And  User click the Transactions
Then Click the Maintenance Below the Transactions
And  enter the value in trx type
Then enter values of Branch code
And  enter values of Currency code
And  enter values of Gl code 
And  enter values of Cif code
Then enter values of serial 
Then System show the warning popup clikc ok button
And  user enter the currency
And  Enter the Amount in this Checkbox
And  click the save button
And  system show the popup success user click the ok button
And  User click the Approve screen     
Then user Enter the Transaction number   
And  double click the Value               
Then click the Approve button
And  system show the popup success user click the ok button   
And  User click the Maintenance screen
Then click the search button
And enter the trx number
And double click the data
Then click the Booked Entries