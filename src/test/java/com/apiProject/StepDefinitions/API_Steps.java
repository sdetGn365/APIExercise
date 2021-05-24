package com.apiProject.StepDefinitions;

import com.apiProject.utils.API_CommonMethods;
import com.apiProject.utils.API_Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class API_Steps {

    RequestSpecification request;
    Response response;
    static String datasetID;
    static String vehiclesIDList;
    static String vehicleID;


    //---------------------------------Getting a datasetID-------------------------------------------------//

    @Given("a request is prepared to create new  dataset")
    public void a_request_is_prepared_to_create_new_dataset() {
        request = API_CommonMethods.createDataSetIDRequest();
    }


    @When("a GET call is made to create a dataset")
    public void a_GET_call_is_made_to_create_a_dataset() {
        response = request.when().get(API_Constants.GET_DATASET_ID_URI);


    }

    @Then("a status code for creating a dataset is {int}")
    public void a_status_code_for_creating_a_dataset_is(Integer status_code) {
        response.then().assertThat().statusCode(status_code);
        System.out.println("Status code for creating a datasetId: " + response.statusCode());
        response.prettyPrint();
    }

    @Then("the dataset is created contains key {string}")
    public void the_dataset_is_created_contains_key(String dataset) {
        response.then().assertThat().body(containsString(dataset));
    }

    @Then("the datasetID {string} is stored in the global variable to be used for other calls")
    public void the_datasetID_is_stored_in_the_global_variable_to_be_used_for_other_calls(String dataset_id) {
        datasetID = response.jsonPath().getString(dataset_id);
        System.out.println("The id stored in datasetID global variable: " + datasetID);
    }

    //----------------------------------Getting vehicles list------------------------------------------//

    @Given("a request is prepared to get all vehicles list")
    public void a_request_is_prepared_to_get_all_vehicles_list() {
        request = API_CommonMethods.getVehiclesList(datasetID);
    }

    @When("a GET call is made to retrieve all vehicles")
    public void a_GET_call_is_made_to_retrieve_all_vehicles() {
        response = request.when().get(API_Constants.GET_ALL_VEHICLES_ID_URI);
    }

    @Then("the status code of the request is {int}")
    public void the_status_code_of_the_request_is(Integer status_code) {
        response.then().assertThat().statusCode(status_code);
        System.out.println("Status code for retrieving vehicles list: " + response.statusCode());

    }

    @Then("it contains key {string} and body that is list of vehicleIds")
    public void it_contains_key_and_body_that_is_list_of_vehiclesIds(String vehicleIdsKey) {
        response.then().assertThat().body(containsString(vehicleIdsKey));
        vehiclesIDList = response.asString();
        System.out.println("The vehicles list: " + vehiclesIDList);

    }

    @Then("the 6th id from the vehicles list is stored in the global variable to be used for other calls")
    public void the_6th_id_from_the_vehicles_list_is_stored_in_the_global_variable_to_be_used_for_other_calls() {
        vehicleID = API_CommonMethods.retrieve6thElementFromList(vehiclesIDList);
        System.out.println("The 6th element from the list: " + vehicleID);
    }

    //--------------------------------Getting one vehicle info------------------------------------------//

    @Given("a request is prepared to retrieve the vehicle information")
    public void a_request_is_prepared_to_retrieve_the_vehicle_information() {
        request = API_CommonMethods.getOneVehicleInfo(datasetID, vehicleID);
    }


    @When("a GET call is made to retrieve the vehicle information")
    public void a_GET_call_is_made_to_retrieve_the_vehicle_information() {
        response = request.when().get(API_Constants.GET_ONE_VEHICLE_INFO);
    }

    @Then("the status code for retrieving the updated employee is {int}")
    public void the_status_code_for_retrieving_the_updated_employee_is(Integer status_code) {
        response.then().assertThat().statusCode(status_code);
    }

    @Then("the retrieved Vehicle_ID {string} matches the globally stored vehicle ID")
    public void the_retrieved_Vehicle_ID_matches_the_globally_stored_vehicle_ID(String vehicleInfo) {
        JsonPath js = response.jsonPath();
        System.out.println("The vehicle info from the response: " + js.prettify());
        String vehicleIDFromResponse = response.jsonPath().getString(vehicleInfo);
        String vehicleIdPrevious = vehicleID.trim().replaceAll("\n", "");
        assertThat(vehicleIDFromResponse, equalTo(vehicleIdPrevious));
    }

}
