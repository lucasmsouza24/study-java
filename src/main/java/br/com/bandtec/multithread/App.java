package br.com.bandtec.multithread;

import java.util.concurrent.TimeUnit;

// testing multithread program
public class App {
    
    public static void main(String[] args) throws InterruptedException {

        // thread 1
        for(int i = 5; i >= 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }

        // thread 2
        for(int i = 0; i >= -5; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }

}
