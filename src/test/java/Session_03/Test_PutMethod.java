package Session_03;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_PutMethod {
    @Test
    void test_case03(){
        JSONObject jsonData = new JSONObject();
        jsonData.put("name", "morpheus");
        jsonData.put("job", "zion resident");

        RestAssured.baseURI = "https://reqres.in/api/users/2";
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonData.toJSONString())
                .when()
                .put()
                .then()
                .statusCode(403)
                .log().all();

    }
}
