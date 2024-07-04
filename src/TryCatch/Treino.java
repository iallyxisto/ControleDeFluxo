package TryCatch;

public class Treino {
    public static void main(String[] args) {
//        int [] numeros = {1,2,3,4};
//        System.out.println(numeros[7]);
//
        /*
        Tente fazer isso
         */
        try {
            int[] numeros = {1, 2, 3, 4, 5};
            System.out.println(numeros[7]);
        }
        /*
        Se não existir, me traga esse resultado.
         */
        catch(Exception e ){
            System.out.println("Número não existe");
        }

    }
}
