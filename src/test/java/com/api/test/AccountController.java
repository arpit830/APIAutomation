package com.api.test;



import com.api.services.accountController.Account;
import com.api.models.AccountRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class AccountController {


    @Test
    public void account() {
        AccountRequest ac_payload=new AccountRequest("SAVINGS","string");
        Account ac=new Account();
        Response rs=ac.account(ac_payload);

        System.out.println(rs.prettyPrint()
        );
    }
}
