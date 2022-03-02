package stepDefinitions;

import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {
	@Before("@deletePlace")
public void beforeDelete() throws IOException {
		stepDefinitions step=new stepDefinitions();
		if(stepDefinitions.place_id==null)
		{
		step.add_place_payload_with_and_and("ramamma", "German", "new test");
		step.user_calls_with_post_http_request("addPlaceAPI", "POST");
		step.verify_the_code_is("status", "OK");;
	}
	}
	
}
