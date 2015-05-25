/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import negocio.Pagable;
/**
 *
 * @author Beatriz Díaz Tortosa
 */
public class Persona {
    
    public String nombre, apellidos;
    public int edad;
    
    public void pagar(){
        System.out.println("Pagando...");
    }
}
