package br.com.bandtec.aula10.abstrato;

public abstract class Aluno {
    
    // attributes
    private String nome;
    private String ra;

    // constructor
    public Aluno(String nome,String ra) {
        this.nome = nome;
        this.ra = ra;
    }; 

    // methods
    public abstract Double calcularNota();
    
}
