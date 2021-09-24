package br.com.bandtec.aula05encapsulamento.ex02;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner scstr = new Scanner(System.in);
        Scanner scdou = new Scanner(System.in);

        // nova conta

        // titular
        System.out.println("Nome do titular: ");
        String titular = scstr.nextLine();

        Conta c = new Conta(titular);

        // menu
        String answer;

        String menu = "-".repeat(10) + 
        "MENU" + "-".repeat(10) +
        "\n[1] depositar" +
        "\n[2] sacar" +
        "\n[3] informações da conta" +
        "\n[4] sair";

        
        do {
            System.out.println(menu);
            answer = scstr.nextLine();

            switch (answer) {
                case "1":
                    System.out.println("Valor à depositar:");
                    Double valorDeposito = scdou.nextDouble();
                    c.depositar(valorDeposito);
                    break;
                case "2":
                    System.out.println("Valor à sacar:");
                    Double valorSaque = scdou.nextDouble();
                    c.sacar(valorSaque);;
                    break;
                case "3":
                    System.out.println(c);
                    break;
                case "4":
                    System.out.println("Bye!");
                    break;
            }
        } while (!answer.equals("4"));

        // fechando scanners
        scdou.close();
        scstr.close();
    }
    
}

class Conta {

    // construtor
    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0d;
    }

    public Conta(String titular, Double saldo) {
        this.titular = titular;
        this.depositar(saldo);
    }

    // atributos
    private String titular;
    private Double saldo = 0d;
    private Double limite = 200d;

    // titular
    public void settitular(String titular) {
        this.titular = titular;
    }
    public String gettitular() {
        return this.titular;
    }

    // saldo
    public Double getSaldo() {
        return this.saldo;
    }

    // comportamentos

    // depositar
    public void depositar(Double valor) {
        if ((this.saldo + valor) <= this.limite) {
            // depositando valor
            this.saldo += valor;

            // exibindo msg de sucesso
            String str = "\nDepósito realizado!\nValor depositado: R$ %.2f\nSaldo atual: R$ %.2f";
            str = String.format(str, valor, this.saldo);
            System.out.println(str);
        } else { 
            // exibindo msg de erro de depósito
            String str = "\nDepósito inválido.\nO limite de saldo é de: R$ %.2f.\nSaldo atual: R$ %.2f";
            str = String.format(str, this.limite, this.saldo);
            System.out.println(str);
        }
    }
    public void depositar(Integer valor) {
        this.depositar(Double.valueOf(valor));
    }

    // sacar
    public void sacar(Double value) {
        if (value <= this.saldo) {
            // sacando valor informado
            this.saldo -= value;

            // exibindo msg de saque realizado
            String str = "\nSaque realizado!\nValor sacado: R$ %.2f";
            str = String.format(str, value);
            System.out.println(str);
        } else {
            // exibindo msg de erro de saque
            String str = "\nSaque inválido!\nO valor de saque deve ser menor ou igual ao saldo.\nSaldo atual: R$ %.2f";
            str = String.format(str, this.limite, this.saldo);
            System.out.println(str);
        }
    }
    public void sacar(Integer value) {
        this.sacar(Double.valueOf(value));
    }

    // situacao
    public String situacao() {
        if (this.saldo < 50) {
            return "ruim";
        } else if (50 <= this.saldo && this.saldo <= 100) {
            return "regular";
        } else {
            return "bom";
        }
    }

    // to string override
    @Override
    public String toString() {
        String str = "-".repeat(30) + 
        "\ntitular: %s\nSaldo: R$ %.2f\nsituação: %s\n" + 
        "-".repeat(30);
        return String.format(str, this.titular, this.saldo, this.situacao());
    }
}