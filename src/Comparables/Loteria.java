package Comparables;

import java.util.ArrayList;
import java.util.List;

public class Loteria{
    static class Localidades implements Comparable<Localidades>, Comparables.Localidades {
        private int invertido;
        private int ganado;

        public Localidades(int invertido, int ganado) {
            this.invertido = invertido;
            this.ganado = ganado;
        }

        @Override
        public String compareTO() {
            return invertido + "-" + ganado;
        }

        @Override
        public int compareTo(Localidades other) {
            if (this.invertido == other.invertido) {
                return this.ganado - other.ganado;
            }

            return 0;
        }

        public static void main(String[] args) {
            List<Localidades> lista = new ArrayList();

        }
    }}