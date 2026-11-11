/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_restaurante;

/**
 *
 * @author Yisus
 */
public class EVA3_7_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] menu = {"Tacos","Burritos","Tortas","Enchiladas","Tamales","Posole","Chilaquiles","Gorditas","Ensalada","Arros",};
        double[] pre = {20.12, 27.43, 73.23, 45.23, 32.42, 34.35, 42.11, 12.33, 34.24, 24.24};
        
        
        for (int i = 0; i < menu.length; i++) {
            System.out.println(" - " + menu[i] + " --------- " + pre[i]);
            
        }
        
        // TODO code application logic here
    }
    
}
