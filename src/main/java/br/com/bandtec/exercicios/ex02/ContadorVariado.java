package br.com.bandtec.exercicios.ex02;

public class ContadorVariado {
    
    public static void main(String[] args) {

        for (Double i = 0.15; i < 5; i += 0.15) {

            String txt = "%.2f";
            txt = String.format(txt, i);
            System.out.println(txt);
        }

    }
}
