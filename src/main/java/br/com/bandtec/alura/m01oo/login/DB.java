package br.com.bandtec.alura.m01oo.login;

import java.util.Arrays;

public class DB {
    
    private Account[] accounts = new Account[0];

    // append account to array
    public void appendAcc(Account acc) {
        this.accounts = Arrays.copyOf(this.accounts, this.accounts.length + 1);
        this.accounts[this.accounts.length - 1] = acc;
    }

    // get all account infos
    public String[] getAccs() { 

        // get String array with information about accounts
        String[] accs = new String[this.accounts.length];

        // append all info for each account
        for (int i = 0; i < this.accounts.length; i++) {
            accs[i] = this.accounts[i].getInfo();
        }

        return accs;
    }

    public Boolean userExists(String user, String password) {

        Boolean userExists = false;

        for (Account acc : this.accounts) {
            if (acc.isAuth(user, password)) {
                userExists = true;
            }
        }

        return userExists;
    }

}
