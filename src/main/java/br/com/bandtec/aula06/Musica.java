package br.com.bandtec.aula06;

public class Musica {
    
    private String nome;
    private Double duracao;

    public Musica(String nome, Double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Musica [duracao=" + duracao + ", nome=" + nome + "]";
    }
}
