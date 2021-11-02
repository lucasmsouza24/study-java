package br.com.bandtec.exercicios.ex05.ex01clube;

import java.util.Scanner;

class ProgramaCampeonato {

    public static void main(String[] args) {

        // atributos
        Scanner sc = new Scanner(System.in);
        Integer rodadas = 2;

        // menu string
        String str = "-".repeat(30) +
        "\n%s - Rodada %d" +
        "\n\t[1] Vitória" +
        "\n\t[2] Derrota" +
        "\n\t[3] Empate";

        // clubes
        Clube c1 = new Clube("Ponte Preta");
        Clube c2 = new Clube("Atlético Mineiro");
        Clube[] clubes = {c1, c2};

        // rodadas gerais
        for (Integer rodada = 0; rodada < rodadas; rodada++) {
            // rodadas de cada clube
            for (Clube c : clubes) {
                // menu input
                String resp;
                do {
                    System.out.println(String.format(str, c.getNome(), rodada + 1));
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
                            System.out.println("Valor inválido!");
                            break;
                    }
                } while (!(resp.equals("1") || resp.equals("2") || resp.equals("3"))); 
            }

            // Exibindo resultado do último jogo de cada clube
            for (Clube c : clubes) {
                System.out.println(c.getUltimoJogo());
            }
            System.out.println("");

            // exibindo pontos de cada clube (ao final de rodada)
            for (Clube c : clubes) {
                String str3 = "%s pontos: %d";
                str3 = String.format(str3, c.getNome(), c.getPontos());
                System.out.println(str3);
            }
        }

        // Exibindo vitórias, empates, derrotas e pontuação de cada clube
        System.out.println("-".repeat(30) + "\nFinal de temporada");
        for (Clube c : clubes) {
            String str4 = "\n%s: %d vitórias, %d empates, %d derrotas\nTotal de pontos: %d";
            System.out.println(String.format(
                str4, 
                c.getNome(), 
                c.getVitorias(), 
                c.getEmpates(), 
                c.getDerrotas(),
                c.getPontos()
                )
            );
        }

        // closing scanner
        sc.close();
    }

}
