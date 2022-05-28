import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
       
        Scanner entradaPorConsola = new Scanner(System.in);
        System.out.println("Ingrese su nombre de USUARIO:");
        String nombreUsuario = entradaPorConsola.nextLine();
        System.out.println("Hola " + nombreUsuario + "!!!");
        entradaPorConsola.close();
        
    }

}