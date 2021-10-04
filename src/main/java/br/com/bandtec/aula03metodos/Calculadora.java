package br.com.bandtec.aula03metodos;

public class Calculadora {
    void somar(Integer primeiroNumero, Integer segundoNumero) {
        String txt = "%d + %d = %d";
        txt = String.format(
            txt,
            primeiroNumero,
            segundoNumero, 
            primeiroNumero + segundoNumero
        );
        System.out.println(txt);
    }

    // sobrecarga de método com mudança do tipo dos parametros
    void somar(Double primeiroNumero, Double segundoNumero) {
        String txt = "%.1f + %.1f = %.1f";
        txt = String.format(
            txt,
            primeiroNumero,
            segundoNumero, 
            primeiroNumero + segundoNumero
        );
        System.out.println(txt);
    }

    // sobrecarga de métodos com 3 parametros
    void somar(Integer primeiroNumero, Integer segundoNumero, Integer terceiroNumero) {
        String txt = "%d + %d + %d = %d";
        txt = String.format(
            txt,
            primeiroNumero,
            segundoNumero, 
            terceiroNumero,
            primeiroNumero + segundoNumero + terceiroNumero
        );
        System.out.println(txt);
    }

    Integer subtrair(Integer primeiroNumero, Integer segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    void multiplicar(Integer primeiroNumero, Integer segundoNumero) {
        String txt = "%d * %d = %d";
        txt = String.format(
            txt,
            primeiroNumero,
            segundoNumero, 
            primeiroNumero * segundoNumero
        );
        System.out.println(txt);
    }

    void dividir(Integer primeiroNumero, Integer segundoNumero) {
        String txt = "%d / %d = %d";
        txt = String.format(
            txt,
            primeiroNumero,
            segundoNumero, 
            primeiroNumero / segundoNumero
        );
        System.out.println(txt);
    }

    // um método estático pode ser chamado sem instanciar um objeto
    static void estatico() {
        System.out.println("Método estático");
    }
}
