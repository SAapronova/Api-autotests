package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class Employment {
    public Address address;
    public String companyName;
    public String companyInn;
    public String employmentType;
    public String position;
    public boolean foreignTaxResident;
}
