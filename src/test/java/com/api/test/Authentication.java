package com.api.test;

import com.api.services.AuthServices;
import com.api.models.AuthenticationRequest;
;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Authentication {

    @Test
    public void login()
    {
        AuthenticationRequest ac_payload=
                new AuthenticationRequest("string","string");
        AuthServices lg = new AuthServices();
        Response l=lg.login(ac_payload);
        System.out.println(l.prettyPrint());
    }
}
