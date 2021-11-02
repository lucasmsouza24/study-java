package br.com.bandtec.exercicios.ex03;

public class ClassesSociaisClass {

    public static Double minSalarys(Double salary) {
        return salary / 1100;
    }

    String socialClass(Double minSalarys) {
        if (minSalarys <= 2) {
            return "E";
        } else if (minSalarys > 2 && minSalarys <= 4) {
            return "D";
        } else if (minSalarys > 4 && minSalarys <= 10) {
            return "C";
        } else if (minSalarys > 10 && minSalarys <= 20) {
            return "B";
        } else {
            return "A";
        }
    }

}
