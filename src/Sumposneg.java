import java.util.ArrayList;
import java.util.List;

public class Sumposneg {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, -6, -7, -8, 9));
        long positivos = numeros.stream().filter(integer -> integer >= 0).count();

        long negativos = numeros.stream().filter(integer -> integer < 0).count();

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
