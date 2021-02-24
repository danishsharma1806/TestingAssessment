import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class Test_Patch 
{
	@SuppressWarnings("unchecked")
	@Test
	void patch_Test()
	{
		JSONObject request=new JSONObject();
		request.put("name", "Danish");
		request.put("job", "IAS Officer");
		
		given().
			header("Content-type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
	}

}