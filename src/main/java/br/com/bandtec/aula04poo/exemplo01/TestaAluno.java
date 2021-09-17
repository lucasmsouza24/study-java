package br.com.bandtec.aula04poo.exemplo01;

import java.util.concurrent.ThreadLocalRandom;

public class TestaAluno {
    
    public static void main(String[] args) {

        // Aluno aluno1 = new Aluno(02211044, "Lucas Mesquita", 8d, 9d);
        // Aluno aluno2 = new Aluno(02211045, "Felipe Cruz", 10d, 9d);
        // Aluno aluno3 = new Aluno(02211046, "Adalberto", 6d, 4d);
        
        // System.out.println(aluno1);
        // System.out.println(aluno2);
        // System.out.println(aluno3);

        for (Integer ra = 2211000; ra <= 2211100; ra += 1) {
            Aluno aluno = new Aluno(ra, "Default Name", ThreadLocalRandom.current().nextDouble(4, 10), ThreadLocalRandom.current().nextDouble(4, 10));
            System.out.println(aluno);
        }
    }
}
