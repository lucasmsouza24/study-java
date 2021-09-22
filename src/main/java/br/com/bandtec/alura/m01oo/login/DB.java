package br.com.bandtec.alura.m01oo.login;

import java.util.Arrays;

public class DB {
    
    private Account[] accounts = new Account[0];

    public void appendAcc(Account acc) {
        this.accounts = Arrays.copyOf(this.accounts, this.accounts.length + 1);
        this.accounts[this.accounts.length - 1] = acc;
    }

    public Boolean accExists(String user, String password) {

        Boolean accExists = false;

        // verifying if acc exists
        for (Account acc : this.accounts) {
            if (user.equals(acc.getUser()) && acc.isPassword(password)) {
                accExists = true;
                break;
            }
        }

        return accExists;
    }
}
