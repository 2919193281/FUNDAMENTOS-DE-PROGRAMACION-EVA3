/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

/**
 *
 * @author bisonte
 */
public class EVA3_18_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamada o invocacion del metodo
        MostrarMensaje("Hola mundo");
        MostrarMensaje("Como estas");
        MostrarMensaje("Ingeneria en sistemas");
        
        int resultado = Suma(6, 10);
        System.out.println("El resultado es " + resultado);
        System.out.println("El resultado es " + Suma(60, 10));
        Suma( 10 , 10 );
        // TODO code application logic here
    }
    //Modificadores luego lugar de rentorno
                       //Debe ser un verbo
    //Siempre el inicio de una plabra es en mayuscula
    public static void MostrarMensaje(String mensaje){//Cabesera del metodo
        //Todo lo que esta en llaves es el cuerpo del metodo(definicion)
        System.out.println(mensaje);
        
    }
    
    public static int Suma(int num1 , int num2){
        int resu = num1 + num2;
        return resu;
    }
    
}
