package utilities.authentication;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AdminAuth {
    public static String generateAdminToken(){
        Map<String,Object> body =new HashMap<>();
        body.put("password","12345678");
        body.put("username","Admin103");
        Response response=given().contentType(ContentType.JSON).body(body).post("https://mycampusmates.com/app/auth/login");
  return response.jsonPath().getString("token");
    }
}
