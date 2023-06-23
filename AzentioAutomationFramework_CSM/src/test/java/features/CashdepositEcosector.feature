Feature: User Create in Eco Sector cash deposit transaction
Scenario: Checking Cash Withdrawal Transaction - Eco Sector Withdrawal Limit Defined - Warn User if Limit Exceeds UnChecked - Amount > Limit - Specific vs. General
Given user login as csm params application
And user update test data set id for TRS_122_01 
And user click parameters menu
And user click system parameters submenu
#And user click user submenu
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
Given navigate to CSM application and login with valid credentialsss
And User Click on Date to Change the Current Date
And User Enter the Date in User Running Date
And User Click on Use Button in Change Running Date Popupss1
And User Click Ok Button in Information PopUp menu
And User Click on Close Button in Change Running Date Popupss1
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
