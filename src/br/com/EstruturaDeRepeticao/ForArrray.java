package br.com.EstruturaDeRepeticao;

public class ForArrray {
    public static void main(String[] args) {
        //guardou felipe =0, jonas = 1;.....
                String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
                //pare quando o x for do  tamanho do Array alunos[0,1,2,3], ou seja: quando contar até 3
                for (int x=0; x<alunos.length; x++) {
                    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
                    /*
                    [0]= felipe
                    [1]=jonas
                    [2]=julia
                    [3]=marcos
                     */
                }
    }
}
