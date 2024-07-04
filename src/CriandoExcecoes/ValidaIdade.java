package CriandoExcecoes;

public class ValidaIdade {
    public ValidaIdade(int idade) {
        if (idade < 18) {
            /*
            Nesse caso a excecao que ira aparecer ao indicar uma idade menor que 18 seria
            IllegalArgumentException... O tratamento especifico pra ela já existe, então é só
            eu usar o proprio recurso java.
             */
            throw new IllegalArgumentException("Menor de idade não é autorizado");
        } else {
            System.out.println("Você é maior de idade");
        }
    }
}
