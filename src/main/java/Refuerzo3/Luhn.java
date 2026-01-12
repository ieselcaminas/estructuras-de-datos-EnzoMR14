package main.java.Refuerzo3;

public class Luhn {
    public static void main(String[] args) {
        String numeros = "123456789";
        System.out.println();
    }
    public static boolean calcular (String codigo){
        int numero=Integer.parseInt("" + codigo.charAt(0));
        int resultado = 0;
        int contador = 0;
        for (int i = codigo.length() - 1; i >= 0; i++) {
            if (i % 2 == 0) {
                numero = numero + 2;
            }

        }



}

