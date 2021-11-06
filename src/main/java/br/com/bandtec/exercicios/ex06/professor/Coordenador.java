package br.com.bandtec.exercicios.ex06.professor;

public class Coordenador extends Professor {
    // attributes
    private String curso;
    private Integer qtdHorasCoord;
    private Double valHoraCoord;

    // constructor
    public Coordenador(Integer codigo, String nome, Integer qtdHoras, Double valorHora, String curso, Integer qtdHorasCoord, Double valHoraCoord) {
        super(codigo, nome, qtdHoras, valorHora);
        this.curso = curso; 
        this.qtdHorasCoord = qtdHorasCoord;
        this.valHoraCoord = valHoraCoord;
    }

    // methods
    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + this.valHoraCoord * this.qtdHorasCoord * 4.5;
    }

    @Override
    public String toString() {
        // teste bizarro e gambiarristico para substituir valor do salario por calcularSalario do super e não do this
        // String superSal = String.valueOf(super.calcularSalario()).replace(".", ",");
        // String thisSal = String.valueOf(this.calcularSalario()).replace(".", ",");
        // return super.toString().replace(thisSal, superSal) + String.format("\ncurso: %s\nqtdHorasCoord: %d\nval/hrCoord: R$ %.2f\n", this.curso, this.qtdHorasCoord, this.valHoraCoord);
        
        return super.toString() + String.format("\ncoordena curso de %s\nhoras coord.: %d\nval/hr coord.: R$ %.2f\n", this.curso, this.qtdHorasCoord, this.valHoraCoord);
    }

    // getters and setters
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    } 
    public Integer getQtdHorasCoord() {
        return qtdHorasCoord;
    }
    public void setQtdHorasCoord(Integer qtdHorasCoord) {
        this.qtdHorasCoord = qtdHorasCoord;
    }
    public Double getValHoraCoord() {
        return valHoraCoord;
    }
    public void setValHoraCoord(Double valHoraCoord) {
        this.valHoraCoord = valHoraCoord;
    }
}
