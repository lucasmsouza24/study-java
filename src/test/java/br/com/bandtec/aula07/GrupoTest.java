package br.com.bandtec.aula07;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GrupoTest {
    @Test
    public void testGetContatos() {
        Grupo g = new Grupo(new Contato("diego", "1192222-2222"));
        g.getContatos().add(new Contato("marise", "1193333-3333"));
        assertEquals(2, g.getContatos().size());
    }

    @Test 
    public void testListConstructor() {
        Contato c1 = new Contato("Nome 1", "tel 1");
        Contato c2 = new Contato("Nome 2", "tel 2");
        Contato c3 = new Contato("Nome 3", "tel 3");
        List<Contato> contatos = new ArrayList<>();
        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);
        Grupo g = new Grupo(contatos);

        assertEquals(3, g.getContatos().size());
    }
}
