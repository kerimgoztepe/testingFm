package com.apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class ReqresDeleteApiTest {

    String baseURL = "https://reqres.in/api";

    @Test
    public void deleteAllServicesApiTest() {
        RestAssured.baseURI=baseURL;
        Response response = given() //when().baseUri("https://reqres.in/api")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 65cbc4c43040ae97eb012d87fb6bb928809feb842bfeba5ea49b2969ea92ede6")
                .pathParam("id", 13393)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }
}
