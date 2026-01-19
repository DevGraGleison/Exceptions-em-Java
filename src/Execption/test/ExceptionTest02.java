package Execption.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {



    public static void main(String[] args)  throws IOException{
        criarNovoArquivo();
    }

    private static void criarNovoArquivo()throws IOException{

        File file = new File("arquivo\\teste1.txt");
        try{

            boolean isCreated = file.createNewFile();
            System.out.println("ARQUIVO CRIADO " +  isCreated) ;

        }catch (IOException e){
            e.printStackTrace();

            throw e;
        }


    }

    //EXECÇÕES DO TIPO CHECKED




}
