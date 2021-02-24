import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
public class Test_Delete 
{
	@Test
	void delete_Test()
	{
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
	}
}