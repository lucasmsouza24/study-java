package br.com.bandtec.exercicios.ex03;

public class IdadeClass {
    
    static void classificaIdade(Integer age) {
        String classification;

        if (age <= 2) {
            classification = "Bebê";
        } else if (3 <= age && age <= 11) {
            classification = "Criança";
        } else if (12 <= age && age <= 19) {
            classification = "Adolecente";
        } else if (20 <= age && age <= 30) {
            classification = "Jovem";
        } else if (31 <= age && age <= 60) {
            classification = "Adulto";
        } else {
            classification = "Idoso";
        }

        System.out.println("-".repeat(30));
        System.out.println("\t" + classification);
        System.out.println("-".repeat(30));
    }

}
