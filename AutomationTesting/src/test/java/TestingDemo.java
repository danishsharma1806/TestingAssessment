import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestingDemo 
{
	@Test
	void test1()
	{
		Response reponse=get("https://reqres.in/api/users?page=2");
		System.out.println(reponse.getBody());
		System.out.println(reponse.getStatusCode());
		System.out.println(reponse.getStatusCode());
		System.out.println(reponse.getTime());
		int check=reponse.getStatusCode();
		Assert.assertEquals(check, 200);
	}
	@Test
	void test2()
	{
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
}