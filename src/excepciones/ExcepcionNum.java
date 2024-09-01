/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author angie
 */
public class ExcepcionNum extends Exception {
    public ExcepcionNum(){
        super("No se permiten numeros en la contraseña");
    }
}
