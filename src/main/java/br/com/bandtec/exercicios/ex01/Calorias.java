package br.com.bandtec.exercicios.ex01;
import java.util.Scanner;

public class Calorias {
    
    static public void main(String[] args) {
        // Instanciando Scanner
        Scanner sc = new Scanner(System.in);

        // inputs
        // Tempo se aquecendo
        System.out.println("Por quanto tempo você se aqueceu? (min)");
        Integer min_aquecendo = sc.nextInt();

        // Tempo em exercícios aeróbicos
        System.out.println("Por quanto tempo você praticou exercícios aeróbicos? (min)");
        Integer min_aerobicos = sc.nextInt();

        // Tempo em exercícios de musculação
        System.out.println("Por quanto tempo você praticou exercícios de musculação? (min)");
        Integer min_musculacao = sc.nextInt();

        // Calorias perdidas
        Integer calorias_perdidas = (min_aquecendo * 12) + (min_aerobicos * 20) + (min_musculacao * 25);

        // Total de minutos treinados
        Integer total_minutos = min_aquecendo + min_aerobicos + min_musculacao;

        // Exibição de resultados
        String txt = "Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias";
        txt = String.format(txt, total_minutos, calorias_perdidas);
        System.out.println(txt);

        // fechando Scanner
        sc.close();
    }
}
