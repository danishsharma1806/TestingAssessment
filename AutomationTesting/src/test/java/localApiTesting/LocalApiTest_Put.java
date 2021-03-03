package localApiTesting;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class LocalApiTest_Put 
{
	@SuppressWarnings("unchecked")
	@Test
	public void put() {

		JSONObject request = new JSONObject();

		request.put("firstName", "Albert");
		request.put("lastName", "Einstein");
		request.put("subjectId", 2);

		baseURI = "http://localhost:3000";

		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("/users/4")
		.then()
		.statusCode(200);

	}
}