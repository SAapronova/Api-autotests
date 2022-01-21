package dto.CreateApplication.ProfileDraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)
@Data


public class Spouse {

    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private String phone;
}
