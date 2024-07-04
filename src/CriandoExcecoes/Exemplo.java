package CriandoExcecoes;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sexo;
        try {
            // ValidaNome nome = new ValidaNome("Zé");
            new ValidaNome("Maria");
            new ValidaIdade(19);
            System.out.println("Qual seu Sexo? ");
            sexo = sc.nextLine();
            new ValidaSexo(sexo);
            /*
            Como nesses casos(métodos) eu estou usando minha classe de excecao especifica
            eu crio um catch
             */

        } catch (CriandoExcecao e) {
            System.out.println("Erro: " + e.getMessage());
            /*
            Já no caso da idade, eu usei uma outra exececao, então é necessario
            um novo lançamento de acordo com a minha classe de exceção utilizada.
             */

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }
    }
}
