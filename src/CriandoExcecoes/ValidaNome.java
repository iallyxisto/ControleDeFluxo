package CriandoExcecoes;

public class ValidaNome {
    public ValidaNome(String nome ) throws CriandoExcecao {
        /*
        Eu uso o throws para indicar que vou tratar uma possivel excecao, e ele
        tem que ser chamado na assinatura do metodo.
         */

        if (nome.length() <3){
            /*
            aqui eu Lanço a excecao Throw e resolvo ela.
             */
            throw  new CriandoExcecao("O nome dever ter pelo menos 3 letras");
        }
        else {
            System.out.println("Nome válido:  "+ nome);
        }

    }
}
