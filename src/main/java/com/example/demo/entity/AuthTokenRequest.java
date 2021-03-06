package com.example.demo.entity;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthTokenRequest {

    @ApiModelProperty(notes = "Optional", example = "authorization_code")
    @SerializedName("grant_type")
    private String grantType;

    @SerializedName("client_id")
    private String clientId;

    @SerializedName("redirect_uri")
    private String redirectUri;

    private String code;

    @ApiModelProperty(notes = "Optional")
    @SerializedName("client_secret")
    private String clientSecret;
}
