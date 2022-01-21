package dto.CreateApplication.forMetadata;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetadataResponse {
    private Boolean draftSent;
    private Boolean updateSent;
    private Boolean smartRepeatSent;
}
