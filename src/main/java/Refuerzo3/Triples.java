package Refuerzo3;

import java.util.Arrays;

public class Triples {
    public static int contartriple (int[] num) {
        Arrays.sort(num);
        int contador = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if (num[j] + num[k] == num[i]) {
                        contador++;
                    }
                }
            }
        }
        return contador;
    }
    public static void main (String[] args) {
        System.out.println(contartriple(new int[]{1,5,3,2}));
    }
}
