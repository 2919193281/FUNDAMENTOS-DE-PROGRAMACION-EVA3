/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_menu_2;

import java.util.Scanner;

/**
 *
 * @author Yisus
 */
public class EVA3_5_MENU_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] opciones = {"Ventas","Clientes","Provedores","Salir"};
        int num;
        boolean H = true;
        
        System.out.println("----------Menu----------");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println( i + " - " + opciones[i]);     
        }
        do {
            Scanner cap = new Scanner(System.in);
            System.out.println("Seleciona una opcion");
            num = cap.nextInt();
            switch (num) {
                case 0:
                    System.out.println("Menu - " + opciones[0]);
                    break;
                case 1:
                    System.out.println("Menu - " + opciones[1]);
                    break;
                case 2:
                    System.out.println("Menu - " + opciones[2]);
                    break;
                case 3:
                    System.out.println(opciones[3]);
                    H = false;
                    break;
            }
            
        } while (H);
        // TODO code application logic here
    }
    
}
