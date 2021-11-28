package br.com.bandtec.exercicios.ex07.figura;

public class App {
    public static void main(String[] args) {
        Retangulo f1 = new Retangulo("branco", 2, 3d, 2d);
        Quadrado f2 = new Quadrado("preto", 3, 2d);
        Quadrado f5 = new Quadrado("preto", 3, 3d);
        Triangulo f3 = new Triangulo("preto", 3, 2d, 3d);
        Circulo f4 = new Circulo("preto", 3, 1d);

        Imagem im = new Imagem();

        im.adicionaFigura(f1);
        im.adicionaFigura(f2);
        im.adicionaFigura(f3);
        im.adicionaFigura(f4);
        im.adicionaFigura(f5);

        im.exibeFiguras();

        im.exibeFiguraAreaMaior20();

        im.exibeSomaArea();

        im.exibeQuadrados();
    }
}