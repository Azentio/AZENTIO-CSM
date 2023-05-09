
Feature: To destory the ChequeBook Record

@CHB_111
  Scenario: destory the ChequeBook Record
    Given navigate to CSM application and login with valid credentials
    And Click the ChequeBook request under CSM application
    Then Click the to be destory button under ChequeBook request
    #And Click on search existing checkbook record
    And search a existing checkbook record
    Then double click the approve option
    And click the todestory button
 
