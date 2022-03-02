package Resources;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.io.*;
import java.util.Properties;

public class Utils {
	public static RequestSpecification reqspec;
	public RequestSpecification reqspecdetails() throws IOException{
		if(reqspec==null)
		{
		RestAssured.baseURI=readProperties("baseURL");
		PrintStream pos=new PrintStream(new FileOutputStream("logging.txt"));
	reqspec=new RequestSpecBuilder().setBaseUri(readProperties("baseURL")).addQueryParam("key", "qaclick123")
			.addFilter(RequestLoggingFilter.logRequestTo(pos))
			.addFilter(ResponseLoggingFilter.logResponseTo(pos))
			.setContentType(ContentType.JSON).build();
	return reqspec;
		}
		return reqspec;
	}
	public ResponseSpecification resspecdetails(){
		ResponseSpecification resspec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		return resspec;
		}
	public String readProperties(String Key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("src/test/java/Resources/global.properties");
		prop.load(fis);
		String test=prop.getProperty(Key);
		fis.close();
		return test;
	}
	public String getJSonpath(Response response,String key)
	{
		String resp=response.asString();
		System.out.println("I ma the response"+resp);
		JsonPath js=new JsonPath(resp);
		return js.get(key).toString();
	}
}
