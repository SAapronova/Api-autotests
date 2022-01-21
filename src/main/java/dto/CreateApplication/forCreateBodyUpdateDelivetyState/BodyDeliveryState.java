package dto.CreateApplication.forCreateBodyUpdateDelivetyState;

import lombok.Data;


@Data
public class BodyDeliveryState {
    private String comment = "Забыл паспорт. Нужно перенести встречу.";
    private String status = "";
    private String system = "logistics";
    private String user = "string";
}