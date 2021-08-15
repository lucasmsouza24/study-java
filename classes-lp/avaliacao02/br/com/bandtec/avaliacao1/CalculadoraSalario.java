package br.com.bandtec.avaliacao1;
import java.util.Scanner;

public class CalculadoraSalario {
    
    public static void main(String[] args) {

        // instanciando Scanner
        Scanner sc = new Scanner(System.in);

        // Input salário
        System.out.println("Digite seu salário (R$): ");
        Double salario_bruto = sc.nextDouble();

        // Input imposto (%)
        System.out.println("Digite a quantidade de imposto a ser pago (%):");
        Double imposto_percent = sc.nextDouble();

        // calculo de imposto e salário líquido
        Double imposto = (salario_bruto * imposto_percent) / 100;
        Double salario_liquido = salario_bruto - imposto;
        
        // Fechando Scanner 
        sc.close();

        // Exibição de resultado
        String msg = "Salário bruto: R$ %.2f\nImposto a ser pago: R$ %.2f (%.1f %%)\nSalário Líquido: R$ %.2f";
        msg = String.format(msg, salario_bruto, imposto, imposto_percent, salario_liquido);
        System.out.println(msg);
    }
}
