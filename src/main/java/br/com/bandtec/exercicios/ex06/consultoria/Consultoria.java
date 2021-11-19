package br.com.bandtec.exercicios.ex06.consultoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Consultoria {
    // attributes
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> devs;

    // constructors
    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.devs = new ArrayList<>();
    }

    // methods
    public Boolean existePorNome(String nome) {

        if (Objects.nonNull(nome) && this.devs.size() > 0) {
            for (Desenvolvedor dev : devs) {
                if (dev.getNome().equals(nome)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void contratar(Desenvolvedor d) {
        if (vagasDisponiveis() > 0) {
            this.devs.add(d);
        } else {
            System.out.println("");
        }
    }

    private Integer vagasDisponiveis() {
        return this.vagas - this.devs.size();
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
