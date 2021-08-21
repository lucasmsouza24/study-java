package br.com.bandtec.ex03;

import java.util.Scanner;

public class Autenticacao {
    
    public static void main(String[] args) {
        
        // Instancia
        Scanner sc = new Scanner(System.in);
        
        Boolean auth = false;
        
        String nome = "admin";
        String senha = "#Bandtec";
        
        // iteração de input
        while (!auth) {
            System.out.println("Nome: ");
            String inputNome = sc.nextLine();
            
            System.out.println("Senha: ");
            String inputSenha = sc.nextLine();
            
            if (inputNome.equals(nome) && inputSenha.equals(senha)) {
                auth = true;
                System.out.println("Login realizado com sucesso!");
                System.out.println("Bem vindo, " + nome);
            } else {
                System.out.println("Login e/ou usuário inválidos. Tente novamente");
            }
            
        }
    }
    
}
