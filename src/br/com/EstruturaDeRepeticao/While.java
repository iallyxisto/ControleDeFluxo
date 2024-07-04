package br.com.EstruturaDeRepeticao;

public class While {
    public static void main(String[] args) {
        /*
        Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar
         todo o seu dinheiro, logo, enquanto o valor dos doces não igualar a R$
          50,00 ele foi adicionando itens no carrinho.
         */

        double mesada = 50;
        double contagem =0;

        while(contagem < mesada){
            contagem++;
            System.out.println("contando de um em um " +contagem);
        }
        System.out.println("você atingiu o valor de 50R$");
    }
}
