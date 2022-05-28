import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entradaPorConsola = new Scanner(System.in);
        System.out.println("Ingrese un numero entero y se imprimira su secuencia:");
        int numSecuencia = entradaPorConsola.nextInt();
        for (int i = 1; i <= numSecuencia; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        entradaPorConsola.close();
    }

}
