package JsonParsing;

import files.Json;
import io.restassured.path.json.JsonPath;

public class OperationsJson {

	public static void main(String[] args) 
	{
		JsonPath js=new JsonPath(Json.CoursePrice());
		
		int count=	js.getInt("courses.size()");
		System.out.println(count);
		int totalAmount= js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);

		String titleFirstCourse=js.get("courses[0].title");
		System.out.println(titleFirstCourse);
  
		for(int i=0;i<count;i++)
		{
			String courseTitles=js.get("courses["+i+"].title");
			System.out.print(courseTitles+" ");
			System.out.println(js.get("courses["+i+"].price").toString());
		}
  
		System.out.println("Print no of copies sold by RPA Course");
 
		for(int i=0;i<count;i++)
		{
			String courseTitles=js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("RPA"))
			{
				int copies=js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;
			}
		}
	}
}