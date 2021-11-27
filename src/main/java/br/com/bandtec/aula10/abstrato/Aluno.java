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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    
    
}
