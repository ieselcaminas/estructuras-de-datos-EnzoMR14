package Comparables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 class Pais implements Comparable<Pais>{
        private String pais;
        private int analfabetos;

        Pais(String pais, int analfabetos) {
            this.pais = pais;
            this.analfabetos = analfabetos;
        }

        @Override
        public String toString() {
            return this.pais + ": " + this.analfabetos;
        }

        @Override
        public int compareTo(Pais other) {
            return this.analfabetos - other.analfabetos;
        }

    }
    public class Ejercicio2{
        public static void main(String[] args) throws IOException {
            ArrayList<Pais> paises = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("/home/enzmonrod/IdeaProjects/Streams/src/main/illiterate.csv"));
            String linea;
            String[]datos;
            reader.readLine();
            while ((linea = reader.readLine()) != null) {
                datos = linea.split(",");
                paises.add(new Pais(datos[1], Integer.parseInt(datos[8])));
            }
            paises.stream()
                    .sorted().forEach(System.out::println);


    }
    }



