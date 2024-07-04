package br.com.EstruturaDeRepeticao;

public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            // quando numero chegar em 3, pare a contagem sem incluir ele;

            System.out.println(" Break: "+numero+"\n");

        }
        //////////////////////////////

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;

            System.out.println("Continue"+numero);

        }

    }
}
