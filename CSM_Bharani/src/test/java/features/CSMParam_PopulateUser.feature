Feature: To check the functionality of Populate User Flag
@TSA_014
Scenario: Checking if only the “Approved” population tasks appear at the level of populate screen
Given navigate to CSM param application and login with valid credentials
And Click the Parameters Flag
Then Click the System Parameters Flag
And Click the User Flag under System Parameters Flag
Then Click the Populate user Flag under User Flag
And Click Maitenance Flag under Populate user Flag
Then Enter the code value under populate user maintenance screen
And Enter the brief description valuse under populate user maintenance screen
Then Enter the long description valuse under populate user maintenance screen
And Enter the brief description arabic values under populate user maintenance screen
Then Enter the long description arabic valuse under populate user maintenance screen
And Enter the user code value under populate user maintenance screen
Then Click the search icon in user code
And Click the addbutton icon under destination branches
Then Enter the branch code value under destination branches
And Enter the new user template value under destination branches
Then Click the save button under destination branches
And Click the Ok popup under maintenance flag
Then Click the Ok popup under the success popup
And Click the populate flag under Populate user
Then Enter the Population code under populate screen
And Click the Approve Flag under Populate user
Then Enter the approve code under approve Flag
And Select the entered value code under approve flag
And click on approve button in populate user
And Click Okpopup under Approve Screen
And Click the populate flag under Populate user
Then Again Enter the Population code under populate screen
And Double Click the Entered code under populate screen
Then Approve the selected code under populate screen
And Click okpopup under populate screen
Then Click okpop sucess under populate screen