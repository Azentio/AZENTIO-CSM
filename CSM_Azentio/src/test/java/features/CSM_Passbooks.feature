Feature: To verify the functionality of CSM passbooks
@TC_SAD_0074
Scenario: Checking on the "OR" restriction for CIF Type “X” and GL “Y”  under Passbooks
    Given user login as csm core application
    And user update test data set id for TC_SAD_0074
    And user click the passbooks in menu options
    And user click the maintenance under passbooks
    Then user enter the value for passbook type
    And user click the passbooks maintenance icon
    And user enter the branch code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the currency code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the GL code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the CIF code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the serial no value under passbook type
    And user click the passbooks maintenance icon
    Then user verify the popup message
    And user logout from this application
    
@TC_SAD_0075
Scenario: Checking on the "AND" restriction for CIF Type “X” and GL “Z” under Passbooks
    Given user login as csm core application
    And user update test data set id for TC_SAD_0075
    And user click the passbooks in menu options
    And user click the maintenance under passbooks
    Then user enter the value for passbook type
    And user click the passbooks maintenance icon
    And user enter the branch code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the currency code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the GL code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the CIF code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the serial no value under passbook type
    And user click the passbooks maintenance icon
    Then user verify the popup message
    And user logout from this application
    
@TC_SAD_0076
Scenario: Checking on the "AND" restriction for CIF Type “A” and GL “Y”  under Passbooks
    Given user login as csm core application
    And user update test data set id for TC_SAD_0076
    And user click the passbooks in menu options
    And user click the maintenance under passbooks
    Then user enter the value for passbook type
    And user click the passbooks maintenance icon
    And user enter the branch code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the currency code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the GL code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the CIF code value under passbook type
    And user click the passbooks maintenance icon
    And user enter the serial no value under passbook type
    And user click the passbooks maintenance icon
    Then user verify the popup message
    And user logout from this application    
    
    