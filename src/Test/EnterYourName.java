package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterYourName {

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


       while (true) {
           System.out.println("QUAL O SEU NOME?");
           String yourName = sc.nextLine().trim(); // Trim para limpar espaços

           // 1. Verifica se está vazio
           if (yourName.isEmpty()) {
               System.out.println("ERROR: O NOME NÃO PODE ESTAR VAZIO.");
           }
           // 2. Verifica se contém APENAS letras e espaços
           else if (!yourName.matches("[a-zA-ZÀ-ÿ ]+")) {
               System.out.println("ERROR: DIGITE APENAS LETRAS (EX: JOÃO, MARIA).");
           }
           // 3. Se passou em tudo, executa e encerra
           else {
               System.out.println("HELLO, " + yourName.toUpperCase() + "!");
               break; // Única saída do loop
           }
       }


}




    }


