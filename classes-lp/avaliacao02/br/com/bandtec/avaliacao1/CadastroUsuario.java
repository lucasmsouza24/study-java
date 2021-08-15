package br.com.bandtec.avaliacao1;
import java.util.Scanner;

public class CadastroUsuario {
    
    public static void main(String[] args) {
//        Scanner
        Scanner sc = new Scanner(System.in);
        Scanner num_sc = new Scanner(System.in);
        
//        input login
        System.out.println("Digite seu login: ");
        String login = sc.nextLine();
        
//        input senha 
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();
        
//        input limite de bloqueio
        System.out.println("Defina um limite de bloqueio: ");
        Integer limite_bloqueio = num_sc.nextInt();
        
//        Exibição do resultado
        String txt = "Seu login é %s e sua senha é %s. Você tem %d tentativas"
                + " antes de ser bloqueado";
        txt = String.format(txt, login, senha, limite_bloqueio);
        System.out.println(txt);

        sc.close();
        num_sc.close();
    }
}
