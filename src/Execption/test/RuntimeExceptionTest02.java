package Execption.test;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {

        //   divisao(1,0);

        try {
            System.out.println(divisao1(1,0));

        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    //private static int divisao(int a , int b){

    // return a/b;
//}
    // O Codigo acima resultará em uma ArithmeticException
    // porque nao existe divisão por zero

    private static int divisao1(int a , int b) {
    if (b == 0){

    throw new IllegalArgumentException("ARGUMENTO ILEGAL, NÃO PODE SER ZERO (0) \n" +
            "PORQUE NAO EXISTE DIVISAO POR ZERO");

    }
        return a/b;
    }
// OUTRA FORMA DE TRABALHAR COM EXEÇÕES

    // EXECEÇÕES DO TIPO UNCHECKED
}


