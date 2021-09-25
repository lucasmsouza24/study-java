package br.com.bandtec.ex05.ex05colaborador;

public class Colaborador {
    
    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Colaborador(String nome, String cargo, Integer salario) {
        this(nome, cargo, Double.valueOf(salario));
    }

    private String nome;
    private String cargo;
    private Double salario;

    /**
     * @return nome do Colaborador
     */
    public String getNome() {
        return this.nome;
    } 

    /**
     * @return cargo do Colaborador
     */
    public String getCargo() {
        return this.cargo;
    }

    /**
     * atribui o valor de @param novoCargo 
     * como o cargo de Colaborador
     */
    public void setCargo(String novoCargo) {
        this.cargo = novoCargo;
    }

    /**
     * @return salário do Colaborador
     */
    public Double getSalario() {
        return this.salario;
    }

    /**
     * atribui o valor de @param novoSalario ao
     * salário do Colaborador
     */
    public void setSalario(Double novoSalario) {
        this.salario = novoSalario;
    }
    // overloading
    public void setSalario(Integer novoSalario) {
        setSalario(Double.valueOf(novoSalario));
    }

    @Override
    public String toString() {
        String str = "\nNome: %s\nCargo: %s\nSalario: R$ %.2f";
        return String.format(str, getNome(), getCargo(), getSalario());
    } 

}
