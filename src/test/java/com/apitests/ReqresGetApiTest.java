package com.apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class ReqresGetApiTest {

    String baseURL = "https://reqres.in/api";

    @Test
    public void test1(){

        Response response = RestAssured.get(baseURL + "/users");
        response.body().prettyPrint();
        int scode = response.statusCode();
        System.out.println(scode);
        System.out.println(response.getCookies().toString());


        //print the status code
        System.out.println(response.statusCode());

        //print body
       // System.out.println(response.body().prettyPrint());
    }


}
