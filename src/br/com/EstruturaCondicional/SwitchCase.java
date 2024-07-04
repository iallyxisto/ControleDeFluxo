package br.com.EstruturaCondicional;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String letra;

        System.out.println("informe letra 'A' ");
        letra = sc.nextLine();

        switch (letra){
            case "a" :
                System.out.println("Letra A");
                break;
            case "e":
                System.out.println("Letra E");
                break;
            case "i":
                System.out.println("Letra I");
                break;
            default:
                System.out.println("Letra não existente");


        }


    }
}
