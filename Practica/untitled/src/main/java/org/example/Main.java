package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0, resultado=0;
        System.out.println("Ingresa un numero entero");
        num1 = input.nextInt();
        if (num1%2 == 0 ) {
            System.out.println("El numero es par"); }
            else {
                System.out.println("El numero es impar");
        }
    }
}