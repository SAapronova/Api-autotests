package dto.CreateApplication.ProfileDraft;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)
@Data

public class ContactPerson {

    private String mobilePhone;
    private String firstName;
    private String middleName;
    private String lastName;
}
