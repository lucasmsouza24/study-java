package br.com.bandtec.exercicios.ex05.ex07pokemon;

public class TreinadorPokemon {
    
    // construtores
    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel >= 0 ? nivel : 0;
    }
    public TreinadorPokemon(String nome) {
        this(nome, 0);
    }

    // atributos    
    private String nome;
    private Integer nivel;

    // metodos

    public void treinarPokemon(Pokemon p) {
        // atualizando atributos do pokemon
        p.setForca(p.getForca() * 1.1);
        p.setDoces(p.getDoces() + 10);

        // atualizando nível do treinador
        this.nivel += 2;
    }

    public void evoluirPokemon(Pokemon p, String nomeEvolucao) {

        // verificando se pokemon pussui doces suficientes
        if (p.getDoces() >= 50) {
            // armazenando nome antigo do pokemon
            String nomeAntigo = p.getNome();

            // atualizando dados do pokemon
            p.setNome(nomeEvolucao);
            p.setDoces(p.getDoces() - 50);

            // atualizando nível do treinador
            this.nivel += 10;

            // exibindo mensagem de evolução
            System.out.println(String.format("Pokemon %s evolui para -> %s", nomeAntigo, p.getNome()));
        } else {
            // doces insuficientes
            System.out.println("\nNão foi possível realizar a operação! Quantidade de doces insuficiente.");
        }
    }

    // nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // nivel
    public Integer getNivel() {
        return nivel;
    }
    public void setNivel(Integer nivel) {
        this.nivel = nivel >= 0 ? nivel : 0;
    }

    @Override
    public String toString() {
        return "\nTreinador: " + "\nnome: " + this.nome + "\nnível: " + this.nivel;
    }
}
