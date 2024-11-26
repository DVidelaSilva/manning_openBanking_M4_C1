package com.manning.openbanking.security;

import org.springframework.stereotype.Component;

@Component
public class OAuthTokenResponse {

    private String access_token;

        public String getAccessToken() {
            return access_token;
        }

        public void setAccessToken(String access_token) {
            this.access_token = access_token;
        }
}


