package dto.CreateApplication;

import lombok.Data;

@Data
public class PostStatusResponse {

    private String responseCode;
    private String appId;
    private String responseString;

}
