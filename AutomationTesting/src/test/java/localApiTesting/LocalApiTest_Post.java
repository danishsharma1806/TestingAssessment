package localApiTesting;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class LocalApiTest_Post 
{
	@SuppressWarnings("unchecked")
	@Test
	public void post() 
	{
		JSONObject request = new JSONObject();
		request.put("firstName", "Chadwick");
		request.put("lastName", "Bossman");
		request.put("subjectId", 1);

		baseURI = "http://localhost:3000";

		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("/users")
		.then()
		.statusCode(201);
	}
}