import java.util.Scanner;

public class SistemaVacacional{
  public static void main(String args[]){

   Scanner entrada = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;

   
   System.out.println("*******************************************************");
   System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
   System.out.println("*******************************************************");
   System.out.println("");
   System.out.println("");

   System.out.print("¿Cual es el nombre del trabajador?: ");
   nombre = entrada.nextLine();
   System.out.println("");

   System.out.print("¿Cuanto tiempo de servicio tiene el trabajador?: ");
   antiguedad = entrada.nextInt();
   System.out.println("");


   System.out.println("¿Cual es la clave del trabajador?: ");
   clave = entrada.nextInt();
   System.out.println("");

   if(clave == 1){
     
      if(antiguedad == 1){
        System.out.println(nombre + " es acredor a 6 dias de vacaciones");
      } else if(antiguedad >= 2 && antiguedad <= 6){
         System.out.println(nombre + " es acredor a 14 dias de vacaciones");
      } else if(antiguedad >= 7){
        System.out.println(nombre + " es acreedor a 20 dias de vacaciones");
      }

   } else if(clave == 2){

      if(antiguedad == 1){
        System.out.println(nombre + " es acredor a 7 dias de vacaciones");
      } else if(antiguedad >= 2 && antiguedad <= 6){
         System.out.println(nombre + " es acredor a 15 dias de vacaciones");
      } else if(antiguedad >= 7){
        System.out.println(nombre + " es acreedor a 22 dias de vacaciones");
      }

   } else if(clave == 3){

      if(antiguedad == 1){
        System.out.println(nombre + " es acredor a 10 dias de vacaciones");
      } else if(antiguedad >= 2 && antiguedad <= 6){
         System.out.println(nombre + " es acredor a 20 dias de vacaciones");
      } else if(antiguedad >= 7){
        System.out.println(nombre + " es acreedor a 30 dias de vacaciones");
      }

   } else {
     System.out.println("La clave de departamento ingresada no existe");
   }
 }
}