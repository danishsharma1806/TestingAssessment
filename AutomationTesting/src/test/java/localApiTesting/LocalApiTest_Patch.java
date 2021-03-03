package localApiTesting;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
public class LocalApiTest_Patch 
{
	@SuppressWarnings("unchecked")
	@Test
	public void patch() {

		JSONObject request = new JSONObject();

		request.put("lastName", "Black");
		request.put("firstName", "Panther");
	
		baseURI = "http://localhost:3000";

		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("/users/4")
		.then()
		.statusCode(200);

	}
}