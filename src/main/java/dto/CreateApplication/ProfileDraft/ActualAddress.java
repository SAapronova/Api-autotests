package dto.CreateApplication.ProfileDraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)
@Data


public class ActualAddress {

    private String areaCode;
    private String areaName;
    private String building;
    private String city;
    private String house;
    private String apartmentNumber;
    private String regionCode;
    private String regionType;
    private String settlementCode;
    private String settlementTypeName;
    private String streetCode;
    private String streetName;
    private String postalCode;
    private String phone;
}
