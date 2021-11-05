package br.com.bandtec.aula08.deprecated;

public class Pessoa {
    Integer idade;

    public Pessoa(Integer i) {
        this.idade = i;
    }

    public Integer getIdade() {
        return this.idade;
    }

    /**
     * @deprecated 
     * Este método é antigo
     * utilize {@link Pessoa#getIdade()}
     * @return
     * Idade (Integer) da instância
     */
    @Deprecated
    public Integer pegarIdade() {
        return this.idade;
    }
}
