package br.com.bandtec.exercicios.ex03;

public class DescontoProgressivoClass {
    
    static void exibirNotaFiscal(Double prodValue, Integer quantity) {
        
        System.out.println("-".repeat(40));

        String txt = "Valor do produto: R$ %.2f\nQuantidade: %d";
        txt = String.format(txt, prodValue, quantity);
        System.out.println(txt);

        System.out.println("-".repeat(40));
        txt = "Valor com desconto: R$%.2f";
        txt = String.format(txt, calcularDesconto(prodValue, quantity));
        System.out.println(txt);
    }

    static Double calcularDesconto(Double prodValue, Integer quantity) {
        Double bruto = prodValue * quantity;

        if (quantity == 1) {
            return bruto * 0.9;
        } else if (quantity == 2) {
            return bruto * 0.8;
        } else if (quantity >= 3) {
            return bruto * 0.7;
        } else {
            return 0d;
        }
    }
}
