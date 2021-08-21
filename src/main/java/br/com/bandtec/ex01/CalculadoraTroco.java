package br.com.bandtec.ex01;
import java.util.Scanner;

public class CalculadoraTroco {
    
    public static void main(String[] args) {
        // Instanciando Scanner
        Scanner sc = new Scanner(System.in);

        // inputs
        System.out.println("Digite o valor unitário do produto: ");
        Double valor_unitario = sc.nextDouble();

        System.out.println("Digite a quantidade vendida: ");
        Integer quantidade_vendida = sc.nextInt();

        System.out.println("Digite o valor entregue pelo comprador: ");
        Double dinheiro_entregue = sc.nextDouble();

        // Fechando instancia do Scanner
        sc.close();

        // calculo de valor total e troco
        Double valor_total = valor_unitario * quantidade_vendida;
        Double troco;
        
        if (dinheiro_entregue > valor_total) {
            troco = dinheiro_entregue - valor_total;
        } else {
            troco = 0d;
        }

        // Exibição de resultados
        String msg = "Valor unitário: R$ %.2f\nQuantidade vendida: %d\n" +
        "Valor total: R$ %.2f\nDinheiro entregue: R$ %.2f\nTroco: R$ %.2f";
        msg = String.format(msg, valor_unitario, quantidade_vendida, valor_total, dinheiro_entregue, troco);
        System.out.println(msg);
    }
}
