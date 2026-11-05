/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_areglos;



/**
 *
 * @author Usuario
 */
public class EVA3_1_AREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      //El areglo gurada datos de un solo tipo 
      //Guarda bastantes datos 
      //No cambuia de tamaño el numero de datos se define al princiio y no puede cambiar el tamaño 
      //Funciona como un indice
      //objetos
      int []areglos;
      areglos = new int[10]; //IMPORTANTE la cantida de memoria que se tiene que ocupar
      // 1 2 3 4 5 6 7 8 9 
      areglos[0] = 100;
      areglos[1] = 200;
      areglos[2] = 300;
      areglos[3] = 400;
      areglos[4] = 500;
      areglos[5] = 600;
      areglos[6] = 700;
      areglos[7] = 800;
      areglos[8] = 900;
      areglos[9] = 1000;
            
      System.out.println(areglos[0]);
      System.out.println(areglos[1]);
      System.out.println(areglos[2]);
      System.out.println(areglos[3]);
      System.out.println(areglos[4]);
      System.out.println(areglos[5]);
      System.out.println(areglos[6]);
      System.out.println(areglos[7]);
      System.out.println(areglos[8]);
      System.out.println(areglos[9]);
      
      for (int i = 0; i <= 10 ; i++ ){
         areglos[0] = (int)(Math.random() * 100);
         System.out.print(" - " + areglos[0] + " - ");
        
         
      }
      
      // TODO code application logic here
   }
   
}
