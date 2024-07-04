package CriandoExcecoes;

public class ValidaSexo {
    String sexo;
    /*
    Vou receber do teclado o sexo.
    Construtor para receber obrigatoriamente um sexo
     */


    public ValidaSexo(String sexo) throws CriandoExcecao {
        /*
        eu idico que esse metodo pode lançar essa excecao pois só sera permitido a entrada de
        homens.
         */
        this.sexo = sexo;
        if (sexo.equalsIgnoreCase("F")) {
            /*
            Essa será a mensagem que deve aparecer ao ser sexo feminino
             */
            throw new CriandoExcecao("Só é permitido entrada de homem");
        } else {
            System.out.println("Parabéns, você foi selecionado");
        }

    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
