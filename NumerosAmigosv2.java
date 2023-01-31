/*
 Dos números enteros positivos A y B son números amigos si la suma de los divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.

 Los divisores propios de un número incluyen la unidad pero no el propio número.

 Un ejemplo de números amigos son los números 220 y 284.
 Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
 La suma de los divisores propios de 220 da como resultado 284
 Los divisores propios de 284 son 1, 2, 4, 71 y 142.
 La suma de los divisores propios de 284 da como resultado 220.
 Por lo tanto 220 y 284 son amigos.

 Otras parejas de números amigos son:
 1184,   1210
 2620,   2924
 5020,   5564
 6232,   6368
 10744, 10856
 12285, 14595
 17296, 18416 
 */
package programacionbasica;

import java.util.Scanner;

/**
 * Programa que comprueba si dos números introducidos por teclado son amigos.
 *
 */
public class NumerosAmigosv2 {

    /**
     * Método main
     *
     * @param args Argumentos de la llamada al método main
     */
    public static void main(String[] args) {
        int suma, n1, n2;

        //Solicita al usuario dos números
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        n2 = sc.nextInt();

        //Llama al método que calcula la suma de los divisores del primer número
        suma = sumaDivisores(n1);

        // Si la suma de los divisores de n1 es igual a n2 continuamos el programa
        if (suma == n2) {

            //Llama al método que calcula la suma de los divisores del segundo número
            suma = sumaDivisores(n2);

            // Si la suma de los divisores de n2 es igual a n1, son amigos
            if (suma == n1) {
                System.out.println("\nSon Amigos");
            } else {
                System.out.println("\nNo son amigos");
            }
        } else { //Si la primera suma de divisores de n1 no es igual a n2 no son amigos
            System.out.println("\nNo son amigos");
        }
    }

    /**
     * Método sumaDivisores: suma todos los divisores propios de un número dado
     *
     * @param número Contiene el valor del número del que obtener sus divisores.
     * @return Devuelve la suma de los divisores del número recibido.
     */
    static int sumaDivisores(int numero) {
        int suma = 0, i;
        System.out.print("\nLos divisores propios de " + numero + " son: ");
        for (i = 1; i < numero; i++) { //Recorremos con el índice hasta el número
            if (numero % i == 0) { //Si la operación módulo (resto de división) es 0, es divisor
                suma = suma + i; //Sumamos el número a la variable suma
                System.out.print(i + ".");
            }
        }
        return suma;
    }
}
