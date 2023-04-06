Feature: To test the restriction under Accounts Screen
@SADS_AT_066
Scenario: Checking on the "OR" restriction for CIF Type “X” and GL “Z” under Accounts
Given navigate to CSM application and login with valid credentials
And click on accounts screen
And click on general accounts screen
And click on opening screen under general accounts
And enter the curency code in general accounts
And enter the account type code in general accounts
And enter the CIF number in general accounts screen
Then validate system through the restriction
