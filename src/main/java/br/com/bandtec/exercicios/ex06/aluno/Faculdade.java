package br.com.bandtec.exercicios.ex06.aluno;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    // attributes
    private String nome;
    private Integer vagas;
    private List<Aluno> listaAlunos;
    
    // constructor
    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaAlunos = new ArrayList<>();
    }
    
    // methods
    public void matricularAluno(Aluno a) {
        if (vagas > 0) {
            this.listaAlunos.add(a);
            this.vagas--;
        } else {
            System.out.println("Vagas insuficientes!");
        }
    }

    public void exibirAlunosMatriculados() {
        System.out.println("Todos os alunos: ");
        for (Aluno a : this.listaAlunos) {
            System.out.println(a);
        }
    }

    public void exibirAlunosPos() {
        System.out.println("Alunos de Pós: ");
        for (Aluno a : this.listaAlunos) {
            if (a instanceof AlunoPos) {
                System.out.println(a);
            }
        }
    }

    @Override
    public String toString() {
        return "Faculdade [nome=" + nome + ", vagas=" + vagas + "]";
    }

    // getters and setters 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getVagas() {
        return vagas;
    }
    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    } 
}
