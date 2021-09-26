package br.com.bandtec.alura.m01oo.excecoes.pessoa;

public class App {

    public static void main(String[] args) {

        try {
            Person p1 = new Person("Rick", -3);   
            System.out.println(p1);
        } catch(NegativeAgeException e) {
            System.out.println(e.getMessage() + " Age: " + e.getAge());
        }   
    }
}
