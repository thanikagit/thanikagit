package com.page;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Api extends BaseTest {

	WebDriver driver;
	String Requested_Id = null;
	String requested_deatils = null;
	String matid, asd, ageFro, ageT, maritalStatus, mariedstatus1, Religion, Religion1, Caste, Caste1, SubCaste,
			SubCaste1, Education, Education1;
	int ageFrom, ageTo, ageFrom1, ageTo1, i, total;
	float heightFrom, heightFrom1, heightTo, heightTo1, heightFrom2, heightTo2, Height;

	@Test(priority = 2, enabled = true)
	public void communicationDetails() {
		SoftAssert asrt = new SoftAssert();
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		RestAssured.baseURI = "https://1k-dev.1kosmos.net/healthz";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,
				"https://1k-dev.1kosmos.net/healthz");

		JsonPath jsonPathEvaluator = response.jsonPath();

		int statusCode = response.getStatusCode();

		System.out.println(statusCode);
		
		if (statusCode==200) {
			
			Response response1 = httpRequest.request(Method.GET,
					"https://1k-dev.1kosmos.net/api/v3/rest/default/eula?tenant=1kosmos");
			ResponseBody body = response1.getBody();
			System.out.println("Response Body is: " + body.asString());
			
		} else {
         System.out.println("Status code is not equal to 200");
		}
		
	//asrt.assertEquals(statusCode /actual value/, 200 /expected value/, "Correct status code returned");
		
	
		asrt.assertAll();
		
	}}