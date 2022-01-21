package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class RegistrationAddress {
    public String areaCode;
    public Object areaName;
    public Object building;
    public String city;
    public String house;
    public Object apartmentNumber;
    public String regionCode;
    public String regionType;
    public String settlementType;
    public Object settlementName;
    public String streetType;
    public String streetName;
    public String postalCode;
    public String phone;
    public boolean missingAddressPhone;
}
