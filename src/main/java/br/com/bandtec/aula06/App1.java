package br.com.bandtec.aula06;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        // nums.add("opa"); erro
        // nums.add(3.1);   erro
        nums.add(0, 2);
        nums.add(0, 1);
        // Integer i = 3;
        // nums.remove(i);
        System.out.println(nums);

        // for
        for(int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // enhanced
        for (int el : nums) {
            System.out.println(el);
        }

        // foreach
        nums.forEach(i -> {
            System.out.println(i);
        });

        // stream foreach
        nums.stream().forEach(System.out::println);
    }
}
