package org.example;

import java.util.Scanner;

public class bucle4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number=0;
        int num0 =0;
        int num1 =1;
        number=input.nextInt();
        for (int i=0; i<number; i++) {
            if (i == 0) {
                System.out.println(num0);
            }else if (i == 1) {
                System.out.println(", " + num1);
            }       else {
                int num3 = num0 + num1;
                System.out.println(", " + num3);
                num0 = num1;
                num1 = num3;
            }
                }
            }
        }