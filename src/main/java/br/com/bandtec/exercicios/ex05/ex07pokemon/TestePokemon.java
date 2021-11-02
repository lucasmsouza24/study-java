package br.com.bandtec.exercicios.ex05.ex07pokemon;

public class TestePokemon {
    
    public static void main(String[] args) {

        TreinadorPokemon tp = new TreinadorPokemon("Ash");

        Pokemon p1 = new Pokemon("Pikachu", "raio", 500);
        Pokemon p2 = new Pokemon("Squirtle", "agua", 101);

        // treino
        tp.treinarPokemon(p2);
        tp.treinarPokemon(p2);
        tp.treinarPokemon(p2);
        tp.treinarPokemon(p2);
        tp.treinarPokemon(p2);

        System.out.println(p2);

        tp.evoluirPokemon(p2, "Wartortle");

        System.out.println(p2);

        tp.treinarPokemon(p1);
        tp.treinarPokemon(p1);

        System.out.println(p1);

        tp.evoluirPokemon(p1, "Raichu");
        
        System.out.println(tp);
    }

}
