package dto.CreateApplication.ProfileInfoFlecs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationTechInfo {

    private boolean loanAddInfoCC;
}
