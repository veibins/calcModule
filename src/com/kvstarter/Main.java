package com.kvstarter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char operator;
        float num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi divus skaitļus, pēc katra nospiežot Enter: ");
        num1 = input.nextFloat();
        num2 = input.nextFloat();

        System.out.print("Ievadi operatoru (+,-,/,*) un spied Enter: ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("%.1f+%.1f = %.1f", num1, num2, (num1 + num2));
                break;
            case '-':
                System.out.printf("%.1f-%.1f = %.1f", num1, num2, (num1 - num2));
                break;
            case '*':
                System.out.printf("%.1f*%.1f = %.1f", num1, num2, (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.printf("%.1f/%.1f = %.1f", num1, num2, (num1 / num2));
                else
                    System.out.println("Ar nulli nedrīkst dalīt!");
                break;
            default:
                System.out.printf("%c \rERROR 707 - Invalid operator!", operator);
        }
    }
}

//----------------------------- option with just integers and if/else

//            int num1, num2;
//            String operation;
//
//            Scanner input = new Scanner(System.in);
//
//            System.out.println("Ievadi divus veselus skaitlus, pēc katra ievades nospiežot Enter: ");
//            num1 = input.nextInt();
//            num2 = input.nextInt();
//
//            System.out.print("Ievadi vēlamo operāciju(+,-,/,*): ");
//            operation = input.next();
//
//            if (operation.equals("+")) {
//                System.out.println(num1+ "+" +num2+ "=" +(num1+num2));
//            } else if (operation.equals("-")) {
//                System.out.println(num1+ "-" +num2+ "=" +(num1-num2));
//            } else if (operation.equals("/")) {
//                System.out.println(num1+ "/" +num2+ "=" +(num1/num2));
//            } else if (operation.equals("*")) {
//                System.out.println(num1+ "*" +num2+ "=" +(num1*num2));
//            } else {
//                System.out.println("ERROR 404!!! Mēģini vēlreiz!");
//            }
//
//        }}
