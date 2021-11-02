package br.com.bandtec.exercicios.ex02;

import java.util.Scanner;

public class VotacaoPizza {
    
    public static void main(String[] args) {

        // Acumuladores dos votos
        Integer votosMussarela = 0;
        Integer votosCalabresa = 0;
        Integer votosQuatroQueijo = 0;

        // Scanner
        Scanner sc = new Scanner(System.in);

        for(Integer i = 0; i < 10; i++) {
            // menu de votação
            System.out.println("\t" + (i + 1) +"º votação:\n");
            System.out.println("[5 ] Mussarela");
            System.out.println("[25] Calabresa");
            System.out.println("[50] Quatro Queijos\n");
            Integer inputVoto = sc.nextInt();

            // verificando se o usuário inseriu um dado correto

            if (inputVoto != 5 && inputVoto != 25 && inputVoto != 50) {
                System.out.println("=".repeat(30) + "\nValor inválido,  tente novamente!");
                i--;
            } else {
                // verificando o voto
                if (inputVoto == 5) {
                    votosMussarela++;
                } else if (inputVoto == 25) {
                    votosCalabresa++;
                } else {
                    votosQuatroQueijo++;
                }

                System.out.println("=".repeat(30) + "\nVoto registrado!");
            }
            System.out.println("=".repeat(30));
        }

        // Exibindo tabela de votações
        System.out.println("\nMussarela: " + votosMussarela);
        System.out.println("\nCalabresa: " + votosCalabresa);
        System.out.println("\nQuatro Queijos: " + votosQuatroQueijo + "\n");

        // Favorito
        if (votosCalabresa > votosMussarela && votosCalabresa >  votosQuatroQueijo) {
            System.out.println("Vencedor: Calabresa");
        } else if ( votosMussarela > votosCalabresa && votosMussarela > votosQuatroQueijo) {
            System.out.println("Vencedor: Mussarela");
        } else {
            System.out.println("Vencedor: Quatro Queijos");
        }

        sc.close();
    }
}
