package resource;

import CreatePOJO.CreatePOJOClass;

public class createRepoPayload {
	CreatePOJOClass req_payload=new CreatePOJOClass();
	public CreatePOJOClass createpayload(String name,String description){
		
		
		req_payload.setName(name);
		
		req_payload.setDescription(description);
	   return req_payload;
	}
	
	public String getRepoName() {
		return req_payload.getName();
	}
}
