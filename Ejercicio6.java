import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entradaPorConsola = new Scanner(System.in);
        System.out.println("Ingrese DOS numeros enteros para su potenciacion: ");
        int numPotencia1 = entradaPorConsola.nextInt();
        int numPotencia2 = entradaPorConsola.nextInt();
        int resultadoPotenciacion = 1;
        for (int i = 0; i < numPotencia2; i++) {
            resultadoPotenciacion *= numPotencia1;
        }
        System.out.println(numPotencia1 + " elevado a " + numPotencia2 + " = " + resultadoPotenciacion);
        entradaPorConsola.close();

    }

}
