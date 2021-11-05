package br.com.bandtec.aula08.heranca02;

public class App {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("Rua 1", 100_000d);
        Imovel imovel2 = new ImovelUsado("Rua 2", 100_000d);
        Imovel imovel3 = new ImovelNovo("Rua 3", 100_000d);

        System.out.println(imovel1);
        System.out.println(imovel2);
        System.out.println(imovel3);
    }
}
