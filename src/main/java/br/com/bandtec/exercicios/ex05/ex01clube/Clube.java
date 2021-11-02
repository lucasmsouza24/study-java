package br.com.bandtec.exercicios.ex05.ex01clube;

public class Clube {

    // construtor
    public Clube(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.pontos = 0;
    }
    
    // atributos
    private String nome;
    private Integer vitorias;
    private Integer empates;
    private Integer derrotas;
    private Integer pontos;
    private String ultimoJogo;

    // comportamentos

    public void registrarVitoria() {
        this.vitorias++;
        this.pontos += 3;
        registrarUltimoJogo("venceu");
    }

    public void registrarDerrota() {
        this.derrotas++;
        registrarUltimoJogo("perdeu");
    }

    public void registrarEmpate() {
        this.empates++;
        this.pontos++;
        registrarUltimoJogo("empatou");
    }

    // nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    // vitorias
    public Integer getVitorias() {
        return this.vitorias;
    }

    // derrotas
    public Integer getDerrotas() {
        return this.derrotas;
    }

    // empates
    public Integer getEmpates() {
        return this.empates;
    }

    // pontos
    public Integer getPontos() {
        return this.pontos;
    }

    // ultimo jogo
    public String getUltimoJogo() {
        return this.ultimoJogo;
    }

    private void registrarUltimoJogo(String situacao) {
        String str = "%s %s nessa rodada.";
        this.ultimoJogo = String.format(str, this.nome, situacao);
    }

    // override to string
    @Override
    public String toString() {
        String str = "-".repeat(30) + 
        "\nNome: %s" + 
        "\nVitorias: %d" +
        "\nDerrotas: %d" +
        "\nEmpates: %d" +
        "\nPontos: %d";
        return String.format(str, getNome(), getVitorias(), getDerrotas(), getEmpates(), getPontos());
    }
}
