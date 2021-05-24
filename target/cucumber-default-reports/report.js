$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/API.feature");
formatter.feature({
  "name": "CoxAuto API Workflow",
  "description": "  Description: This feature tests Cox Automotive API",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@apiWorkflow"
    }
  ]
});
formatter.scenario({
  "name": "Creating a dataset id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@apiWorkflow"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to create new  dataset",
  "keyword": "Given "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.a_request_is_prepared_to_create_new_dataset()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a GET call is made to create a dataset",
  "keyword": "When "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.a_GET_call_is_made_to_create_a_dataset()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a status code for creating a dataset is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.a_status_code_for_creating_a_dataset_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the dataset is created contains key \"datasetId\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.the_dataset_is_created_contains_key(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the datasetID \"datasetId\" is stored in the global variable to be used for other calls",
  "keyword": "And "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.the_datasetID_is_stored_in_the_global_variable_to_be_used_for_other_calls(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Retrieving all Vehicle IDs",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@apiWorkflow"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to get all vehicles list",
  "keyword": "Given "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.a_request_is_prepared_to_get_all_vehicles_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a GET call is made to retrieve all vehicles",
  "keyword": "When "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.a_GET_call_is_made_to_retrieve_all_vehicles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the status code of the request is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.the_status_code_of_the_request_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it contains key \"vehicleIds\" and body that is list of vehicleIds",
  "keyword": "And "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.it_contains_key_and_body_that_is_list_of_vehiclesIds(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the 6th id from the vehicles list is stored in the global variable to be used for other calls",
  "keyword": "And "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.the_6th_id_from_the_vehicles_list_is_stored_in_the_global_variable_to_be_used_for_other_calls()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Retrieving the information about a specific vehicle",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@apiWorkflow"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to retrieve the vehicle information",
  "keyword": "Given "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.a_request_is_prepared_to_retrieve_the_vehicle_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a GET call is made to retrieve the vehicle information",
  "keyword": "When "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.a_GET_call_is_made_to_retrieve_the_vehicle_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the status code for retrieving the updated employee is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.the_status_code_for_retrieving_the_updated_employee_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the retrieved Vehicle_ID \"vehicleId\" matches the globally stored vehicle ID",
  "keyword": "And "
});
formatter.match({
  "location": "com.apiProject.StepDefinitions.API_Steps.the_retrieved_Vehicle_ID_matches_the_globally_stored_vehicle_ID(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});