package Session_03;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test_DeleteMethod {
    @Test
    void test_case04() {
        // https://reqres.in/api/users/2

        RestAssured.baseURI = "https://reqres.in/api/users/2";
        RestAssured.given()
                .when()
                .delete()
                .then()
                .statusCode(204)
                .log().all();
    }
}
