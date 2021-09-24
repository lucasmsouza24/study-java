package br.com.bandtec.ex05.ex01clube;

import java.util.Scanner;

public class ProgramaCampeonato {
    
    // construtor
    public ProgramaCampeonato(Clube c1, Clube c2, Integer rodadas) {
        this.rodadas = rodadas;
        this.rodadaAtual = 1;
        this.c1 = c1;
        this.c2 = c2;
    }

    // atributos
    private Integer rodadas;
    private Integer rodadaAtual;
    private Clube c1;
    private Clube c2;

    // comportamentos
    public void jogarRodada() {
        rodadaClube(c1);
        rodadaClube(c2);
    }

    private void rodadaClube(Clube c) {
        // scanner
        Scanner sc = new Scanner(System.in);
        String resp;

        // menu string
        String str = "Time: %s\n\n[1] ganhou\n[2] perdeu\n[3] empatou";

        // time 1
        System.out.println(String.format(str, c.getNome()));
                
        // input resp

        do {
            System.out.println(str);
            resp = sc.nextLine();
            
            switch (resp) {
                case "1":
                    c.registrarVitoria();
                    break;
                case "2":
                    c.registrarDerrota();
                    break;
                case "3":
                    c.registrarEmpate();
                    break;
                default:
                    System.out.println("Valor inválido");
            }
        } while (!(resp.equals("1") || resp.equals("2") || resp.equals("3")));

        sc.close();
    }

}
