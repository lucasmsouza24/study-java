package br.com.bandtec.ex05.ex05carro;

public class Carro {
    
    public Carro(String modelo) {
        setModelo(modelo);
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    private Boolean ligado;
    private String modelo;
    private Integer marcha;
    private Integer velocidade;

    // getters

    /**
     * @return true se o carro estiver ligado
     * e false se o carro estiver desligado
     */
    public Boolean getLigado() {
        return this.ligado;
    }

    /**
     * @return o modelo do carro
     */
    public String getModelo() {
        return this.modelo;
    }

    /**
     * @return a marcha atual do carro
     */
    public Integer getMarcha() {
        return this.marcha;
    }

    /**
     * @return a velocidade atual do carro
     */
    public Integer getVelocidade() {
        return this.velocidade;
    }

    // comportamentos

    /**
     * Liga o carro
     */
    public void ligar() {
        this.ligado = true;
    }

    /**
     * incrementa em 1 o valor da marcha 
     * (apenas valores entre -1 e 5)
     */
    public void aumentarMarcha() {
        if (this.ligado && (-1 <= this.marcha && this.marcha < 5)) {
            this.marcha++;
        }
    }

    /**
     * decrementa em 1 o valor da marcha
     * (apenas valores entre -1 e 5)
     */
    public void reduzirMarcha() {
        if (this.ligado && (-1 < this.marcha && this.marcha <= 5)) {
            this.marcha--;
        }
    }

    /**
     * Incrementa em 1 a velocidade
     * velocidade max: 120
     * (apenas se marcha for diferente de 0)
     */
    public void acelerar() {
        if (this.ligado && this.marcha != 0 && this.velocidade < 120) {
            this.velocidade++;
        }
    }

    /**
     * incrementa em @param step a velocidade do carro
     * velocidade max: 120
     * (apenas se marcha for diferente de 0)
     */
    public void acelerar(Integer step) {
        if (this.ligado && this.marcha != 0 && (this.velocidade + step) <= 120) {
            this.velocidade += step;
        }
    }

    /**
     * Decrementa em 1 a velocidade
     * (apenas valores entre 0 e 120)
     */
    public void frear() {
        if (this.ligado && this.velocidade > 0) {
            this.velocidade--;
        }
    }
    public void frear(Integer step) {
        if (this.ligado && (this.velocidade - step) > 0) {
            this.velocidade -= step;
        }
    }

    /**
     * atribui @param mod como modelo do carro
     */
    private void setModelo(String mod) {
        this.modelo = mod;
    }
    
    @Override 
    public String toString() {
        String str = "-".repeat(30) +
        "\nModelo: %s" + 
        "\nLigado: %b" +
        "\nMarcha: %d" +
        "\nVelocidade: %d km/h\n";
        return String.format(
            str,
            this.getModelo(),
            this.getLigado(),
            this.getMarcha(),
            this.getVelocidade() 
        );
    }

}
