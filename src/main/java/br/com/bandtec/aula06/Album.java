package br.com.bandtec.aula06;

import java.util.ArrayList;

// import br.com.bandtec.aula06.Musica;
import java.util.List;

public class Album {
    
    private List<Musica> musicas = new ArrayList<>();

    public Album() {

    }

    public void addMusica(Musica m) {
        musicas.add(m);
    }

    @Override
    public String toString() {
        String str = "\nMusicas\n------------------\n";
        for (int i = 0; i < this.musicas.size(); i++) {
            str += String.format("%d. %-15s %s\n", i + 1, musicas.get(i).getNome(), musicas.get(i).getDuracao());
        }
        return str;
    }
}
