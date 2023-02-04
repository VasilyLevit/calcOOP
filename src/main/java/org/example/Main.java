package org.example;

public class Main {
    public static void main(String[] args) {
        GetInt a = new GetInt();
        GetOperation op = new GetOperation();
        Calc c = new Calc();

        int num1 = a.getInt();
        int num2 = a.getInt();
        char operation = op.getOperation();
        int result = c.calc(num1,num2,operation);

        System.out.println("Result: " + result);
    }
}