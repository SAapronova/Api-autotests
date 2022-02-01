package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client {
    public String embossingName;
    public String gender;
    public String education;
    public String mobilePhone;
    public String email;
    public String codeWord;
    public String eqId;
    public boolean nameChanged;
    public String previousFirstName;
    public String previousLastName;
    public String previousMiddleName;
    public String passportBirthPlace;
    public String passportBranchCode;
    public String passportIssuedBy;
    public String passportOldSeriesNumber;
    public String passportSeriesNumber;
    public String passportIssueDate;
    public Object missingOldPassportNumber;
    public String birthDate;
    public String lastName;
    public String firstName;
    public String middleName;
    public String category;
    public String maritalStatus;
    public Spouse spouse;
    public RegistrationAddress registrationAddress;
    public boolean addressEquals;
    public ActualAddress actualAddress;
    public ContactPerson contactPerson;
    public int mainIncome;
    public Employment employment;
    public String incConfType;
}
