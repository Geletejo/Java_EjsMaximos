/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class EjemplosConsola {
    //Declaro un array de ints de instancia.
    int[] listaNumeros = {200, 31, 27, 2, 5, 99};
    private int[] maximos (int[] lista){
        //Declaramos un array de dos elementos para guardar el máximo y el segundo maximo.
        int[] listaMaximos = {lista[0], lista[0]};
        for (int i=0; i< lista.length; i++){
            if (listaMaximos[0] < lista[i]){
                listaMaximos[1] = listaMaximos[0];
                listaMaximos[0] = lista[i];
            }else{
                listaMaximos[1] = lista[1];
            }
        }
        
        return listaMaximos;
}


//El metodo maximos va a calcular el maximo y el segundo maximo de la lista.
    
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
        //Esto es para imprimir.
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
         
    }
    
}
