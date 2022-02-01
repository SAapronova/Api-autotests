import dto.UpdateApplication.*;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import com.epam.reportportal.junit5.ReportPortalExtension;
import utils.CreateApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static io.restassured.RestAssured.given;

@ExtendWith(ReportPortalExtension.class)
public class BaseTest {


    public static String cookie;
    public static String constantId;
    public static String appId;


    @BeforeAll
    public static void getToken(){
       String token= Authorization.authorization("LOGISTICS_TECH","LOGISTICS_TECH");
       cookie="  -H $'Cookie: BIGipServer~Click~logistics-api=\\u0021M4BxYHrOS26iTSHCO0KjJIAQMUn8JGvU/bicBBPkrettSkBpFqqwib8hhvSLDhk/8ZH3/eT63aCGvb1kLK5dzSDA+8dv0Mz01CGB8c8NrQ==; _sp_ses.3c2b=*; ad-token="+token+"; _sp_id.3c2b=07da36e0-fd23-4b07-946a-38f6e6b4f973.1642437254.1.1642437260.1642437254.f832460a-1aa0-4ff0-8f1b-f0c4541668ea; negotiated=1";
    }
    @BeforeAll
    public static void createApp() throws IOException, InterruptedException {
        CreateApplication create=new CreateApplication();
                create.getCourierMasterCardApplication(constantId);
                constantId=CreateApplication.getGlobalConstantId();
                appId=CreateApplication.getGlobalAppId();
    }

