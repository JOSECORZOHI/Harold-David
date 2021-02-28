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
public class ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /*Escriba una aplicación que reciba tres valores decimales del usuario y muestre la suma, promedio, producto, cociente
y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas*/
        System.out.println("Por favor, introdusca el primer numero");
        double num1= entrada.nextDouble();
        System.out.println("Por favor, introdusca el segundo numero");
        double num2= entrada.nextDouble();
        System.out.println("Por favor, introdusca el trcer numero");
        double num3= entrada.nextDouble();
        System.out.printf("la suma de los tres numeros es: %2f\n", num1 + num2 + num3 );
        System.out.printf("El promedio de los 3 numeros decimales es: %.2f\n", (num1 + num2 + num3)/3);
        System.out.printf("El producto es: %.2f\n ", num1 * num2 * num3);
        System.out.printf("el cosiente es:%.2f\n  ", (num1 + num2 + num3)/3);
    }
    
}