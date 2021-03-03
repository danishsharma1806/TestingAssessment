package localApiTesting;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class LocalApiTest_Delete 
{
	@Test
	public void delete() 
	{
		baseURI = "http://localhost:3000";
		when().delete("/users/4").then().statusCode(204).log().all();
	}
}