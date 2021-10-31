package br.com.bandtec.aula07;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.get(2)); // 30

        list.remove(1);                     // remove item de index 1 (20)
        list.remove(Integer.valueOf(30));   // remove item de valor 30

        System.out.println(list.contains(10));
        System.out.println(list.contains(15));

        System.out.println(list);           // [10, 40]
    }
}
