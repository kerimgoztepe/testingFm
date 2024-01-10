package com.apitests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
public class ChatGptTestSamples {
    
   
        @Test
        public void testGetRequest() {
            // Define the base URL of the API
            RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

            // Perform the GET request
            Response response = RestAssured
                    .when()
                    .get("/posts/1"); // Specify the endpoint you want to test

            // Extract and print the response body
            String responseBody = response.getBody().asString();
            System.out.println("Response Body: " + responseBody);

            // Validate the status code
            int statusCode = response.getStatusCode();
            System.out.println("Status Code: " + statusCode);
            assert statusCode == 200 : "Expected status code 200 but found " + statusCode;

            // You can add more validation for specific content in the response if needed
        }

    @Test
    public void testPostRequest() {
        // Define the base URL of the API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Create a request specification
        RequestSpecification request = RestAssured.given();

        // Create a JSON payload for the POST request
        String requestBody = "{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";

        // Set the content type and the body of the request
        request.contentType(ContentType.JSON);
        request.body(requestBody);

        // Perform the POST request
        Response response = request.post("/posts");

        // Extract and print the response body
        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        // Validate the status code
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        assert statusCode == 201 : "Expected status code 201 but found " + statusCode;

        // You can add more validation for specific content in the response if needed
       }
    }









