package br.com.bandtec.mavenproject1.nivelamento;

public class Interpolacao {
    
    public static void main(String[] args) {
        String nome = "Lucas";
        Integer idade = 20;
        Double altura = 1.83;
        Boolean aluno = true;

        // interpolação
        System.out.println(String.format("Nome: %s idade: %d altura: %.2f aluno: %s", nome,
                idade, altura, aluno));
     
    }
}
