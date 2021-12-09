package br.com.bandtec.exercicios.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Personagem {
    // atributos
    protected String codinome;
    protected String nome;
    protected List<SuperPoder> poderes;

    // construtor
    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        this.poderes = new ArrayList<>();
    }

    // métodos

    public void adicionaPoder(String nome, Integer categoria) {
        if (Objects.nonNull(nome) && Objects.nonNull(categoria)) {
            SuperPoder poder = new SuperPoder(nome, categoria);
            this.poderes.add(poder);
        }
    }

    public abstract Double getForcaTotal();

    protected Double getForcaTotalBruta() {
        Double total = 0d;

        for (SuperPoder poder : this.poderes) {
            total += poder.getCategoria();
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\n" + "=".repeat(40));

        str.append("\nPersonagem\n");

        str.append("-".repeat(40));
        str.append(String.format("\n%-20s%-10s","codinome", this.codinome));
        str.append(String.format("\n%-20s%-10s","nome", this.nome));

        // poderes
        str.append(String.format("\n\n%-20s%-10s\n", "Poder", "Categoria"));
        str.append("-".repeat(40));

        for (SuperPoder poder : this.poderes) {
            str.append(String.format("\n%-20s %4d", poder.getNome(), poder.getCategoria()));
        }

        str.append(String.format("\n\nPoder total: %.1f\n", this.getForcaTotal()));

        str.append("=".repeat(40) + "\n");

        return String.valueOf(str);
    }

    // getters e setters
    public String getCodinome() {
        return codinome;
    }
    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<SuperPoder> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<SuperPoder> poderes) {
        this.poderes = poderes;
    }  
}
