package br.com.bandtec.multithread;

import java.util.concurrent.TimeUnit;

public class Task extends Thread {
    
    public void run() {
        super.run();

        try {
            for(int i = 0; i >= -5; i--) {
                System.out.println(i);
                TimeUnit.SECONDS.sleep(1);
            };
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void t1() throws InterruptedException {
        for(int i = 5; i >= 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
