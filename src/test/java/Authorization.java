import dto.Authorization.RequestAuthorization;
import dto.Authorization.ResponseAuthorization;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static ru.alfabank.apiData.EndPoints.BASE_URL;

public class Authorization {

  //  public static String cookie;

    public static String authorization(String username,String password){

        RestAssured.baseURI = "https://testjmb.alfabank.ru";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

//        RequestAuthorization request=new RequestAuthorization("LOGISTICS_TECH","LOGISTICS_TECH");
        RequestAuthorization request=new RequestAuthorization(username,password);
        ResponseAuthorization response=given()
                .body(request)
                .post("/logistics-api/cartman/alfaform-eo/api/login")
                .then().log().all()
                .extract().as(ResponseAuthorization.class);

        String cookie=response.getData().getToken();
        System.out.println(cookie);
        return cookie;
    }
}
