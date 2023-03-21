package org.example;

import java.util.Scanner;

public class ejercicio4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0, num2=0, resultado=0;
        System.out.println("Ingrese un numero entero");
        num1 = input.nextInt();
        System.out.println("Ingrese otro numero entero");
        num2 = input.nextInt();
        int suma = num1 + num2;

        if (suma > 100)
        {
            System.out.println("LA SUMA ES MAYOR A 100");
        } else if (suma < 100)
        {
            System.out.println("LA SUMA ES MENOR A 100");
        }
        else {
            System.out.println("LA SUMA ES IGUAL A 100");
        }

    }
}
