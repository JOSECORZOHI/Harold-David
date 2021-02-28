/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoa;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class ejercicio2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
        /*Escriba una aplicación que pida al usuario que escriba dos enteros,
        que obtenga los números del usuario e imprima la suma, producto,
        diferencia de los números.*/
        System.out.println("Por favor, introdusca el primer numero");
        int num1= entrada.nextInt();
        System.out.println("Por favor, introdusca el segundo numero");
        int nume2= entrada.nextInt();
        System.out.printf("la suma de los dos numeros es: %d\n", num1 + nume2 );
        System.out.printf("la resta de los dos numeros es: %d\n", num1 - nume2);
        System.out.printf("la multiplicacion de los dos numeros es: %d\n", num1 * nume2);
    
    }
    
}