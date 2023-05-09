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
And click on fixed maturity accounts module
And click on opening under fixed aturity accounts screen
And enter curency code in fixed maturity accounts
And enter the account type in fixed maturity accounts
And enter the CIF number in fixed maturity accounts
Then valiidate system through the validation for restriction in fixed maturity accounts
And click on closed dormant accounts screen
And click on maintenancescreen in closed dormant accounts
And enter the CIF code in closed dormant accounts
Then varify system through the validatio for closed dormant account
