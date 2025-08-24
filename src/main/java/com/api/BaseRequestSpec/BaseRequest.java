package com.api.BaseRequestSpec;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BaseRequest {
    private RequestSpecification requestSpecification;
    private final static String url = "http://64.227.160.186:8080/";

    public BaseRequest() {
        this.requestSpecification = given().baseUri(url);
    }


    public RequestSpecification baseUri() {

        return requestSpecification = given().baseUri(url);

    }

    protected Response post(Object payload, String endpoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint).then().extract().response();
    }

    protected Response get(String endpoint) {
        return requestSpecification.contentType(ContentType.JSON).get(endpoint).then().extract().response();
    }


}
