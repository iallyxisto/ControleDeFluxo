package CriandoExcecoes;

public class Finally {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println("Numero na posição: " + myNumbers[1]);
        } catch (Exception e) {
            System.out.println("Posição inexistente");
//        } finally {
//            System.out.println("fim.");
//        }
        }

    }
}
