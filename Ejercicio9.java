import java.io.IOException;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) throws IOException {
        Scanner entradaPorConsola = new Scanner(System.in);
        String texto;
        char caracter;
        int numeroDeVeces = 0;
        do {
            System.out.println("Introduce una frase, un texto, etc: ");
            texto = entradaPorConsola.nextLine();
        } while (texto.isEmpty());
        System.out.print("Introduce un carácter, para calcular las veces que aparece: ");
        caracter = (char) System.in.read();
        numeroDeVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");  
        entradaPorConsola.close();                 
    }


       public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
                posicion = cadena.indexOf(caracter);
        while (posicion != -1) { 
            contador++;          
                        posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
   }
    
}
