package br.com.bandtec.aula08.heranca01;

public class Aluno {
    private Integer ra;
    protected String nome;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    protected Aluno() {
        
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", ra=" + ra + "]";
    }
    
    
}
