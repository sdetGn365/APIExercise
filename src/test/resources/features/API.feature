#Author: gunel.aidinova@gmail.com

@apiWorkflow
Feature: CoxAuto API Workflow
  Description: This feature tests Cox Automotive API

  Scenario: Creating a dataset id
    Given a request is prepared to create new  dataset
    When a GET call is made to create a dataset
    Then a status code for creating a dataset is 200
    And the dataset is created contains key "datasetId"
    And the datasetID "datasetId" is stored in the global variable to be used for other calls


  Scenario: Retrieving all Vehicle IDs
    Given a request is prepared to get all vehicles list
    When a GET call is made to retrieve all vehicles
    Then the status code of the request is 200
    And it contains key "vehicleIds" and body that is list of vehicleIds
    And the 6th id from the vehicles list is stored in the global variable to be used for other calls

  Scenario: Retrieving the information about a specific vehicle
    Given a request is prepared to retrieve the vehicle information
    When a GET call is made to retrieve the vehicle information
    Then the status code for retrieving the updated employee is 200
    And the retrieved Vehicle_ID "vehicleId" matches the globally stored vehicle ID



