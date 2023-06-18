Feature: To test the practice website
@Test_Case_01
Scenario: Login with practice website with valid user name and password
Given navigate to practice website
And get the test data for possitive test case
And enter the user name
And enter the password
And click on login button
Then verify system should login successfully
@Test_Case_02
Scenario: Login with practice website with invaid user name and password
Given navigate to practice website
And get the test data for negative test case
And enter the user name
And enter the password
And click on login button
Then verify system should not login successfully
