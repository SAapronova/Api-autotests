package dto.CreateApplication.forDeliveryState;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryState {
    private List<DeliveryInfo> list = new ArrayList<>();
}
