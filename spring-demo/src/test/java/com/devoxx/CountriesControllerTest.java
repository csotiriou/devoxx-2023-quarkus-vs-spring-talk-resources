package com.devoxx;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class CountriesControllerTest {

    @LocalServerPort
    private int port;

    @BeforeEach
    void configureRestAssured() {
        RestAssured.port = port;
    }

    @AfterEach
    void resetRestAssured() {
        RestAssured.reset();
    }

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
