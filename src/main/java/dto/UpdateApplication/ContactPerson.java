package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class ContactPerson {
    public String mobilePhone;
    public String lastName;
    public String firstName;
    public String middleName;
}
