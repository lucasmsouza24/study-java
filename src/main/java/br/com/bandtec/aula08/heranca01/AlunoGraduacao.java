package br.com.bandtec.aula08.heranca01;

public class AlunoGraduacao extends Aluno {

    // attributes
    private Double notaContinuada;
    private Double notaIntegrada;
    
    // constructors
    public AlunoGraduacao(Integer ra, String nome, Double notaContinuada, Double notaIntegrada) {
        super(ra, nome);
        this.notaContinuada = notaContinuada ;
        this.notaIntegrada = notaIntegrada;
    }

    public AlunoGraduacao(Aluno a, Double notaContinuada, Double notaIntegrada) {
        super(a.getRa(), a.getNome());
        this.notaContinuada = notaContinuada ;
        this.notaIntegrada = notaIntegrada;
    }

    // getters and setters

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    // methods
    @Override
    public String toString() {
        return "AlunoGraduacao [nome=" + this.nome + ", notaContinuada=" + notaContinuada + ", notaIntegrada=" + notaIntegrada + "]";
    }
}
