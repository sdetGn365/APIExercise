package com.apiProject.utils;

import io.restassured.RestAssured;

public class API_Constants {
    public static final String Header_Content_type = "Content-type";
    public static final String Content_type = "application/json";
    public static final String BaseURI = "https://api.coxauto-interview.com";
    public static final String GET_DATASET_ID_URI = "https://api.coxauto-interview.com/api/datasetId";
    public static final String GET_ALL_VEHICLES_ID_URI = BaseURI + "/api/{datasetId}/vehicles";
    public static final String GET_ONE_VEHICLE_INFO = BaseURI + "/api/{datasetId}/vehicles/{vehicleId}";


}
