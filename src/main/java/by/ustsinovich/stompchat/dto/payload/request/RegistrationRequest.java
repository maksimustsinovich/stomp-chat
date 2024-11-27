package by.ustsinovich.stompchat.dto.payload.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RegistrationRequest {

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

}
