package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.authentication.AdminAuth.generateAdminToken;

public class ProjectBaseUrl {
    public static RequestSpecification spec;
    public static RequestSpecification specForDean;
    public static RequestSpecification specForViceDean;
    public static RequestSpecification specForTeacher;

    public static void schoolAdminSetup(){
        spec= new RequestSpecBuilder().
                setContentType(ContentType.JSON).addHeader("Authorization",generateAdminToken()).
                setBaseUri("https://mycampusmates.com").build();
    }

}
