Feature: To Test the Restriction under lost and found document
@SADS_AT_060
Scenario: Checking on the "OR" restriction for CIF Type “X” and GL “Z” under Lost & Found Management
Given navigate to CSM application and login with valid credentials
And click on lost and found management module
And click on maintenance button under lost and found managemennt module
Then verify lost and found manageent screen got opened
And get the test data for or restriction of CIF type X and Gl Z in lost and found management screen
And enter the branch code in lost and found management screen
And enter the currency code in lost and found management screen
And enter the gl code in lost and found management screen
And enter the CIF number in lost and found management screen
And enter the serial number in lost and found management screen
Then validate system should restrict the account in lost and found managemeent screen
@SADS_AT_061
Scenario: Checking on the "OR" restriction for CIF Type “A” and GL “Y”  under Lost & Found Management
Given navigate to CSM application and login with valid credentials
And click on lost and found management module
And click on maintenance button under lost and found managemennt module
Then verify lost and found manageent screen got opened
And get the test data for or restriction of CIF type A and Gl Y in lost and found management screen
And enter the branch code in lost and found management screen
And enter the currency code in lost and found management screen
And enter the gl code in lost and found management screen
And enter the CIF number in lost and found management screen
And enter the serial number in lost and found management screen
Then validate system should restrict the account in lost and found managemeent screen
@SADS_AT_062
Scenario: Checking on the "OR" restriction for CIF Type “X” and GL “Y”  under Lost & Found Management
Given navigate to CSM application and login with valid credentials
And click on lost and found management module
And click on maintenance button under lost and found managemennt module
Then verify lost and found manageent screen got opened
And get the test data for or restriction of CIF type X and Gl Y in lost and found management screen
And enter the branch code in lost and found management screen
And enter the currency code in lost and found management screen
And enter the gl code in lost and found management screen
And enter the CIF number in lost and found management screen
And enter the serial number in lost and found management screen
Then validate system should restrict the account in lost and found managemeent screen
@SADS_AT_063
Scenario: Checking on the "AND" restriction for CIF Type “X” and GL “Z” under Lost & Found Management
Given navigate to CSM application and login with valid credentials
And click on lost and found management module
And click on maintenance button under lost and found managemennt module
Then verify lost and found manageent screen got opened
And get the test data for and restriction of CIF type X and Gl z in lost and found management screen
And enter the branch code in lost and found management screen
And enter the currency code in lost and found management screen
And enter the gl code in lost and found management screen
And enter the CIF number in lost and found management screen
And enter the serial number in lost and found management screen
Then validate system should not restrict the account in lost and found managemeent screen
@SADS_AT_064
Scenario: Checking on the "AND" restriction for CIF Type “A” and GL “Y”  under Lost & Found Management
Given navigate to CSM application and login with valid credentials
And click on lost and found management module
And click on maintenance button under lost and found managemennt module
Then verify lost and found manageent screen got opened
And get the test data for and restriction of CIF type A and Gl Y in lost and found management screen
And enter the branch code in lost and found management screen
And enter the currency code in lost and found management screen
And enter the gl code in lost and found management screen
And enter the CIF number in lost and found management screen
And enter the serial number in lost and found management screen
Then validate system should not restrict the account in lost and found managemeent screen
@SADS_AT_065
Scenario: Checking on the "AND" restriction for CIF Type “X” and GL “Y”  under Lost & Found Management
Given navigate to CSM application and login with valid credentials
And click on lost and found management module
And click on maintenance button under lost and found managemennt module
Then verify lost and found manageent screen got opened
And get the test data for and restriction of CIF type X and Gl z in lost and found management screen
And get the test data for and restriction of CIF type X and Gl Y in lost and found management screen
And enter the branch code in lost and found management screen
And enter the currency code in lost and found management screen
And enter the gl code in lost and found management screen
And enter the CIF number in lost and found management screen
And enter the serial number in lost and found management screen
Then validate system should restrict the account in lost and found managemeent screen