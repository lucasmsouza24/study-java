package br.com.bandtec.aula08.matrix;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
    
    public static void main(String[] args) {

        // NÃO FAÇAM ISSO EM CASA!

        List<List> list = new ArrayList<>();

        for(int line = 1; line <= 3; line++) {
            // creating row
            List<Integer> row = new ArrayList<>();

            // adding values to row
            for(int column = 1; column <= 3; column++) {
                row.add(Integer.valueOf(line + "" + column));
            }

            // adding row to list
            list.add(row);
        }

        // print
        System.out.println(list + "\n");

        for (List row : list) {
            System.out.println(row);
        }
    }
}
