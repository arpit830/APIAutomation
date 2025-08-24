package com.api.models;

public class AccountRequest {

    private String accountType;


    private String branch;

    public AccountRequest(String accountType, String branch) {
        super();
        this.accountType = accountType;
        this.branch = branch;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranch() {
        return branch;
    }


    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "AccountRequest{" +
                "accountType='" + accountType + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
