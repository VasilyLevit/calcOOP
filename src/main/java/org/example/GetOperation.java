package org.example;

import java.util.Scanner;

public class GetOperation {
    public static char getOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input operation:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();  //рекурсия
            operation = getOperation();
        }
        return operation;
    }
}
