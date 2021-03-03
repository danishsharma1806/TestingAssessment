package localApiTesting;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class LocalApiTest_Get 
{
	@Test
	public void get() 
	{
		baseURI = "http://localhost:3000";
		given().
			get("/users").
		then().
			statusCode(200).log().all();
	}
}