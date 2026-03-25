package Session_03;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_GetMethod {
    @Test
    void test_case01(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("This is the responce" +response.asString());
        System.out.println("This is the Status Code   " +response.getStatusCode());
        System.out.println("This is the body " +response.getBody().asString());
        System.out.println("This is the Time  " +response.getTime());
        System.out.println("This is the Header  " +response.getHeader("Content-Type"));

        // Validate the status code
        int expectedstatuscode = 403;
        int actualstatuscode = response.getStatusCode();

        Assert.assertEquals(expectedstatuscode, actualstatuscode);


    }


}
