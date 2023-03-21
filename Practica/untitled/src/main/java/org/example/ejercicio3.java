package org.example;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0;
        System.out.println("Ingrese primer numero entero");
        num1 = input.nextInt();

        if (num1 <=1){
            System.out.println(num1 + " NO es un numero primo" );
        } else if (num1 == 2) {
            System.out.println(num1 + " SI es un numero primo");
        } else if (num1 % 2 == 0) {
            System.out.println(num1 + " NO es un numero primo");
        }

        }
    }
