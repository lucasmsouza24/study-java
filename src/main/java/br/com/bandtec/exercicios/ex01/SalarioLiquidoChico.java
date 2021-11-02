package br.com.bandtec.exercicios.ex01;
import java.util.Scanner;

public class SalarioLiquidoChico {
    
    public static void main(String[] args) {
        // instanciando Scanner
        Scanner sc = new Scanner(System.in);

        // inputs
        System.out.println("Digite seu salário bruto: ");
        Double salario_bruto = sc.nextDouble();

        System.out.println("Digite sua condução diária (ida): ");
        Double conducao_diaria_ida = sc.nextDouble();

        // fechando Scanner
        sc.close();

        // Calculos de impostos e salario líquido
        Double inss = salario_bruto * 0.1;
        Double ir = salario_bruto * 0.2;
        Double vt = conducao_diaria_ida * 2 * 22;
        Double total_descontos = inss + ir + vt;
        Double salario_liquido = salario_bruto - total_descontos;

        // Exibição
        String msg = "Salário bruto: R$ %.2f\nINSS: R$ %.2f\nIR: R$ %.2f\n" + 
        "VT: R$ %.2f\nTotal de descontos: R$ %.2f\nSalário líquido: R$ %.2f";
        msg = String.format(msg, salario_bruto, inss, ir, vt, total_descontos, salario_liquido);
        System.out.println(msg);
    }
}
