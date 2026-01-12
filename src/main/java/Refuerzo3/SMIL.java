package Refuerzo3;

public class SMIL {
    public static void main(String[] args) {
        System.out.println("'" + sonrisas("hola :) ;-) ;) :-)").trim() + "'");
        }
        public static String sonrisas(String cadena) {
        String resultado= "";
        for (int i = 0; i < cadena.length()-1; i++) {
        if ((cadena.charAt(i) == ':' || cadena.charAt(i) == ';') && cadena.charAt(i+1) == ')') {
        resultado += " " + i;
        }else if ((cadena.charAt(i) == ':' || cadena.charAt(i) == ';') && cadena.charAt(i+1) == '-' && cadena.charAt(i+2) == ')') {
            resultado += " " + i;
        }
        }
        return resultado;
       }

    }

















//public class Smil {
//    /**
//     * Devuelve una cadena con las posiciones (separadas por espacios) donde
//     * comienza una "sonrisa" en la entrada. Se considera sonrisa a las
//     * secuencias: ":)", ";)", ":-)" o ";-)".
//     */
//    public static String sonrisas(String s) {
//        StringBuilder sb = new StringBuilder();
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//            if (c == ':' || c == ';') {
//                // patrón de 2 caracteres: ":)" o ";)"
//                if (i + 1 < n && s.charAt(i + 1) == ')') {
//                    if (sb.length() > 0) sb.append(' ');
//                    sb.append(i);
//                }
//                // patrón de 3 caracteres: ":-)" o ";-)"
//                else if (i + 2 < n && s.charAt(i + 1) == '-' && s.charAt(i + 2) == ')') {
//                    if (sb.length() > 0) sb.append(' ');
//                    sb.append(i);
//                }
//            }
//        }
//        return sb.toString();
//    }
//
//    // Método main de prueba (opcional)
//    public static void main(String[] args) {
//        System.out.println("'" + sonrisas("hola :) ;-) ;) :-)").trim() + "'"); // espera "5 8 12 15"
//        System.out.println("'" + sonrisas(":)?; hola  -) ;) :--) adiós").trim() + "'"); // espera "0 14"
//    }
//}