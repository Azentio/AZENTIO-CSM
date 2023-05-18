Feature: To verify the functionality of amend cheque card retrieve
@ACSD_015
Scenario: checking if the system is retrieving the card if the account has a status different than active/inactive
    Given user login as csm core application
    And user update test data set id for ACSD_015
    And user click the amend cheque card status icon 
    And user click the maintenance under amend cheque card status
    And user select the product type under maintenance
    Then user enter the card type value under maintenance
    And user select the status under maintenance
    And user enter the card number value under maintenance
    And user click the retrieve button
    Then user verify the pop message
    And user click the ok button under maintenance


@ACSD_014
Scenario: checking if the system will allow the user to amend the cheque by a valid cheque
    Given user login as csm core application
    And user update test data set id for ACSD_014
    And user enter the branch code value under product type
    And user enter the currency code value under product type 
    And user enter the GL code value under product type
    And user enter the CIF code value under product type
    And user enter the serial no under product type
    And user enter the cheque no under product type
    And user click the retrieve button
    And user click the check box
    And user click the update button
    Then user verify the save popup
    And user click the ok button
    

@ACSD_013 
Scenario: checking if the system will allow the user to amend the cheque by a paid cheque   
    Given user login as csm core application
    And user update test data set id for ACSD_013
    And user click the amend cheque card status icon 
    And user click the maintenance under amend cheque card status
    And user select the product type under maintenance
    And user enter the branch code value under product type
    And user enter the currency code value under product type 
    And user enter the GL code value under product type
    And user enter the CIF code value under product type
    And user enter the serial no under product type
    And user enter the cheque no under product type
    And user click the retrieve button
    And user click the check box
    And user click the update button
    Then user verify the save popup
    And user click the ok button
    
    
    
    
    
    
       