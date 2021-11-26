package br.com.bandtec.aula10.enums;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(LocalizacaoEnum.CENTRO);
        System.out.println(LocalizacaoEnum.NORTE);
        System.out.println(Arrays.toString(LocalizacaoEnum.values()));

        for (LocalizacaoEnum local : LocalizacaoEnum.values()) {
            System.out.println("[" + local.getCod() + "] " + local);
        }
    }
}
