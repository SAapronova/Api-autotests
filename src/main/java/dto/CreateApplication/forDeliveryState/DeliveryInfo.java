package dto.CreateApplication.forDeliveryState;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryInfo {
    private String uuid;
    private String status;
}
