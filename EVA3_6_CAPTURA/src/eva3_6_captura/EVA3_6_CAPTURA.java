/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_6_CAPTURA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner cap = new Scanner(System.in);
      String nom[];
      int edad[];
      int cant;
      
      System.out.println("Cantidad de clientes a capturar");
      cant = cap.nextInt();
      cap.nextLine();
      nom = new String[cant];
      edad = new int[cant];
      
      for(int i = 0; i < cant; i++){
         System.out.println("introduce nombre del cliente");
         nom[i] = cap.nextLine();
         System.out.println("Introduce su edad");
         edad[i] = cap.nextInt();
         cap.nextLine();
      }
      for (int i = 0; i < nom.length; i++) {
         System.out.println(nom[i]);
         System.out.println(edad[i]);
      }
      
      
      // TODO code application logic here
   }
   
}
