package br.com.bandtec.exercicios.ex07.figura;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    // atributos
    private List<Figura> figuras;

    // construtor
    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    // métodos
    public void adicionaFigura(Figura f) {
        this.figuras.add(f);
    }

    public void exibeFiguras() {
        for (Figura f : this.figuras) {
            System.out.println(f);
        }
    }

    public void exibeSomaArea() {
        Double somaArea = 0d;

        for (Figura f : this.figuras) {
            somaArea += f.calculaArea();
        }

        System.out.println("Soma da area: " + somaArea);
    }

    public void exibeFiguraAreaMaior20() {

        for(Figura f : this.figuras) {
            if (f.calculaArea() > 20) {
                System.out.println(f);
            }
        }
    }

    public void exibeQuadrados() {

        for (Figura f : this.figuras) {
            if (f instanceof Quadrado) {
                System.out.println(f);
            }
        }
        
    }
}
