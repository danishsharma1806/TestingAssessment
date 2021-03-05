package AdvancedTesting;

import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import org.testng.Assert;
import files.JavaCode;

public class Get 
{
	public static void main(String[] args) 
	{
		String placeId=Post.placeId;
		String getPlaceResponse=given().log().all().
									queryParam("key", "qaclick123").
									queryParam("place_id",placeId).
								when().
									get("maps/api/place/get/json").
								then().
									assertThat().log().all().statusCode(200).extract().response().asString();
		JsonPath js1=JavaCode.rawToJson(getPlaceResponse);
		String actualAddress =js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, Put.newAddress);
	}
}