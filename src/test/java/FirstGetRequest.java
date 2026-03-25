import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class FirstGetRequest {

   // https://reqres.in/api/test-suite/collections/users/records

@Test
    void testcase01()
{
  Response res= RestAssured.get("https://reqres.in/api/users/2");
    System.out.println("This is the responce" +res.asString());
    System.out.println("This is the Status Code   " +res.getStatusCode());
}
}
