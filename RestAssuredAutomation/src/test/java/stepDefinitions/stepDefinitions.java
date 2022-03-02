package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import Resources.APIResources;
import Resources.TestDatabuild;
import Resources.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class stepDefinitions extends Utils {
	public static String place_id;
	TestDatabuild test=new TestDatabuild();
	RequestSpecification request;
	//ResponseSpecification resspec;
	Response res;
		@Given("Add place payload with {string} and {string} and {string}")
		public void add_place_payload_with_and_and(String name,String language,String address) throws IOException {
			System.out.println("the values are"+name+" "+language+" "+address);
			request=given().spec(reqspecdetails()).
			body(test.getlocationdata(name,language,address));
		}
		
		@When("user calls {string} with {string} http request")
		public void user_calls_with_post_http_request(String resource,String httprequest) {
			APIResources apiresource=APIResources.valueOf(resource);
			System.out.println("iam the post value"+apiresource.getResource());
			if(httprequest.contentEquals("POST"))
			{
			res=request.when().post(apiresource.getResource()).
					then().spec(resspecdetails()).extract().response();
			}
			else if(httprequest.contentEquals("GET"))
			{
				res=request.when().get(apiresource.getResource()).
						then().spec(resspecdetails()).extract().response();
			}
		}
		@Then("verify the response and the status code is {int}")
		public void verify_the_response_and_the_status_code_is(int int1) {
			Assert.assertEquals(res.getStatusCode(), int1);
			String reponse=res.asString();
			System.out.println(reponse);
			JsonPath js=new JsonPath(reponse);
			String test=js.getString("status");
			System.out.println("I am the test value"+test);
			Assert.assertEquals("OK", test);
		}
		@Then("verify the {string} code is {string}")
		public void verify_the_code_is(String key, String expected) {
			String reponse1=res.asString();
			System.out.println(reponse1);
			JsonPath js=new JsonPath(reponse1);
			String test=js.getString(key);
			place_id=js.getString("place_id");
			System.out.println("I am the test value"+test);
			Assert.assertEquals(expected, test);
		}
		
			@Then("verify place_id created  maps to {string} using {string}")
			public void verify_place_id_created_maps_to_using(String name, String resource) throws IOException {
			   request=given().spec(reqspecdetails()).queryParam("place_id", place_id);
			   user_calls_with_post_http_request(resource,"GET");
			   System.out.println("I am new values"+getJSonpath(res,"name"));
			   Assert.assertEquals(getJSonpath(res,"name"), name);
			}	
			
				@Given("Delete payload")
				public void delete_payload() throws IOException {
				    request=given().spec(reqspecdetails()).body(test.setDeleteLocation(place_id));
				}



}
