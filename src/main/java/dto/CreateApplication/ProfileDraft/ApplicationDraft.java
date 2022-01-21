package dto.CreateApplication.ProfileDraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationDraft {

    private Client client;
    private int loanSum;
    private String lastName;
    private String contactPersonMobilePhone;
    private String contactPersonFirstName;
    private String contactPersonMiddleName;
    private String contactPersonLastName;
    private String passportBirthPlace;
    private String passportBranchCode;
    private String passportIssuedBy;
    private String passportOldSeriesNumber;
    private boolean isNameChanged;
    private String previousFirstName;
    private String previousLastName;
    private String previousMiddleName;
    private boolean isForeignTaxResident;
    private String maritalStatus;
    private String spouseLastName;
    private String spouseFirstName;
    private String spouseMiddleName;
    private String spouseBirthDate;
    private String spousePhone;
    private String registrationAddressPhone;
    private boolean isAddressEquals;
    private String actualAddressPhone;
    private Boolean basicEs;
    private String registrationAreaCode;
    private String registrationAreaName;
    private String registrationBuilding;
    private String registrationCityName;
    private String registrationHouse;
    private String registrationFlat;
    private String registrationRegionCode;
    private String registrationRegionTypeCode;
    private String registrationSettlementCode;
    private String registrationSettlementName;
    private String registrationStreetCode;
    private String registrationStreetName;
    private String registrationZip;
    private String residenceAreaCode;
    private String residenceAreaName;
    private String residenceBuilding;
    private String residenceCityName;
    private String residenceHouse;
    private String residenceFlat;
    private String residenceRegionCode;
    private String residenceRegionTypeCode;
    private String residenceSettlementCode;
    private String residenceSettlementName;
    private String residenceStreetCode;
    private String residenceStreetName;
    private String residenceZip;
    private List<Document> doc= new ArrayList<>();
}