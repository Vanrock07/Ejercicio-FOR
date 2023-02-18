/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkgfor;

   /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
         ingresado seguido de tantos asteriscos como indique su valor */

import java.util.Scanner;

/**
 *
 * @author Ivan Ramirez
 */
public class EjercicioFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leernum = new Scanner(System.in);
        int numero;
        String asterisco = "*";
       
        System.out.println("Escriba algunos numeros");
        
        for (int i = 0; i < 4; i++) { 
            numero = leernum.nextInt();
               
            if (numero>0 && numero <21) { 
                    System.out.print( + numero ); 
                    
                for (int j = 0; j < numero; j++) {
                    System.out.print( asterisco ); 
                }
                  
            } else 
                System.out.println("El numero esta fuera del limite");   
        }
    }
    
}
