/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Ismael
 */
public class Utilidades_Control {
    
    
    public static boolean contieneSoloLetras(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean contieneSoloNumeros(String cadena) {
    // Si la cadena está vacía, debemos devolver false
    if (cadena.length() == 0) {
        return false;
    }
    for (int x = 0; x < cadena.length(); x++) {
        char c = cadena.charAt(x);
        // Si no está entre 0 y 9
        if (!(c >= '0' && c <= '9')) {
            return false;
        }
    }
    return true;
}
    
    
    
}
