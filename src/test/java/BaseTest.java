import POJO.Issue;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.epam.reportportal.junit5.ReportPortalExtension;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.core.IsEqual.equalTo;
import static ru.alfabank.apiData.EndPoints.BASE_PATH;
import static ru.alfabank.apiData.EndPoints.BASE_URL;

@ExtendWith(ReportPortalExtension.class)
public class BaseTest {

    @Test
    public void baseTest() {

        Issue issue=new Issue();

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setBasePath(BASE_PATH)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();

        given()
                .queryParam("constantid","FICCBI20220113000239")
               // .pathParam("constantid","FICCBI20220113000239")
           .body("").
        when()
           .get().
        then()
           .statusCode(200)
                .assertThat().body("I000000001",equalTo(issue.getAgentCode()));
    }

}
