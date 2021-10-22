package br.com.bandtec.aula06;

public class MyClass {

    private Integer value;

    public MyClass(Integer value) {
        this.value = value;
    }
    
    public Integer getValue() {
        return this.value;
    }

    public static Integer nextInt(Integer value) {
        return ++value;
    }
}
