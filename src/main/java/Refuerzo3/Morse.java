package main.java.Refuerzo3;

import java.util.ArrayList;
import java.util.List;

public class Morse {
    public static void main(String[] args) {
        String cadena = "arboles";
        System.out.println(morse(cadena));
    }
    public static boolean morse(String cadena){
        String cod = "";
        char [] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String [] codigo = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == 'o'){
                cod += '-';
            }else  if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'u') {
                cod += '.';
            }
        }
        for (int i = 0; i < codigo.length; i++) {
            if(codigo[i].equals(cod)){
                if(letras[i] == Character.toLowerCase(cadena.charAt(0))){
                    return  true;
                }
            }
            }
        return false;
        }
}

