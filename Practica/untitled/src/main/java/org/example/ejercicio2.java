package org.example;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0, num2=0;
        System.out.println("Ingrese primer numero entero");
        num1 = input.nextInt();
        System.out.println("Ingrese segundo numero entero");
        num2 = input.nextInt();
        if (num1 > num2)
                {
            System.out.println("El numero  mayor es " + num1);}
        else {
                System.out.println("El numero mayor es " + num2);}

        }

    }

