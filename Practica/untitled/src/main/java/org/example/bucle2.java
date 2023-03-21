package org.example;

import java.util.Scanner;

public class bucle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=0;
        System.out.println("Ingrese un numero");
        number=input.nextInt();
        int resultado=1;
        for (int i=1; i<=number; i++) {
            resultado *=i;
            }
        System.out.println("el factorial de " +number + " es " + resultado );
    }
}
