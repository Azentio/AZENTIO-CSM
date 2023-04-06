Feature: To Test the SADS Restrictionfor Client Processing Statement
@SADS_AT_009
Scenario: Checking on the "OR" restriction for CIF Type “X” and GL “Y”  under Processing clients statements (Trade date / Value date)
Given navigate to CSM application and login with valid credentials
And click on report module
And click on client processing statement sub module
And get the test data for OR Restriction of XIF type X and GL Y in client processing statement 
And click on trade date under client processing statement
Then enter the from periodically in client processing statement
And enter the transaction from date in client processing statemet
And enter the transaction to date in client processing statement
And check the range of GL in client processing statement
And check the range of CIF in client processing statement
And give the from gl number in client processing statement
And give the to gl number in client processing statement
And give the from CIF number in client processing statement
And give the to CIF number in client processing statement
And click on open button client processing statement
Then validate the system shows restricted message for system processing statement
And logout from the application
@SADS_AT_010
Scenario: Checking on the "AND" restriction for CIF Type “X” and GL “Z” under Processing clients statements (Trade date / Value date)
Given navigate to CSM application and login with valid credentials
And click on report module
And click on client processing statement sub module
And get the test data for OR Restriction of XIF type X and GL Y in client processing statement 
And click on trade date under client processing statement
Then enter the from periodically in client processing statement
And enter the transaction from date in client processing statemet
And enter the transaction to date in client processing statement
And check the range of GL in client processing statement
And check the range of CIF in client processing statement
And give the from gl number in client processing statement
And give the to gl number in client processing statement
And give the from CIF number in client processing statement
And give the to CIF number in client processing statement
And click on open button client processing statement
Then validate the system shows restricted message for system processing statement
And logout from the application
@SADS_AT_011
Scenario: Checking on the "AND" restriction for CIF Type “A” and GL “Y”  under Processing clients statements (Trade date / Value date)
Given navigate to CSM application and login with valid credentials
And click on report module
And click on client processing statement sub module
And get the test data for OR Restriction of XIF type X and GL Y in client processing statement 
And click on trade date under client processing statement
Then enter the from periodically in client processing statement
And enter the transaction from date in client processing statemet
And enter the transaction to date in client processing statement
And check the range of GL in client processing statement
And check the range of CIF in client processing statement
And give the from gl number in client processing statement
And give the to gl number in client processing statement
And give the from CIF number in client processing statement
And give the to CIF number in client processing statement
And click on open button client processing statement
Then validate the system shows restricted message for system processing statement
And logout from the application
@SADS_AT_012
Scenario: Checking on the "AND" restriction for CIF Type “X” and GL “Y”  under Processing clients statements (Trade date / Value date)
Given navigate to CSM application and login with valid credentials
And click on report module
And click on client processing statement sub module
And get the test data for OR Restriction of XIF type X and GL Y in client processing statement 
And click on trade date under client processing statement
Then enter the from periodically in client processing statement
And enter the transaction from date in client processing statemet
And enter the transaction to date in client processing statement
And check the range of GL in client processing statement
And check the range of CIF in client processing statement
And give the from gl number in client processing statement
And give the to gl number in client processing statement
And give the from CIF number in client processing statement
And give the to CIF number in client processing statement
And click on open button client processing statement
Then validate the system shows restricted message for system processing statement
And logout from the application