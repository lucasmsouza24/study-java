package br.com.bandtec.ex04.rh;

public class RecursosHumanos {
    
    // Attributes
    Integer totalPromovidos = 0, totalSalariosReajustados = 0;

    // reajustar salario
    public void reajustarSalario(Colaborador c, Double value ) {
        c.salario = value;
        totalSalariosReajustados++;
    }

    // promove colaborador se o novo salário for menor que o antigo
    public void promoverColaborador(Colaborador c, String cargo, Double salario) {
        if (salario > c.salario) {
            c.cargo = cargo;
            reajustarSalario(c, salario);
            this.totalPromovidos++;
        } else {
            System.out.println("Operação inválida. O salário de promoção deve ser maior que o salário atual.");
        }
    }

    // to string override
    @Override
    public String toString() {
        String str = "-".repeat(7) + 
        "Recursos Humanos" + "-".repeat(7) +
        "\nsalarios reajustados: %s" +
        "\npromovidos: %s\n" +
        "-".repeat(30);  
        return String.format(
            str,
            this.totalSalariosReajustados,
            this.totalPromovidos
        );
    }

}
