@Search3
Feature: Search and verify click on Title with Datatable

  Scenario: Search and verify click on Title
    Given Launch browser and enter appsite
    When Enter searching criteria
      | cucumber architecture |
    And Click on channel button
    Then Validate channel name with actual name
