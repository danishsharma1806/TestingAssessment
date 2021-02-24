import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class Test_Post 
{
	@SuppressWarnings("unchecked")
	@Test
	void post_Test()
	{
		JSONObject request=new JSONObject();
		request.put("name", "Danish");
		request.put("job", "Tester");
		
		given().
			header("Content-type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).
			log().all();
	}
}