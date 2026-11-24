/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_20_metodos3;

/**
 *
 * @author bisonte
 */
public class EVA3_20_METODOS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos[] = {100 ,200 ,300, 400 ,500 ,600 ,700 ,800 ,900, 1000};
        Arreglos(datos);
        // TODO code application logic here
    }
    public static void Arreglos(int [] arreglos){
        for (int i = 0; i < arreglos.length; i++) {
            System.out.print(" { " + arreglos[i] + " } " );
            arreglos[i] = (int)(Math.random() * 10);
        }
        System.out.println("");
    }
    
}
