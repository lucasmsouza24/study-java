package br.com.bandtec.mavenproject1.nivelamento;
import java.util.Scanner;

public class Condicionais {
    
    public static void main(String[] args) {
        
        /*
            ==
            !=
            >
            <
            >=
            <=
            &&
            ||
        */
        
        Integer dia = 1;
//        
//        if (dia == 1) {
//            System.out.println("Domingo");
//        } else if(dia == 2) {
//            System.out.println("Segunda-feira");
//        } else if(dia == 3) {
//            System.out.println("Terça-feira");
//        } else if(dia == 4) {
//            System.out.println("Quarta-feira");
//        } else if(dia == 5) {
//            System.out.println("Quinta-feira");
//        } else if(dia == 6) {
//            System.out.println("Sexta-feira");
//        } else if(dia == 7) {
//            System.out.println("Sábado");
//        } else {
//            System.out.println("Inválido");
//        }
        
//        Scanner sc = new Scanner(System.in);
//        Integer idade = sc.nextInt();
//        sc.close();
//        
//        if (idade >= 18) {
//            System.out.println("Pode tirar CNH");
//        } else {
//            System.out.println("Não pode");
//        }
        
        String txt1 = "Text";
        String txt2 = "Text";
        
//        Comparação de textos
        
//        ==
        System.out.println("==: " + (txt1 == txt2));
        
//        equals()
        System.out.println("equals: " + txt1.equals(txt2));
        
//        switch case
//        switch (dia) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//            default:
//                System.out.print("invalido");
//        }
        
//        ternario 
        Boolean condition = false;
        String txt = condition ? "sim" : "não";
        
        System.out.println(txt);
    }
}
