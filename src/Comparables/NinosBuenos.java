package Comparables;

import java.util.ArrayList;
import java.util.List;

public class NinosBuenos {
    static class ninosBuenos implements Comparable<ninosBuenos>{
        private int buenComportamiento;
        private int pesoRegalos;




        public ninosBuenos(int buenComportamiento, int pesoRegalos) {
            this.buenComportamiento = buenComportamiento;
            this.pesoRegalos = pesoRegalos;
        }
        @Override
        public String toString(){
            return buenComportamiento + " - " + pesoRegalos;
        }
        @Override
        public int compareTo(ninosBuenos other) {
            if (this.buenComportamiento == other.buenComportamiento)
                return this.pesoRegalos - other.pesoRegalos;
            else
                return other.buenComportamiento - this.buenComportamiento;
        }


    }
    public static void  main(String[] args) {
        List<ninosBuenos> ninosBuenos = new ArrayList<>();
        ninosBuenos.add(new ninosBuenos(80,2));
        ninosBuenos.add(new ninosBuenos(100,1));
        ninosBuenos.add(new ninosBuenos(100,12));
        ninosBuenos.add(new ninosBuenos(1,1));
        ninosBuenos.stream().sorted().forEach(System.out::println);
    }
}





































//import java.io.*;
//import java.util.*;
//
//public class Main {
//    static class Niño implements Comparable<Niño> {
//        int b, p;
//        Niño(int b, int p) {
//            this.b = b;
//            this.p = p;
//        }
//        @Override
//        public int compareTo(Niño o) {
//            // Ordenar por b descendente
//            if (this.b != o.b) return o.b - this.b;
//            // Si hay empate, por p ascendente
//            return this.p - o.p;
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String linea;
//
//        while ((linea = br.readLine()) != null) {
//            int n = Integer.parseInt(linea.trim());
//            if (n == 0) break;
//
//            List<Niño> lista = new ArrayList<>(n);
//
//            for (int i = 0; i < n; i++) {
//                String[] partes = br.readLine().split("\\s+");
//                int b = Integer.parseInt(partes[0]);
//                int p = Integer.parseInt(partes[1]);
//                lista.add(new Niño(b, p));
//            }
//
//            Collections.sort(lista);
//
//            for (Niño x : lista) {
//                sb.append(x.b).append(" ").append(x.p).append("\n");
//            }
//            sb.append("\n");
//        }
//
//        System.out.print(sb.toString());
//    }
//}