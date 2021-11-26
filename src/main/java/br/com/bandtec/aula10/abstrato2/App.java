package br.com.bandtec.aula10.abstrato2;

public class App {
    
    public static void main(String[] args) {

        Funcionario f1 = new Vendedor("198.367.133-9", "Josimar", 10d, 10d);
        Funcionario f2 = new Vendedor("298.367.133-9", "Roberto", 10d, 10d);
        Funcionario f3 = new Vendedor("398.367.133-9", "Jose", 10d, 10d);
        Funcionario f4 = new Horista("498.367.133-9", "Pedro", 10, 10d);
        Funcionario f5 = new Horista("598.367.133-9", "Lucas", 10, 10d);
        Funcionario f6 = new Horista("698.367.133-9", "Felipe", 10, 10d);

        Empresa empresa = new Empresa();

        empresa.adicionaFunc(f1);
        empresa.adicionaFunc(f2);
        empresa.adicionaFunc(f3);
        empresa.adicionaFunc(f4);
        empresa.adicionaFunc(f5);
        empresa.adicionaFunc(f6);

        empresa.exibeTodos();        
        
    }
}
