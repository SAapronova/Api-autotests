package dto.Authorization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ResponseAuthorization {
    public int status;
    public Token data;

//    public ResponseAuthorization(int status, Token token) {
//        this.status = status;
//        this.token = token;
//    }
}
