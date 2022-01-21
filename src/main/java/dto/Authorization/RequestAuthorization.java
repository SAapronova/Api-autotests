package dto.Authorization;


import lombok.Data;

@Data
public class RequestAuthorization {
    public String username;
    public String password;


    public RequestAuthorization(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
