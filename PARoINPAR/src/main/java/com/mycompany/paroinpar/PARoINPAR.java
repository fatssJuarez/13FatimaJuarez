/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paroinpar;

report java.util.Scanner;
/**
 *
 * @author maria
 */
public class PARoINPAR {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println ("Programa que indica si un numero es par o inpar");
        System.out.println("Coloque un numero: ");
        int num = sc.nextInt();
        if (num % 2 == 00 ){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es inpar");
        }
    }
    
}
