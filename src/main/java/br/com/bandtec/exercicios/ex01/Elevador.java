package br.com.bandtec.exercicios.ex01;
import java.util.Scanner;

public class Elevador {
    
    public static void main(String[] args) {
        // intanciando Scanner
        Scanner sc = new Scanner(System.in);

        // input limites do elevador
        System.out.println("Digite o limite de peso do elevador (kg): ");
        Double limite_peso = sc.nextDouble();

        System.out.println("Digite o limite de pessoas do elevador: ");
        Integer limite_pessoas = sc.nextInt();

        // input peso das pessoas
        System.out.println("Digite o peso da 1º pessoa (kg): ");
        Double peso_1 = sc.nextDouble();

        System.out.println("Digite o peso da 2º pessoa (kg): ");
        Double peso_2 = sc.nextDouble();

        System.out.println("Digite o peso da 3º pessoa (kg): ");
        Double peso_3 = sc.nextDouble();

        // fechando Scanner
        sc.close();

        // Calculo de peso total do elevador
        Double peso_total = peso_1 + peso_2 + peso_3;

        // Exibição de informações
        String msg = "Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\n" +
        "O peso total no elevador é de %.1f kg, sendo que ele suporta %.1f kg";
        msg = String.format(msg, limite_pessoas, peso_total, limite_peso);
        System.out.println(msg);
    }
}
