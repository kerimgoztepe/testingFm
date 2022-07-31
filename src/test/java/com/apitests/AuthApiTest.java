package com.apitests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class AuthApiTest {


       private final static String CLIENT_ID = "front-service";
       private final static String CLIENT_PASSWORD = "4k2p5LLIGNcOGNEtU76oMqS4eycTiQfpgYwKf4HB3wMMpMmsdQOPmekGb6Kwb7c";
       private final static String BASE_URL = "http://staging.shvp-xftw-ctdtm.com";


    //@BeforeClass
    //public void SetUpClass() {
    //    baseURI = "http://staging.shvp-xftw-ctdtm.com";


    @Test
    public void  getToken() {
        Response response = given().auth().basic(CLIENT_ID, CLIENT_PASSWORD).
                formParams("grant_type", "password").
                formParams("username", "superadmin").
                formParams("password", "T3st123!").
                when().
                baseUri(BASE_URL).
                post("/platform/accounts-service/oauth/token");
        response.then().assertThat().
                statusCode(200).
                body("access_token", notNullValue()).
                log().ifError();
        System.out.println(response.prettyPrint());
        //return response.jsonPath().getString("access_token");
    }

    @Test
    public void getMyProfile() {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX25hbWUiOiJzdXBlcmFkbWluIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTY1OTM1MDUzOSwidXNlcklkIjoxLCJhdXRob3JpdGllcyI6WyJhc3NpZ25fdXNlcl9yb2xlcyIsIlJPTEVfU1VQRVJBRE1JTiIsInVwZGF0ZV91c2VyIiwidmlld191c2VyIiwiUk9MRV9VU0VSIl0sImp0aSI6ImY4Y2QzYTFjLTcxY2YtNDY5OC1iZDQxLTFjNDNkMjI2NjIzZSIsImNsaWVudF9pZCI6ImZyb250LXNlcnZpY2UifQ.SpMryYEbfrlodkKtTMqR6_RNmox8Vg6DsiitO4LOBgQ";
        Response response = given().auth().basic(CLIENT_ID,CLIENT_PASSWORD).
                auth().oauth2(token).
                baseUri(BASE_URL).
                when().
                get("/api/v1/account/me/profile");
        response.then().log().ifError();
        System.out.println(response.prettyPrint());
        //return response;
    }



}



