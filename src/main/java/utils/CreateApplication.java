package utils;

import dto.CreateApplication.ProfileInfoFlecs.ApplicationProfile;
import dto.CreateApplication.forCreateApplication.ResponseCreateApplication;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.commons.io.IOUtils;
import lombok.experimental.Delegate;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;


import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import static io.restassured.RestAssured.given;
import static ru.alfabank.alfatest.cucumber.ScopedVariables.resolveVars;

public class CreateApplication {

    @Delegate
    AkitaScenario akitaScenario = AkitaScenario.getInstance();

    private static String createApplicationCourierUrl = resolveVars("https://testjmb.alfabank.ru/logistics-api/alfaform-generation-application-to-flecs-api/applications/create");
    private static String getUrl = resolveVars("https://testjmb.alfabank.ru/logistics-api/alfaform-eo-flow-api/applications?constantId=");
    private static String stage = "";

    // Данный блок используется для обеспечения правильной работы глобальной перменной при многопоточном запуске
    private static final ThreadLocal<String> globalConstantId = new  ThreadLocal<>();

    public final static String getGlobalConstantId() {
        return globalConstantId.get();
    }

    public final static void setGlobalConstantId(String globalConstant) {
        globalConstantId.set(globalConstant);
    }

    public void getCourierMasterCardApplication(String constantID) throws IOException, InterruptedException {

        InputStream requestStream = ClassLoader.getSystemClassLoader().getResourceAsStream("request/RequestMasterCardCourierApplication.json");
        byte[] requestBytes = IOUtils.toByteArray(requestStream);
        ResponseCreateApplication responseCreateApplication = given()

                .contentType(ContentType.JSON)
                .body(requestBytes)
                .post(URI.create(createApplicationCourierUrl))
                .as(ResponseCreateApplication.class);

        System.out.println(responseCreateApplication.getConstantId());
        String url = getUrl + responseCreateApplication.getConstantId();
        String newConstant = responseCreateApplication.getConstantId();


        while (!"S573_ShortAppAdditionalFilling".equals(stage)) {
            ApplicationProfile applicationProfile = RestAssured.given()
                    .get(url)
                    .as(ApplicationProfile.class);
            stage = applicationProfile.getStage();
        }
        //akitaScenario.setVar(constantID, newConstant);
        setGlobalConstantId(newConstant);
        stage = "";
    }
}