    @Test
    public void updateApplication(){

        Spouse spouse=Spouse.builder()
                .lastName("ЖАТЬКО")
                .firstName("АНАТОЛИЙ")
                .middleName("СЕРГЕЕВИЧ")
                .phone("79923942934")
                .build();

        RegistrationAddress registrationAddress=RegistrationAddress.builder()
                .areaCode("")
                .areaName(null)
                .building(null)
                .city("Калуга")
                .house("3")
                .apartmentNumber(null)
                .regionCode("40")
                .regionType("10")
                .settlementType("")
                .settlementName(null)
                .streetType("729")
                .streetName("Пригородная")
                .postalCode("248009")
                .phone("79919239193")
                .missingAddressPhone(false)
                .build();

        ActualAddress actualAddress=ActualAddress.builder()
                .areaCode("")
                .areaName(null)
                .building(null)
                .city("Калуга")
                .house("3")
                .apartmentNumber(null)
                .regionCode("40")
                .regionType("10")
                .settlementType("")
                .settlementName(null)
                .streetType("729")
                .streetName("Пригородная")
                .postalCode("248009")
                .phone("79919239193")
                .missingAddressPhone(false)
                .build();

        ContactPerson contactPerson=ContactPerson.builder()
                .mobilePhone("79057144008")
                .firstName("НАДЕЖДА")
                .lastName("КЛИМОВА")
                .middleName("ОЛЕГОВНА")
                .build();

        Address address=Address.builder()
                .regionCode("77")
                .phone("74962440666")
                .build();

        Employment employment=Employment.builder()
                .address(address)
                .companyName("ООО \\\"Скудери Феррари\\")
                .companyInn("7728168971")
                .employmentType("E")
                .position("Киберспортсмен")
                .foreignTaxResident(false)
                .build();

        Client client=Client.builder()
                .embossingName("IVAN PETROV")
                .gender("F")
                .education("H")
                .mobilePhone("79778016749")
                .email("defhul@gmail.ruj")
                .codeWord("АНКЕТА51")
                .eqId("")
                .nameChanged(true)
                .previousFirstName("ПАВЛОВА")
                .previousLastName("КРАБОВА")
                .previousMiddleName("АЛЕКСЕЕВНА")
                .passportBirthPlace("ГОР. МОСКВА")
                .passportBranchCode("УВД ОРЕХОВО-БОРИСОВО ЮЖНОЕ")
                .passportIssuedBy("2342342342")
                .passportOldSeriesNumber("1000010502")
                .passportIssueDate("2009-05-25")
                .missingOldPassportNumber(null)
                .birthDate("1964-04-24")
                .lastName("НАДЕЖДА")
                .firstName("ПАВЛОВА")
                .middleName("АЛЕКСЕЕВНА")
                .category("01")
                .maritalStatus("M")
                .spouse(spouse)
                .registrationAddress(registrationAddress)
                .addressEquals(false)
                .actualAddress(actualAddress)
                .contactPerson(contactPerson)
                .mainIncome(100000)
                .employment(employment)
                .incConfType("NOT_CONF")
                .build();

        GraceProduct graceProduct=GraceProduct.builder()
                .cashWithdrawalFeesMin(500)
                .maxPercentRate(33.99)
                .notConfCreditPercentCash(49.99)
                .annualFees(1490)
                .cashLimit(300000)
                .gracePeriod(100)
                .cashWithdrawalFees(5.9)
                .firstYearFees(0)
                .gracePeriodCash(100)
                .notConfCreditPercent(39.99)
                .creditPercentCash(44.99)
                .build();

        CreditCardProduct creditCardProduct=CreditCardProduct.builder()
                .cardName("MC Standard")
                .cardId("HQ")
                .loanSum(65000)
                .cardCategory("CLASSIC")
                .cardType("MASTER_CARD_MASS")
                .productCode("ODRC")
                .loanSumRecommended(65000)
                .paymentSystem("MASTERCARD")
                .currency("RUR")
                .gracePeriod(0)
                .gracePeriodCash(0)
                .cardIssueType("BRANCH_EMBOSSING")
                .deliveryBranch("MOWR")
                .acceptedLimitEnabled(true)
                .cashWithdrawalFees(5.9)
                .cashWithdrawalFeesMin(500)
                .creditPercent(24.99)
                .annualFees(0)
                .firstYearFees(0)
                .cardIssueTypeDescription("Эмбоссирование в отделении")
                .graceProduct(graceProduct)
                .build();


        DocumentList documentList=DocumentList.builder()
                .docType("001")
                .docName("Паспорт гражданина РФ")
                .groupType("O")
                .groupName("Группа обязательных документов")
                .selected(true)
                .mandatory(true)
                .build();

        LogisticsCenter logisticsCenter=LogisticsCenter.builder()
                .pxSubscript("LogisticsCenter")
                .address("117556, г. Москва, Варшавское ш., д. 76, корп. 1")
                .cityKladr("7700000000000")
                .name("ДО «ВАРШАВСКИЙ»")
                .city("Москва")
                .mnemonic("MOWR")
                .code("0433")
                .build();

        WorkPoint workPoint=WorkPoint.builder()
                .logisticsCenter(logisticsCenter)
                .build();

        UpdateApplication update= UpdateApplication.builder()
                .appLength("SHORT")
                .productType("CCBI")
                .consentId("537775645")
                .extConstantId("FFCCBI2201215130105") //надо подумать как брать
                .client(client)
                .creditCardProduct(creditCardProduct)
                .deliveryType("COURIER")
                .smartRepeat(false)
                .additionalFieldsFilled(false)
                .documentList(new ArrayList<DocumentList>(Arrays.asList(documentList)))
                .signedByBasicEs(true)
                .constantId(constantId)
                .stage("S573_ShortAppAdditionalFilling")
                .appId(appId)
                .advertCode("no_site_code")
                .createDateTime("2022-01-21 17:21:23")
                .leadId(constantId)
                //.pilots(new ArrayList<Object>(Arrays.asList("")))
                .workPoint(workPoint)
                .digitalProfileExist(false)
                .digitalProfileId(null)
                .abTestVariant(null)
                .additionalFilledByClient(null)
                .build();



        UpdateResponse updateResponse =given()
                .header("Cookie",cookie)
                .header("login","LOGISTICS_TECH")
                .param("constantid",constantId)
                .body(update)
                //.put("/logistics-api/cartman/alfaform-eo/api/applications/F5ODRC20S22012100011")
                .put("/logistics-api/cartman/alfaform-eo/api/applications/"+appId)
                .then().log().all()
                .extract().as(UpdateResponse.class);

        Assertions.assertEquals(200,updateResponse.getStatus());


    }

    @Test
    public void baseTest() {
        System.out.println("hi");
    }
}
