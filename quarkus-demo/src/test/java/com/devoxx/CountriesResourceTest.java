package com.devoxx;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CountriesResourceTest {

    @Test
    public void all() {
        given()
                .accept(ContentType.JSON)
                .header("X-Test", "foo")
                .when().get("/countries")
                .then()
                .statusCode(200)
                .body(containsString("Angola"))
                .header("X-Test", "foo");
    }

    @Test
    public void names() {
        given()
                .accept(ContentType.JSON)
                .header("X-Test", "bar")
                .when().get("/countries?names=Greece,Italy,Spain,France")
                .then()
                .statusCode(200)
                .body(containsString("Greece"), containsString("France"))
                .header("X-Test", "bar");
    }

}
