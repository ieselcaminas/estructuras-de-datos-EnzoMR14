public class colgadas {
    static java.util.Scanner in;


    public static void casoDePrueba() {
        String cadena = in.next();


        if(cadena.toLowerCase().matches("colgadas"))
            System.out.println("Bien");
        else if (cadena.toUpperCase().matches("COLGANTES"))
            System.out.println("Mal");


        // TU CÓDIGO AQUÍ


    } // casoDePrueba


    public static void main(String[] args) {


        in = new java.util.Scanner(System.in);


        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
} // class solution