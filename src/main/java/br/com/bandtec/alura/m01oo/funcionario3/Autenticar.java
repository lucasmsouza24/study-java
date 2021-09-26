package br.com.bandtec.alura.m01oo.funcionario3;

public class Autenticar {
    
    public static Boolean autenticarFuncionario(Autenticavel a, String senha) {
        return a.senhaCorreta(senha);
    }

}
