package br.com.bandtec.alura.m01oo.excecoes.pessoa;

public class Person {

    public Person(String name, Integer age) {
        this.name = name;
        setAge(age);
    }

    private String name;
    private Integer age;

    // name
    public void setName(String name) {
        this.name = name;
    } 

    public String getName() {
        return this.name;
    }

    // age
    public void setAge(Integer age) throws NegativeAgeException {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new NegativeAgeException(age);
        }
    }
    
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Pessoa [age=" + age + ", name=" + name + "]";
    }
}
