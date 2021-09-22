package br.com.bandtec.alura.m01oo.funcionario;

public class App2 {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        Caminhao c2 = new Caminhao();
        
        System.out.println("Carro: " + c1.getDistance(10));
        System.out.println("Caminhão: " + c2.getDistance(10));
    }
}

class Carro {

    // atributos privados não podem ser acessados por classes filhas
    // private Double velocity = 10d;  
    
    // atributos protejidos podem ser acessados apenas pela própria classe 
    // e por classes filhas  
    protected Double velocity = 10d;       

    public Double getDistance(double time) {
        return velocity * time;
    }

}

class Caminhao extends Carro {

    Caminhao() {
        this.velocity = 8d;
    }

}