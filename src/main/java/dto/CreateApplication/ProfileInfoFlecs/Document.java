package dto.CreateApplication.ProfileInfoFlecs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {
    private String docType;
    private String docName;
    private String groupType;
    private String groupName;
    private Boolean selected;
    private String mandatory;
}
