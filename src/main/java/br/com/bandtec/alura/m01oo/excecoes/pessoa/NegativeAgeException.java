package br.com.bandtec.alura.m01oo.excecoes.pessoa;

public class NegativeAgeException extends RuntimeException {
    
    public NegativeAgeException(Integer age) {
        super("The age should be a positive value.");
        this.age = age;
    }

    private Integer age;

    public Integer getAge() {
        return this.age;
    }
}
