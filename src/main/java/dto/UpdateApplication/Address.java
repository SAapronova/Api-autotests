package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class Address {
    public String regionCode;
    public String phone;
}
