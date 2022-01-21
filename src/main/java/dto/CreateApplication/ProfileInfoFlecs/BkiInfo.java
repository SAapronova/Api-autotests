package dto.CreateApplication.ProfileInfoFlecs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class BkiInfo {
    private String actualizedDate;
    private Number amountOwed;
    private Number amountOwedOriginal;
    private Boolean certificateRequired;
    private String closeDate;
    private String creditType;
    private String currency;
    private int index;
    private Number limit;
    private Number limitOriginal;
    private String number;
    private String openDate;
    private String openDateOriginal;
    private Number payment;
    private Boolean receivedFromBki;
}
