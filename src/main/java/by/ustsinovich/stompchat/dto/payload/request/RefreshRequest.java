package by.ustsinovich.stompchat.dto.payload.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RefreshRequest {

    @JsonProperty("refreshToken")
    private String refreshToken;

}
