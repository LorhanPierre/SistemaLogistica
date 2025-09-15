package org.sistemalogistica.utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.sistemalogistica.view.Messages;

public class Utils {

    static Messages messages = new Messages();
    static Scanner input = new Scanner(System.in);

    public static int inputNumber(){
        boolean error = true;
        int number = 0;
        do{
            try{
                number = input.nextInt();
                error = false;
            }catch(InputMismatchException e){
                messages.numberError();
                input.nextLine();
            }
        }while(error);
        return number;
    }
}
