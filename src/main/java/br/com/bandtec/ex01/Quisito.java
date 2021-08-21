package br.com.bandtec.ex01;
import java.util.Scanner;

public class Quisito {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        filhos 0-3 anos
        System.out.println("Quantidade de filhos de 0-3 anos:\n");
        Integer filhos0a3 = sc.nextInt();
        
//        filhos 4-16 anos
        System.out.println("Quantidade de filhos de 4-16 anos:\n");
        Integer filhos4a16 = sc.nextInt();
        
//        filhos 17-18 anos
        System.out.println("Quantidade de filhos de 17-18 anos:\n");
        Integer filhos17a18 = sc.nextInt();
        
//        valor da bolsa; 
        Double valor_bolsa = filhos0a3 * 25.12 + filhos4a16 * 15.88 +
                filhos17a18 * 12.44;
        
//        total de filhos
        Integer total_filhos = filhos0a3 + filhos4a16 + filhos17a18;
        
//        exibindo resultados
        String txt = "Você tem um total de %d filhos e vai receber R$%.2f de bolsa";
        txt = String.format(txt, total_filhos, valor_bolsa);
        System.out.println(txt);

        sc.close();
    }
}
