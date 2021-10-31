package br.com.bandtec.ex05.ex05colaborador;

public class RecursosHumanos {
    
    private Integer totalPromovidos;
    private Integer totalSalariosReajustados;

    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalSalariosReajustados = 0;  
    }

    /**
     * Atribui @param novoSalario à colaborador @param c
     *  e incrementa 1 em totalSalariosReajustados
     */
    public void reajustarSalario(Colaborador c, Double novoSalario) {
        c.setSalario(novoSalario);
        this.totalSalariosReajustados++;
    }
    
    public void reajustarSalario(Colaborador c, Integer novoSalario) {
        reajustarSalario(c, Double.valueOf(novoSalario));
    }

    /**
     * 
     * Se @param novoSalario for maior que o salário atual
     * do colaborador @param c , atribui @param novoSalario e
     * @param novoCargo à @param c e incrementa 1 em totalPromovidos
     */
    public void promoverColaborador(Colaborador c, String novoCargo, Double novoSalario) {
        if (novoSalario > c.getSalario()) {
            c.setCargo(novoCargo);
            c.setSalario(novoSalario);
            this.totalPromovidos++;
        } else {
            System.out.println("Operação inválida");
        }
    }

    // overloading
    public void promoverColaborador(Colaborador c, String novoCargo, Integer novoSalario) {
        promoverColaborador(c, novoCargo, Double.valueOf(novoSalario));
    }

    /**
     * @return total de promovidos
     */
    public Integer getTotalPromovidos() {
        return this.totalPromovidos;
    }

    /**
     * @return total de salários reajustados
     */
    public Integer getTotalSalariosReajustados() {
        return this.totalSalariosReajustados;
    }

    @Override
    public String toString() {
        String str = "\nTotal salários reajustados: %d\nTotal promoções: %d";
        return String.format(str, getTotalSalariosReajustados(), getTotalPromovidos());
    }
}
