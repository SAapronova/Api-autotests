package dto.UpdateApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Spouse {
    public String lastName;
    public String firstName;
    public String middleName;
    public String phone;
}
