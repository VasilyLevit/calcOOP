package org.example;

import java.util.Scanner;

public class GetInt {
    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();  //рекурсия
            num = getInt();
        }
        return num;
    }
}
