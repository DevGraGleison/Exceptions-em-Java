package Execption.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){

        File file = new File("arquivo\\teste1.txt");
        try{

           boolean isCreated = file.createNewFile();
           System.out.println("Arquivo Criado  " +  isCreated) ;

        }catch (IOException e){
            e.printStackTrace();

        }


    }




}
