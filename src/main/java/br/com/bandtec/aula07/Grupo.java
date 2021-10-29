package br.com.bandtec.aula07;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    
    private List<Contato> grupo;

    public Grupo() {
        this.grupo = new ArrayList<>();
    }

    public Grupo(Contato c) {
        this.grupo = new ArrayList<>();
        this.grupo.add(c);
    }

    public Grupo(List<Contato> contatos) {
        this.grupo = new ArrayList<>();
        for (Contato c : contatos) {
            this.grupo.add(c);
        }
    }

    public List<Contato> getContatos() {
        return this.grupo;
    }

}
