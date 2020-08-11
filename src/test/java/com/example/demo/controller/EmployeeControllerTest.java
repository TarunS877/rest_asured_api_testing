package com.example.demo.controller;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

public class EmployeeControllerTest {


    @Test
    public  void getResponseBody(){
        System.out.println(given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
                .all());

    }
    @Test
    public  void getResponseTime(){
        System.out.println("The time taken to fetch the response "+get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1")
                .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
    }
    @Test
    public  void getResponseHeaders(){
        System.out.println("The headers in the response "+
                get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().extract()
                        .headers());
    }
    @Test
    public  void getResponseContentType(){
        System.out.println("The content type of response "+
                get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().extract()
                        .contentType());
    }
}

