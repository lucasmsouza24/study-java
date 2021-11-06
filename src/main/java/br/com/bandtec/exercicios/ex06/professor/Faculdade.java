package br.com.bandtec.exercicios.ex06.professor;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    // attributes
    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    // constructor
    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas > 0 ? vagas : 0;
        this.professores = new ArrayList<>();
    }

    // methods
    public void contratarProfessor(Professor p) {
        if (this.vagas > 0) {
            this.professores.add(p);
            this.vagas--;
            System.out.println("Professor " + p.getNome() + " cadastrado com sucesso!");
        } else {
            System.out.println("Vagas insuficientes para cadastrar " + p.getNome() + "!");
        }
    }

    public void exibirProfessores() {
        System.out.println("\nExibindo professores");
        System.out.println("=".repeat(30));
        for (Professor p : this.professores) {
            System.out.println(p);
        }
    }

    public Integer qtdCoord() {
        int quantidade = 0;
        for(Professor p : this.professores) {
            if (p instanceof Coordenador) {
                quantidade++;
            }
        }
        return quantidade;
    }

    @Override
    public String toString() {
        return String.format(
            "\nFaculdade: %s\nvagas: %d\nProfessores: %d\nCoordenadores: %d",
            this.nome, 
            this.vagas, 
            this.professores.size(),
            qtdCoord()
        );
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