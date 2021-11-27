package br.com.bandtec.exercicios.ex07.aluno;

public class App {
    public static void main(String args[]) {
        Aluno a1 = new AlunoGraduacao("lucas", 1111, 9.3, 9.5);
        Aluno a2 = new AlunoGraduacao("nick", 2222, 10d, 9.8);
        AlunoFundamental a3 = new AlunoFundamental("matheus", 3333, 5d, 7d, 8d, 5.5);
        AlunoPos a4 = new AlunoPos("erick", 4444, 9d, 10d, 8.4d);

        
        // System.out.println("\n\n\n");
        // System.out.println(a1.getClass().getSimpleName());

        Cadastro c1 = new Cadastro();

        c1.adicionaAluno(a1);
        c1.adicionaAluno(a2);
        c1.adicionaAluno(a3);
        c1.adicionaAluno(a4);

        c1.exibeAlunosPos();
    }
}
