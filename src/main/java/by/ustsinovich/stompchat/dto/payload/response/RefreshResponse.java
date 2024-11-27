package by.ustsinovich.stompchat.dto.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RefreshResponse {

    @JsonProperty("accessToken")
    private String accessToken;

    @JsonProperty("refreshToken")
    private String refreshToken;

}
