package org.example;


public class Metodos {

    public static void main(String[] args) {
        int resultado = mayorDeTres(5, 50, 10);
        //System.out.println(resultado);
        //imprimirTablaMultiplicar(5);
        //imprimirPatronEstrellas(4);
        imprimirPrimo(17);
    }

    public static int mayorDeTres(int num1, int num2, int num3) {
        int mayor;
        if (num1 > num2) {
            if (num1 >= num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 >= num3) {
                return num2;

            } else {
                return num3;
            }
        }
    }

    public static void imprimirTablaMultiplicar(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " es igual a " + (num * i));
        }
    }

    public static void imprimirPatronEstrellas(int num) {
        int numeroestrellas = 1;
        for (int i = 0; i < num; i++) {
            String estrellas = ("");
            for (int j = 0; j < numeroestrellas; j++) {

                estrellas = estrellas + "*";
            }
            System.out.println(estrellas);
            numeroestrellas = numeroestrellas + 2;
        }
    }

    public static void imprimirPrimo(int num) {
        boolean isPrimo = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrimo = false;
            }
        }
        if (isPrimo == true) {
            System.out.println("EL NUMERO ES PRIMO");
        }
    }


}