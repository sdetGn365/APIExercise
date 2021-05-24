package com.apiProject.utils;


import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class API_CommonMethods {
    /**
     * Create datasetId request
     *
     * @return
     */
    public static RequestSpecification createDataSetIDRequest() {
        return given().header(API_Constants.Header_Content_type, API_Constants.Content_type);
    }

    /**
     * Get all vehicles list request
     *
     * @param datasetID
     * @return
     */
    public static RequestSpecification getVehiclesList(String datasetID) {

        return given().header(API_Constants.Header_Content_type, "application/json")
                .pathParam("datasetId", datasetID);
    }

    /**
     * Get one vehicle information request
     *
     * @param datasetID
     * @param vehicleID
     * @return
     */
    public static RequestSpecification getOneVehicleInfo(String datasetID, String vehicleID) {

        return given().header(API_Constants.Header_Content_type, "application/json")
                .pathParam("datasetId", datasetID).pathParam("vehicleId", vehicleID);
    }

    /**
     * Retrieve the 6th element from the vehicles list
     *
     * @param list
     * @return
     */
    public static String retrieve6thElementFromList(String list) {
        String s1 = list.replace("[", "");
        String s2 = s1.replace("]", "");
        String[] vehicles_list = s2.split(",");
        return vehicles_list[5];
    }
}