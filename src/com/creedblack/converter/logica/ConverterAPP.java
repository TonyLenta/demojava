package com.creedblack.converter.logica;

import java.util.Scanner;

public class ConverterAPP {
/*

    public static void main(String[] args) {
         double celsius=0;
         double farenheit=0;


         Scanner sc= new Scanner(System.in);

         celsius = sc.nextDouble();


         System.out.println(celsius);


         sc.nextLine();

         String cadena = sc.nextLine();

        System.out.println(cadena);


        // celsius=(5*(farenheit-32))/9;

        //System.out.println(celsius);

        /*farenheit=(9*celsius+(32*5))/5;

        System.out.println(farenheit);*/


       /* celsius=convierteFarenheitaCelius(farenheit);

        System.out.println("C="+ celsius);

       farenheit=convierteCeliusaFarenheit(celsius);

        System.out.println("F="+ farenheit);

    }


    */


      /*
      * (viibilidad) static tipoDato nombreMetodo (parametros)
      *
      * */

      public static double convierteFarenheitaCelius(double farenheit){

         double celsius=(5*(farenheit-32))/9;

         return celsius;
      }


    public static double convierteCeliusaFarenheit(double celsius){

        double farenheit=(9*celsius+(32*5))/5;

        return farenheit;
    }

}
