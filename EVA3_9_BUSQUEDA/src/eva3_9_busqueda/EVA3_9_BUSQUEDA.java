/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author Yisus
 */
public class EVA3_9_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner cap = new Scanner(System.in);
        
        int valor, valores[] = new int[10];
        boolean V = true;
        
        for (int i = 0; i < valores.length; i++){
            valores[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.print(" [ " + valores[i] + " ] ");
        }
        System.out.println("");
        do{
            System.out.println("INTRODUCE EL VALOR A BUSCARF EN EL ARREGLO");
            //pedir el valor
            valor = cap.nextInt();
            cap.nextLine();
            //Buscar
            //Recorrer todos los valores del arreglo
            for (int i = 0; i < valores.length; i++){
                if (valor == valores[i]){
                    V = false;
                    System.out.println("ENCONTRASTE EL VALOR, ESTA EN LA POSICION " + i);
                    break;
                }
                
                
            }
            //si esta en el arreglo salimos del ciclo
        } while(V);
    }
}
        // TODO code application logic here
    
    

