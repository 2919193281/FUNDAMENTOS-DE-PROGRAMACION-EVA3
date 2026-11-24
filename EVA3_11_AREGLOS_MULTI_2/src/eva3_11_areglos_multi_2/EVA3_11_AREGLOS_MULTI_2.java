/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_areglos_multi_2;

/**
 *
 * @author Yisus
 */
public class EVA3_11_AREGLOS_MULTI_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cubo [][][]= new int[2][3][4];
        for (int i = 0; i < cubo.length; i++) {//1er dimension
            for (int j = 0; j < cubo[i].length; j++) {//2da dimensíon
                for (int k = 0; k < cubo[i][j].length; k++) {//3ra dimensíon
                    cubo[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
        //como mostramos los valores?
        for (int i = 0; i < cubo.length; i++) {//1er dimension
            for (int j = 0; j < cubo[i].length; j++) {//2da dimensíon
                for (int k = 0; k < cubo[i][j].length; k++) {//3ra dimensíon
                    System.out.print("[" + cubo [i][j][k] + "]");
                }
            System.out.println("");
            }
        }
        // TODO code application logic here
    }
    
}
