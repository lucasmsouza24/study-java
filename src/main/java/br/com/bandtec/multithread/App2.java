package br.com.bandtec.multithread;

public class App2 {
    
    public static void main(String[] args) {

        Task task = new Task();

        task.start();

        try {
            task.t1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
} 
