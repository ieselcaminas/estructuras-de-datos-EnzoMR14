package OpIntermedias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Introduce numeros (num negativos para finalizar): ");

        while (true) {
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }
            numeros.add(n);
        }
        System.out.println("Entre el 1 y 5 esta:");
        numeros.stream().filter(n -> n >= 1 && n <= 5).forEach(System.out::println);

    }
}
