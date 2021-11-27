package br.com.bandtec.exercicios.ex07.aluno;

public class App {
    public static void main(String args[]) {
        Aluno a1 = new AlunoGraduacao("lucas", 1111, 9.3, 9.5);
        Aluno a2 = new AlunoGraduacao("nick", 2222, 10d, 9.8);
        AlunoFundamental a3 = new AlunoFundamental("matheus", 3333, 10d, 7d, 8d, 10d);

        // System.out.println(a1);
        // System.out.println(a2);
        System.out.println(a3);
    }
}
