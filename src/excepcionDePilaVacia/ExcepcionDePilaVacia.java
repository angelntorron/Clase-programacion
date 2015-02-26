/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionDePilaVacia;

/**
 *
 * @author Caco
 */
public class ExcepcionDePilaVacia extends Exception{ //Exception es una clase de Java
    public ExcepcionDePilaVacia(String descripcion){
        super(descripcion);
    }
}
