/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class Excepciones {

      public static void verificar(String pass) throws ExcepcionNum
    {
        int cant = pass.length();
        for(int i = 0; i < cant; i++){
        char bit = pass.charAt(i);
            if(Character.isDigit(bit)){
                throw new ExcepcionNum();
            }
        }
    }
    
    public static void main(String[] args) {
        String password = "";
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Cree una contraseña\n");
            System.out.print("Esta no debe contener números\n");
            password = entrada.nextLine();
            verificar(password);
            
        }
        catch (ExcepcionNum e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("La contraseña es: " + password + "\n\n");
        }
        System.out.print("Programa terminado");
    }
   
}
