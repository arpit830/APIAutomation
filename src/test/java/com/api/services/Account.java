package com.api.services.accountController;

import com.api.models.AccountRequest;
import com.api.BaseRequestSpec.BaseRequest;
import io.restassured.response.Response;

public class Account extends BaseRequest {

    public static String base_uri="/api/accounts";

    public Response account(AccountRequest payload)
    {
     return post(payload,base_uri+ "accounts");
    }
}
