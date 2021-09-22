package br.com.bandtec.alura.m01oo.login;

public class Account {
    
    private String user;
    private String password;

    Account(String user, String password) {
        this.user = user;
        this.password = password;
    }

    // get user
    public String getUser() {
        return this.user;
    }

    // return true if str == password
    public Boolean isPassword(String str) {
        return str.equals(this.password);
    }

    // get account informations without break security
    public String getInfo() {
        String str = "%s %s";
        return String.format(str, this.user, "*".repeat(this.password.length()));
    }
}
