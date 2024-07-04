package br.com.EstruturaCondicional;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;

        System.out.println("informe letra 'A' ");
        letra = sc.nextLine();
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("A letra está correta");
        }
        else {
            System.out.println("Você digitou a letra errada");
        }

    }
}
