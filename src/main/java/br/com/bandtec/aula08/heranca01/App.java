package br.com.bandtec.aula08.heranca01;

public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(2211044, "Lucas Mesquita");
        AlunoGraduacao a2 = new AlunoGraduacao(a1.getRa(), a1.getNome(), 7d, 8d);

        System.out.println("\n" + a1);
        System.out.println("\n" + a2);
    }
}
