package br.com.bandtec.exercicios.ex06.aluno;

public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "lucas", 9d, 7d);
        Aluno a2 = new Aluno(2, "vini", 10d, 9d);
        Aluno a3 = new AlunoPos(3, "diego", 10d, 9d, 9d);

        Faculdade f = new Faculdade("Bandtec", 10);
        f.matricularAluno(a1);
        f.matricularAluno(a2);
        f.matricularAluno(a3);

        f.exibirAlunosMatriculados();
        System.out.println("\n");
        f.exibirAlunosPos();
        
        // String str = "\nO aluno %s tem média %.2f\n";
        // System.out.println(String.format(str, a1.getNome(), a1.calculaMedia()));
        // System.out.println(String.format(str, a2.getNome(), a2.calculaMedia()));
        // System.out.println(String.format(str, a3.getNome(), a3.calculaMedia()));

        // System.out.println("\n" + a1 + "\n");
        // System.out.println("\n" + a2 + "\n");
        // System.out.println("\n" + a3 + "\n");
    }
}
