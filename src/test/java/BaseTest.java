import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.epam.reportportal.junit5.ReportPortalExtension;

import static io.restassured.RestAssured.given;

@ExtendWith(ReportPortalExtension.class)
public class BaseTest {


    public static String cookie;

    @BeforeAll
    public static void getToken(){
       cookie= Authorization.authorization("LOGISTICS_TECH","LOGISTICS_TECH");
    }

    @Test
    public void updateApplication(){


    }


    @Test
    public void baseTest() {
        System.out.println("hi");
    }
}
