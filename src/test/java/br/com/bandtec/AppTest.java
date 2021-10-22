package br.com.bandtec;

import org.junit.Assert;
import org.junit.Test;

import br.com.bandtec.aula06.MyClass;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true );
    }

    @Test
    public void nextWorks() {
        for (int i = 0; i <= 100; i++) {
            Assert.assertEquals(Integer.valueOf(i), MyClass.nextInt(i - 1));
        }
    }
}
