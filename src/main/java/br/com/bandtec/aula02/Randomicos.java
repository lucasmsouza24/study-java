package br.com.bandtec.aula02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args) {
        
//        Valor randomico entre 0 e 1
        System.out.println(Math.random());
        
//        classe random
        Random rand = new Random();
        
        Integer num = rand.nextInt(3);
        Integer num2 = ThreadLocalRandom.current().nextInt(0, 10);
        Boolean bool = rand.nextBoolean();
        
        ThreadLocalRandom.current().nextInt(0, 10);
        
        System.out.println("num: " + num);
        System.out.println("num 0, 10: "+  num2);
        System.out.println("bool: " + bool);
    }
}
