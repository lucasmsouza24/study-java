package br.com.bandtec.exercicios.ex06.professor;

public class App {
    public static void main(String[] args) {
        Professor p1 = new Professor(1, "lucas", 10, 20d);
        Coordenador c1 = new Coordenador(2, "Diego", 10, 20d, "Java", 3, 30d);

        Faculdade f1 = new Faculdade("Bandtec", 1);

        f1.contratarProfessor(p1);
        f1.contratarProfessor(c1);

        System.out.println(f1);
        f1.exibirProfessores();

        // System.out.println(p1);
        // System.out.println(c1);
    }
}
