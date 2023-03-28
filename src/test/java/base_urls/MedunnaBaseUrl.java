package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {
    //https://www.medunna.com/room?page=1&sort=id,asc
    //swagger medunna app- https://app.swaggerhub.com/apis/yasinaniltechpro/medunna-api/0.0.1#/user-jwt-controller/authorizeUsingPOST
    public static RequestSpecification spec;

    public static void medunnaSetUp(){

        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                setBaseUri("https://medunna.com").build();
}}
