package br.com.bandtec;

import org.junit.Assert;
import org.junit.Test;

public class MyClass {

    private Integer value;

    public MyClass(Integer value) {
        this.value = value;
    }
    
    public Integer getValue() {
        return this.value;
    }

    public static Integer nextInt(Integer value) {
        return ++value;
    }

    @Test
    public static Boolean funfa() {
        Assert.assertEquals(Integer.valueOf(2), nextInt(1));
        return true;
    }

}
