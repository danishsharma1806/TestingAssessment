package AdvancedTesting;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Put 
{	
	static String newAddress = "Summer Walk, Africa";
	public static void main(String[] args) 
	{
		String placeId=Post.placeId;
		given().log().all().
			queryParam("key", "qaclick123").
			header("Content-Type","application/json").
			body("{\r\n" + 
					"\"place_id\":\""+placeId+"\",\r\n" + 
					"\"address\":\""+newAddress+"\",\r\n" + 
					"\"key\":\"qaclick123\"\r\n" + 
					"}").
		when().
			put("maps/api/place/update/json")
		.then().
			assertThat().log().all().statusCode(200).
			body("msg", equalTo("Address successfully updated"));
	}
}