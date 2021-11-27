package br.com.bandtec.exercicios.ex07.aluno;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private List<Aluno> alunos;

    public Cadastro() {
        alunos = new ArrayList<>();
    }

    public void adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibeAlunosFundamental() {
        exibeAlunosPorClasse("AlunoFundamental");
    }

    public void exibeAlunosGraduacao() {
        exibeAlunosPorClasse("AlunoGraduacao");
    }

    public void exibeAlunosPos() {
        exibeAlunosPorClasse("AlunoPos");
    }

    private void exibeAlunosPorClasse(String className) {
        for (Aluno a : alunos) {
            if (className.equals(a.getClass().getSimpleName())) {
                System.out.println(a);
            }
        }
    }
}
