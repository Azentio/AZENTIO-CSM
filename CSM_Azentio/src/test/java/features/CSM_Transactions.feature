Feature: To verify the functionality of CSM transactions
@TC_SAD_0036
Scenario: Checking on the "OR" restriction for CIF Type “X” and GL “Z” under Transactions
    Given user login as csm core application
    #And user click yes if we get force logout popup
    And user update test data set id for TC_SAD_0036
    And user click the transactions in menu options
    And user click the maintenance in transactions 
    And user enter the value in transactions type
    Then user enter the value for branch code in currency account
    And user click the transaction maintenance type icon
    And user enter the value for currency code in curency account 
    And user click the transaction maintenance type icon
    And user enter the value for GL code in currency account
    And user click the transaction maintenance type icon
    And user enter the value for CIF code in currency account
    And user click the transaction maintenance type icon
    Then user verify that the warning popup message in currency account
    And user click the ok button in currency account
    And user enter the value for serial number in currency account
    And user click the search icon in currency account
    Then user verify that the popup message
    And user click the ok button
    Then user logout from the csm application
    
@TC_SAD_0037
Scenario: Checking on the "OR" restriction for CIF Type “A” and GL “Y”  under Transactions
    Given user login as csm core application
    And user update test data set id for TC_SAD_0037
    And user click the transactions in menu options
    And user click the maintenance in transactions 
    And user enter the value in transactions type
    Then user enter the value for branch code in currency account
    And user click the transaction maintenance type icon
    And user enter the value for currency code in curency account 
    And user click the transaction maintenance type icon
    And user enter the value for GL code in currency account
    And user click the transaction maintenance type icon
    And user enter the value for CIF code in currency account
    And user click the transaction maintenance type icon
    Then user verify that the warning popup message in currency account
    And user click the ok button in currency account
    And user enter the value for serial number in currency account
    And user click the search icon in currency account
    Then user verify that the popup message
    And user click the ok button
    Then user logout from the csm application
    
@TC_SAD_0038
Scenario: Checking on the "OR" restriction for CIF Type “X” and GL “Y”  under Transactions
    Given user login as csm core application
    And user update test data set id for TC_SAD_0038
    And user click the transactions in menu options
    And user click the maintenance in transactions 
    And user enter the value in transactions type
    Then user enter the value for branch code in currency account
    And user click the transaction maintenance type icon
    And user enter the value for currency code in curency account 
    And user click the transaction maintenance type icon
    And user enter the value for GL code in currency account
    And user click the transaction maintenance type icon
    And user enter the value for CIF code in currency account
    And user click the transaction maintenance type icon
    Then user verify that the warning popup message in currency account
    And user click the ok button in currency account
    And user enter the value for serial number in currency account
    And user click the search icon in currency account
    Then user verify that the popup message
    And user click the ok button
    Then user logout from the csm application    
    
@TC_SAD_0039
Scenario: Checking on the "AND" restriction for CIF Type “X” and GL “Z” under Transactions
    Given user login as csm core application
    And user update test data set id for TC_SAD_0039
    And user click the transactions in menu options
    And user click the maintenance in transactions 
    And user enter the value in transactions type
    Then user enter the value for branch code in currency account
    And user click the transaction maintenance type icon
    And user enter the value for currency code in curency account 
    And user click the transaction maintenance type icon
    And user enter the value for GL code in currency account
    And user click the transaction maintenance type icon
    And user enter the value for CIF code in currency account
    And user click the transaction maintenance type icon
    Then user verify that the warning popup message in currency account
    And user click the ok button in currency account
    And user enter the value for serial number in currency account
    And user click the search icon in currency account
    Then user verify that the popup message
    And user click the ok button
    Then user logout from the csm application        
  