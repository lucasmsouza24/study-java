package br.com.bandtec.ex03;

import java.util.Scanner;

public class DescontoProgressivo {
    
    public static void main(String[] args) {
        
        // scanner instance
        Scanner sc = new Scanner(System.in);

        Double unitaryValue;
        Integer quantity;

        do {
            System.out.println("Valor unitario do produto: (R$)");
            unitaryValue = sc.nextDouble();
        } while (unitaryValue <= 0);
        
        do {
            System.out.println("Quantidade: ");
            quantity = sc.nextInt();
        } while (quantity <= 0);

        DescontoProgressivoClass.exibirNotaFiscal(unitaryValue, quantity);

        // closing scanner instance
        sc.close();
    }
    
}
