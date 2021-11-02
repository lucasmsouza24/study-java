package br.com.bandtec.exercicios.ex02;

import java.util.Scanner;

public class Autenticacao {
    
    public static void main(String[] args) {
        
        // Instancia
        Scanner sc = new Scanner(System.in);

        // variaveis de input
        String inputNome;
        String inputSenha;
        
        // Credenciais de autenticação
        String nome = "admin";
        String senha = "#Bandtec";
        
        // iteração de input
        do {
            System.out.println("Nome: ");
            inputNome = sc.nextLine();
            
            System.out.println("Senha: ");
            inputSenha = sc.nextLine();
                
            if (!inputNome.equals(nome) || !inputSenha.equals(senha)) {
                System.out.println("Login e/ou usuário inválidos. Tente novamente");
            }

        } while (!inputNome.equals(nome) || !inputSenha.equals(senha));

        System.out.println("Login realizado com sucesso!");
        System.out.println("Bem vindo, " + nome);
        
        sc.close();
    }
    
}
