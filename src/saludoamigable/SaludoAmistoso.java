/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saludoamigable;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class SaludoAmistoso {
    Scanner stdIn = new Scanner(System.in);
    String nombre;
    
    public void Saludar(){
        System.out.print("Introduce tu nombre: ");
        nombre = stdIn.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }    
        
    public static void main(String[] args) {
        SaludoAmistoso saludar = new SaludoAmistoso();
        saludar.Saludar();
    }
    
}
