import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import utils.CreateApplication;

import java.io.IOException;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;
import static ru.alfabank.apiData.EndPoints.BASE_PATH;
import static ru.alfabank.apiData.EndPoints.BASE_URL;

public class ApplicationUpdate {

    @Test

    public void ApplicationUpdate() throws IOException, InterruptedException {

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setBasePath(BASE_PATH)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

       CreateApplication create=new CreateApplication();
       create.getCourierMasterCardApplication("myzayavka");

        given()
                .queryParam("constantid",CreateApplication.getGlobalConstantId())
                .body("")

                .when()
                        .get()
                .then().statusCode(200);
               // .assertThat().body(")
    }
}
