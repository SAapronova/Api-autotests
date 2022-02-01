package dto.UpdateApplication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data

public class Spouse {
    public String lastName;
    public String firstName;
    public String middleName;
    public String phone;
}
