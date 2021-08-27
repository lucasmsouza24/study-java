package br.com.bandtec.aula03metodos;

public class TesteCalculadora {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();

        // sobrecarga de metodo
        calc.somar(2, 10);
        calc.somar(2, 10, 20);
        calc.somar(2.1, 10.0);

        String txt = "%d - %d = %d";
        txt = String.format(txt, 2, 10, calc.subtrair(2, 10));
        System.out.println(txt);

        calc.multiplicar(2, 10);
        calc.dividir(2, 10);

        // um método estático pode ser chamado sem instanciar um objeto
        Calculadora.estatico();
    }

    // métodos estáticos só interagem entre outros métodos estáticos
    static void exibeSoma() {
        System.out.println("Resultado: " + (2 + 2));
    }
}
