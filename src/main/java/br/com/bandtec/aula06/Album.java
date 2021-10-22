package br.com.bandtec.aula06;

import java.util.ArrayList;

import br.com.bandtec.aula06.Musica;
import java.util.List;

public class Album {
    
    private List<Musica> album = new ArrayList<>();

    public Album() {

    }

    

    @Override
    public String toString() {
        return this.album;
    }
}
