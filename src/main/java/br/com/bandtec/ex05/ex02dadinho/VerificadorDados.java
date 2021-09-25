package br.com.bandtec.ex05.ex02dadinho;

public class VerificadorDados {
    
    public VerificadorDados(Dadinho d1, Dadinho d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    // atributos
    private Dadinho d1;
    private Dadinho d2;
    private String strVencedor = "%s venceu.";
    private String strEmpate = "Empate";
    
    /**
     * Verifica qual dos dois dados é o vencedor
     * @return String do dado vencedor
     */
    public String verificarVencedor() {
        if (d1.getValor() == d2.getValor()) {
            return strEmpate; 
        } else {
            if (d1.getValor() > d2.getValor()) {
                d1.vencer();
                return String.format(strVencedor, "Dado 1");
            } else {
                d2.vencer();
                return String.format(strVencedor, "Dado 2");
            }
        }
    }
}
