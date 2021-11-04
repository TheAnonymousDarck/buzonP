/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public class Buzon {
    String nombre;
    int tamano;
    
    
    public Buzon(int tamano, String nombre){
        this.tamano = tamano;
        this.nombre = nombre;
        String[] mensaje = new String[tamano];
    } 
    
    void enviar(){
        System.out.println("Estas enviando un mensade desde" + nombre);
    }
    
    void recibir(){
        System.out.println("Estas recibiendo un mensade desde" + nombre);
    }
}
