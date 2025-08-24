package com.api.services;

import com.api.models.AuthenticationRequest;
import com.api.BaseRequestSpec.BaseRequest;
import com.api.models.SignUpRequest;
import io.restassured.response.Response;

public class AuthServices extends BaseRequest {
    public static String base_uri="/api/auth/";
    public Response login(AuthenticationRequest payload) {
        return post(payload, base_uri + "login");
    }
    public Response signUp(SignUpRequest payload)
    {
        return post(payload,base_uri+"signup");
    }
}
