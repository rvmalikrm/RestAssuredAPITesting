package Session_03;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_PostMethod {
    @Test
    void testcase02(){
        JSONObject jsonData = new JSONObject();
        jsonData.put("name", "morpheus");
        jsonData.put("job", "leader");
        RestAssured.baseURI = "https://reqres.in/api/users";
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonData.toJSONString())
                .when().post()
                .then()
                .statusCode(403)
                .log().all();

        // https://reqres.in/api/users
    }
}
