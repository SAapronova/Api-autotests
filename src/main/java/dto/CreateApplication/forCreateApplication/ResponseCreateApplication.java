package dto.CreateApplication.forCreateApplication;

import lombok.Data;

@Data
public class ResponseCreateApplication {
    private int responseCode;
    private String response;
    private String constantId;
    private String lidentifier;
}