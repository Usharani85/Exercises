package Resources;

import pojo.SetLocation;
import pojo.SetLocationDetails;

public class TestDatabuild {

	public SetLocationDetails getlocationdata(String name,String language,String address) {
		String[] type= {"shoe park1","shop1"};
		//RestAssured.baseURI="https://rahulshettyacademy.com";
		SetLocation setlat=new SetLocation();
		setlat.setLat(-38.383494);
		setlat.setLng(33.427362);
		SetLocationDetails setde=new SetLocationDetails();
		setde.setLocation(setlat);
		setde.setAccuracy(50);
		setde.setName(name);
		setde.setPhone_number("(+91) 983 893 3937");
		setde.setAddress(address);
		setde.setWebsite("http://google.com");
		setde.setTypes(type);
		setde.setLanguage(language);
		return setde;
	}
	public String setDeleteLocation(String placeid)
	{
		return "{\r\n    \"place_id\" :\""+placeid+"\"\r\n}";
	}
}
