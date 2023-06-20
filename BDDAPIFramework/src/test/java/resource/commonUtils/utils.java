package resource.commonUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class utils {
	RequestSpecification request;
	Response response;
	String baseURI="https://api.github.com";
	String bearerToken="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";
	
	public Response postRequest(String resourcePath, String payload) {
		  RestLogger.info("BaseIRI is-"+baseURI);
		  RestLogger.info("Resource path  is-"+resourcePath);
		  RestLogger.info("Request payload is"+payload);
		  request=RestAssured.given().body(payload);
		  request.contentType(ContentType.JSON);
		  request.header("Authorization","Bearer "+bearerToken);
		  response=request.post(baseURI+resourcePath);
		  RestLogger.info("Response of request is-"+response.getBody().asString());
		  return response;
	}
	
	public Response deleteRequest(String resourcePath, String repo_name) {
		String requestURI=baseURI+resourcePath+repo_name;
		  RestLogger.info("Delete URI is-"+requestURI);
		  request=RestAssured.given();
		  request.contentType(ContentType.JSON);
		  request.header("Content-Type","application/json");
		  request.header("Authorization","Bearer "+bearerToken);
		  response=request.delete(requestURI);
		  return response;
	}
}
