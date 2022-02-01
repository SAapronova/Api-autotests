package dto.UpdateApplication;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
public class LogisticsCenter {
    public String pxSubscript;
    public String address;
    public String cityKladr;
    public String name;
    public String city;
    public String mnemonic;
    public String code;
}
