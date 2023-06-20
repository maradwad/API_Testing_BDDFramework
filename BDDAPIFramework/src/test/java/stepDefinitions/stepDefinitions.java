package stepDefinitions;

import org.junit.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.examples.Utils;

import CreatePOJO.CreatePOJOClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resource.createRepoPayload;
import resource.commonUtils.RestLogger;
import resource.commonUtils.utils;

public class stepDefinitions extends utils {

	RequestSpecification request;
	JsonPath json;
	createRepoPayload data = new createRepoPayload();
	Response response;
	public static String payload;

	@Given("Starting Test case {string}")
	public void starting_test_case(String testcase_name) {
		RestLogger.initLogger();
		RestLogger.StratTestCase(testcase_name);
	}

	@Then("Ending Testcase")
	public void ending_testcase() {
		RestLogger.endTestCase();
	}

//	@Given("Create Repo payload")
//	public void create_repo_payload() throws JsonProcessingException {
//		ObjectMapper obj=new ObjectMapper();
//		payload=obj.writerWithDefaultPrettyPrinter().writeValueAsString(data.createpayload());
//	    }
	@Given("Create Repo payload name {string} and decription {string}")
	public void create_repo_payload_name_name_and_decription_description(String name, String description)
			throws JsonProcessingException {
		// Write code here that turns the phrase above into concrete actions
		ObjectMapper obj = new ObjectMapper();
		payload = obj.writerWithDefaultPrettyPrinter().writeValueAsString(data.createpayload(name, description));
	}

	@When("User calls Create API {string} post API call")
	public void user_call_post_api_call(String resourcePath) {
		response = postRequest(resourcePath, payload);
	}

	@Then("API call got successful with status code {int}")
	public void api_call_got_successful_with_status_code(int statusCode) {
		Assert.assertEquals(statusCode, response.getStatusCode());
	}

	@Then("Verify Repository {string} is {string}")
	public void verify_created(String response_key, String repoName) {
		json = new JsonPath(response.getBody().asString());
		String key = json.get(response_key);
		Assert.assertEquals(repoName, key);
	}

	@When("User calls delete API {string} delete call")
	public void user_calls_delete_api_delete_call(String resourcePath) {
		response = deleteRequest(resourcePath, data.getRepoName());
	}
}
