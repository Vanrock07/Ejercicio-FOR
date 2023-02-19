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
        int numero, cont;
        String asterisco = "*";
       
            for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            System.out.println("Escriba un numero");

            numero = leernum.nextInt();
            
            while(numero<1 || numero>20) {                //validar si el numero esta entre 1 y 20
            System.out.println("El numero esta fuera del limite");
            System.out.println("Intente nuevamente");
            numero = leernum.nextInt();
        }                
                    System.out.print( + numero );        //Aqui se crea
                                                         //la iteracion para
                    for (int j = 0; j < numero; j++) {   //escribir los asteriscos
                    System.out.print( asterisco ); 
                    
                }
                  
          
        }
    }
    }
   
