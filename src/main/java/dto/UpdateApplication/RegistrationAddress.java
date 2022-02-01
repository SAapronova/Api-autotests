package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data

public class RegistrationAddress {
    public String areaCode;
    public String areaName;
    public String building;
    public String city;
    public String house;
    public String apartmentNumber;
    public String regionCode;
    public String regionType;
    public String settlementType;
    public String settlementName;
    public String streetType;
    public String streetName;
    public String postalCode;
    public String phone;
    public boolean missingAddressPhone;
}
