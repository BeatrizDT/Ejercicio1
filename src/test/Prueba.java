/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import negocio.Pagable;
import modelo.Persona;
/**
 *
 * @author Beatriz Díaz Tortosa
 */
public class Prueba {
  
    public static void main(String [] args){
        Persona persona = new Persona();
        persona.nombre="Beatriz";
        persona.apellidos="Diaz Tortosa";
        persona.edad=25;
        persona.pagar();
        
    }
}
