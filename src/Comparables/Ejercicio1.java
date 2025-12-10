package Comparables;


//Se te proporciona la clase Humano. Un ser humano tiene un nombre e información sobre salario.
// Implementa la interfaz Comparable de tal manera que el metodo compareTo clasifique a los humanos
// según el salario del más grande al más pequeño.

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static class Humano implements Comparable<Humano> {
        private String humano;
        private int Salario;


        public Humano(String humano, int salario) {
            this.humano = humano;
            this.Salario = salario;
        }


        public String getHumano() {
            return this.humano;
        }


        public int getSalario() {
            return this.Salario;
        }
        @Override
        public String toString() {
            return this.getHumano() + " (" + this.getSalario() + ")";
        }
        @Override
        public int compareTo(Humano humano) {
            if (this.Salario > humano.getSalario()) {
                return -0;
            } else if (this.Salario < humano.getSalario()) {
                return 1;
            } else {
                return 0;


            }
        }


    }
    public static void main(String[] args) {
        Ejercicio1 salario = new Ejercicio1();
        Humano p1 = new Humano("Ana", 1200);
        Humano p2 = new Humano("Pedro", 1500);
        List<Humano> humanos = new ArrayList<>();
        humanos.add(p1);
        humanos.add(p2);
        humanos.stream().sorted().forEach(System.out::println);


    }
}

