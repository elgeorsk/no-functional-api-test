package reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredTest {
    private static final Logger log = LoggerFactory.getLogger(RestAssuredTest.class.getName());
    private static final String BASE_URL = "https://reqres.in/api";

    @Test (priority = 1)
    public static void getRegresListUsers(){

        RestAssured.baseURI = BASE_URL;

        Response response = null;
        try{
          response = given().when().get("/users?page=2");
          response.then().log().all();
        } catch (Exception e){
            log.error(e.toString());
        }

        try{
            Assert.assertEquals(200, response.getStatusCode());
            log.info(String.valueOf(response.getStatusCode()));
        } catch (Exception e) {
            log.error(e.toString());
        }
    }

    @Test (priority = 2)
    public static void postRegressRegisterSuccessful(){
        String requestBody = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";

        Response response = null;

        try{
            response = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .post("/register");
        } catch (Exception e){
            log.error(e.toString());
        }

        try{
            Assert.assertEquals(200, response.getStatusCode());
            log.info(String.valueOf(response.getStatusCode()));
        } catch (Exception e) {
            log.error(e.toString());
        }
    }

    @Test (priority = 3)
    public static void postRegressRegisterUnsuccessful() {
        String requestBody = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "}";

        Response response = null;

        try{
            response = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .post("/register");
        } catch (Exception e){
            log.error(e.toString());
        }

        try{
            Assert.assertEquals(400, response.getStatusCode());
            log.info(String.valueOf(response.getStatusCode()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
