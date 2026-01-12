package Refuerzo3;

import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        System.out.println(mult(new int[] {8,3,12,6,24,14,12,9,70,5}));
    }
    public static String mult (int[] num) {
        String resultado = "";
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i] % num[j] == 0) {
                    resultado += num[i] + " ";
                    break;
                }
            }
        }
        return resultado;
    }
}
