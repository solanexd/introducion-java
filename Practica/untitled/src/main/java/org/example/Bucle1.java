package org.example;

import java.util.Scanner;

public class Bucle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=0;
        System.out.println("Ingrese un numero");
        number=input.nextInt();

        for (int i=0; i<=number; i+=2){
            System.out.println("FOR: " +i);
        }
    }
}
